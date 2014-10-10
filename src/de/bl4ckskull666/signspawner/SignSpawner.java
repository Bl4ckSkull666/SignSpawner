/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package de.bl4ckskull666.signspawner;

import de.bl4ckskull666.signspawner.utils.EntityEquip;
import de.bl4ckskull666.signspawner.utils.Rnd;
import de.bl4ckskull666.signspawner.utils.Util;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Sign;
import org.bukkit.configuration.Configuration;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockRedstoneEvent;
import org.bukkit.event.block.SignChangeEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitTask;

/**
 *
 * @author Pappi
 */
public class SignSpawner extends JavaPlugin implements Listener {
    private static final Map<String, Equipment> _equips = new HashMap<>();
    private final Map<Location, Boolean> _signActive = new HashMap<>();
    private final Map<Location, BukkitTask> _signTasks = new HashMap<>();
    private final Map<String, ArrayList<EntityType>> _EntityGroups = new HashMap<>();
    private static final ArrayList<String> _avalibleEquips = new ArrayList<>();
    private static SignSpawner _plugin;
    
    private int _minWaitToSpawn;
    private int _maxWaitToSpawn;

    @Override
    public void onEnable() {
        _avalibleEquips.add("hand");
        _avalibleEquips.add("helmet");
        _avalibleEquips.add("armor");
        _avalibleEquips.add("legging");
        _avalibleEquips.add("boot");
        _avalibleEquips.add("effect");
        _plugin = this;
        Configuration config = getConfig();
        if(!getDataFolder().exists()) {
            getDataFolder().mkdir();
            config.options().copyDefaults(true);
        }
        for(String key : config.getConfigurationSection("entity").getKeys(false)) {
            _EntityGroups.put(key.toLowerCase(), Util.getEntityList(config.getStringList("entity." + key)));
        }
        
        for(String key : config.getConfigurationSection("equipment").getKeys(false)) {
            if(!config.isConfigurationSection("equipment." + key)) {
                getLogger().log(Level.INFO, "Ignore Equipment {0} while wrong configurated.", key);
                continue;
            }
            
            if(EntityType.valueOf(key.toUpperCase()) == null) {
                getLogger().log(Level.INFO, "Ignore {0}. It''s not a correct EntityType.", key);
                continue;
            }
            
            setEquipment(config.getConfigurationSection("equipment." + key), key.toLowerCase());
        }
        
        _minWaitToSpawn = config.getInt("spawnwait.min", 5)*20;
        _maxWaitToSpawn = config.getInt("spawnwait.max", 30)*20;
        
        saveConfig();
        
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(this, this);
        
        _plugin = this;
    }
    
    @Override
    public void onDisable() {
        PluginManager pm = getServer().getPluginManager();
        pm.disablePlugin(this);
    }
    
    @EventHandler
    public void SignPlace(SignChangeEvent e) {
        if(!(e.getLine(0).startsWith("[") && e.getLine(0).endsWith("]")))
            return;
        
        String txt = e.getLine(0).replace("[", "").replace("]", "");
        if(!txt.equalsIgnoreCase("spawner"))
            return;
        
        if(!e.getPlayer().hasPermission("SignSpawner.create")) {
            e.getPlayer().sendMessage(new String[] {"§cYou are not allow to use this Type of Sign.","§4Du hast nicht die erlaubnis diese Art von Schild zu verwenden."});
            e.getBlock().breakNaturally(new ItemStack(e.getBlock().getState().getType(), 1));
            e.setCancelled(true);
            return;
        }
        
        if(e.getLine(1).isEmpty()) {
            e.getPlayer().sendMessage(new String[] {"§cPlease enter in Line 2 the Type or Group of Spawn.","§4Bitte schreibe in Zeile 2 den Type oder Gruppe des Spawns."});
            e.getBlock().breakNaturally(new ItemStack(e.getBlock().getState().getType(), 1));
            e.setCancelled(true);
            return;
        }
        
        if(!_EntityGroups.containsKey(e.getLine(1).toLowerCase())) {
            e.getPlayer().sendMessage(new String[] {"§cI'm Sorry, but we can't find your Type or Group of Spawn.","§4Ich bitte um entschuldigung, aber der angegebene Spawn Type oder die Gruppe kann nicht gefunden werden."});
            e.getBlock().breakNaturally(new ItemStack(e.getBlock().getState().getType(), 1));
            e.setCancelled(true);
            return;
        }
        
        if(e.getLine(3).isEmpty()) {
            e.getPlayer().sendMessage(new String[] {"§cPlease add spawn coordinates relative to the Sign in X:Y:Z format.","§4Bitte schreibe in Zeile 3 die Relative Spawn Koordinaten zum Schild im Format X:Y:Z."});
            e.getBlock().breakNaturally(new ItemStack(e.getBlock().getState().getType(), 1));
            e.setCancelled(true);
            return;
        }
        
        e.setLine(0, ChatColor.DARK_GREEN + "[" + ChatColor.DARK_PURPLE + "Spawner" + ChatColor.DARK_GREEN + "]");
        e.getPlayer().sendMessage(new String[] {"§2Spawner Sign successful created","§aSpawner Schild erfolgreich erstellt."});
    }
    
    @EventHandler
    public void BlockRedstone(BlockRedstoneEvent e) {
        if(e.getBlock() == null)
            return;
        
        Material mat = e.getBlock().getType();
        
        if(!mat.equals(Material.SIGN) && !mat.equals(Material.SIGN_POST) && !mat.equals(Material.WALL_SIGN))
            return;
        
        Sign s = (Sign)e.getBlock().getState();
        
        String line1 = ChatColor.stripColor(s.getLine(0));
        
        if(!(line1.startsWith("[") && line1.contains("Spawner") && line1.endsWith("]")))
            return;
        
        if(s.getLine(1).isEmpty() || s.getLine(3).isEmpty())
            return;

        String et;
        if(!_EntityGroups.containsKey(s.getLine(1).toLowerCase()))
            return;
        else
            et = s.getLine(1).toLowerCase();
        
        if(e.getNewCurrent() == 0) {
            _signActive.put(s.getLocation(), false);
            if(_signTasks.containsKey(s.getLocation())) {
                _signTasks.get(s.getLocation()).cancel();
                _signTasks.remove(s.getLocation());
            }
            return;
        } else {
            if(_signActive.containsKey(s.getLocation())) {
                if(_signActive.get(s.getLocation()))
                    return;
            }
            _signActive.put(s.getLocation(), true);
        }

        if(_signTasks.containsKey(s.getLocation()))
            return;
        
        int minWait = _minWaitToSpawn, maxWait = _maxWaitToSpawn;
        if(!s.getLine(2).isEmpty()) {
            String[] numb = s.getLine(2).split("\\:");
            if(numb.length == 2) {
                if(Util.isNumeric(numb[0]) && Util.isNumeric(numb[1])) {
                    minWait = Integer.parseInt(numb[0])*20;
                    maxWait = Integer.parseInt(numb[1])*20;
                }
            } else if(numb.length == 1) {
                if(Util.isNumeric(numb[0]))
                    maxWait = Integer.parseInt(numb[0])*20;
            }
        }
        
        String[] poss = s.getLine(3).split("\\:");
        if(poss.length < 3 || poss.length > 3)
            return;
        
        if(!Util.isNumeric(poss[0]) || !Util.isNumeric(poss[1]) || !Util.isNumeric(poss[2]))
            return;

        int x = Integer.parseInt(poss[0]), y = Integer.parseInt(poss[1]), z = Integer.parseInt(poss[2]);
        
        x = s.getLocation().getBlockX()+x;
        y = s.getLocation().getBlockY()+y;
        z = s.getLocation().getBlockZ()+z;

        Location spawnLoc = new Location(s.getWorld(), (double)x, (double)y, (double)z);
        
        
        BukkitTask task;
        if(minWait == 0)
            task = Bukkit.getScheduler().runTask(this, new SpawnEntity(minWait, maxWait, spawnLoc, et, s.getLocation()));
        else
            task = Bukkit.getScheduler().runTaskLater(this, new SpawnEntity(minWait, maxWait, spawnLoc, et, s.getLocation()), Rnd.get(minWait, maxWait));

        _signTasks.put(s.getLocation(), task);
    }
    
    public static Map<String, Equipment> getEquipments() {
        return _equips;
    }
    
    public static boolean isEquipmentType(String t) {
        return _avalibleEquips.contains(t.toLowerCase());
    }
    
    public static SignSpawner getInstance() {
        return _plugin;
    }
    
    public void setEquipment(ConfigurationSection cs, String mob) {
        for(String key : cs.getKeys(false)) {
            if(cs.isString(key)) {
                Equipment.setName(mob.toLowerCase(), cs.getString(key, mob));
                continue;
            }
            if(cs.isConfigurationSection(key)) {
                Equipment.setEquip(mob.toLowerCase(), key, cs.getStringList(key + ".item"), cs.getInt(key + ".chance", 50), (float)cs.getDouble(key + ".drop", 50d));
                continue;
            }
            getLogger().log(Level.INFO, "Wrong configuration on {0}.{1}", new Object[]{cs.getCurrentPath(), key});
        }
    }
    
    public class SpawnEntity implements Runnable {
        private final int _min;
        private final int _max;
        private final Location _spawn;
        private final Location _sign;
        private final String _ent;
        
        public SpawnEntity(int min, int max, Location spawn, String ent, Location sign) {
            _min = min;
            _max = max;
            _spawn = spawn;
            _ent = ent;
            _sign = sign;
        }

        @Override
        public void run() {
            if(_signTasks.containsKey(_sign))
                _signTasks.get(_sign).cancel();
            EntityType et = _EntityGroups.get(_ent).get(Rnd.get(0,_EntityGroups.get(_ent).size()-1));
            Entity e = _spawn.getWorld().spawnEntity(_spawn, et);
            EntityEquip.EquipEntity(e);
            _spawn.getWorld().getEntities().add(e);
            BukkitTask task = Bukkit.getScheduler().runTaskLater(SignSpawner.getInstance(), new SpawnEntity(_min, _max, _spawn, _ent, _sign), Rnd.get(_min, _max));
            _signTasks.put(_sign, task);
        }
    }
}