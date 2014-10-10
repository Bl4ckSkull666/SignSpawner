package de.bl4ckskull666.signspawner;

import de.bl4ckskull666.signspawner.utils.Rnd;
import de.bl4ckskull666.signspawner.utils.Util;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import org.bukkit.Material;
import org.bukkit.potion.PotionEffectType;

public class Equipment {
    
    //Type , ArrayList<Items>
    private final Map<String, ArrayList<Material>> _items = new HashMap<>();
    //Type , ArrayList<PotionEffectType>
    private final ArrayList<Effects> _effects = new ArrayList<>();
    //Type, Drop Chance
    private final Map<String, Float> _drop = new HashMap<>();
    //Type, Equip Chance
    private final Map<String, Integer> _chance = new HashMap<>();
    //Name of the NPC
    private String _name = "";
    
    public Equipment() {
        
    }
    
    public static boolean hasEquipment(String mob) {
        return SignSpawner.getEquipments().containsKey(mob.toLowerCase());
    }
    
    public static Equipment getEquipment(String mob) {
        if(!SignSpawner.getEquipments().containsKey(mob.toLowerCase()))
            SignSpawner.getEquipments().put(mob.toLowerCase(), new Equipment());
        return SignSpawner.getEquipments().get(mob.toLowerCase());
    }
    
    public static void setName(String mob, String name) {
        if(!SignSpawner.getEquipments().containsKey(mob.toLowerCase()))
            SignSpawner.getEquipments().put(mob.toLowerCase(), new Equipment());
        SignSpawner.getEquipments().get(mob.toLowerCase()).setName(name);
    }
    
    public static String getName(String mob) {
        if(!SignSpawner.getEquipments().containsKey(mob.toLowerCase()))
            return "";
        return SignSpawner.getEquipments().get(mob.toLowerCase()).getName();
    }
    
    public static boolean isEquips(String m) {
        return SignSpawner.getEquipments().containsKey(m.toLowerCase())?SignSpawner.getEquipments().get(m).hasEquips():false;
    }
    
    public static Map<String, ArrayList<Material>> getEquips(String m) {
        return SignSpawner.getEquipments().containsKey(m.toLowerCase())?SignSpawner.getEquipments().get(m.toLowerCase())._items:null;
    }
    
    public static boolean isEquipsForType(String m, String t) {
        if(!isEquips(m.toLowerCase()))
            return false;
        return SignSpawner.getEquipments().get(m.toLowerCase()).isTypeDrop(t);
    }
    
    public static Material getEquip(String m, String t) {
        if(!isEquips(m.toLowerCase()))
            return null;
        return SignSpawner.getEquipments().get(m.toLowerCase()).getDrop(t);
    }
    
    public static float getDropChance(String m, String t) {
        if(!isEquips(m.toLowerCase()))
            return 0.0f;
        
        return SignSpawner.getEquipments().get(m.toLowerCase()).getDropChance(t);
    }
    
    public static boolean getEquipChance(String m, String t) {
        if(!isEquips(m.toLowerCase()))
            return false;
        
        return (Rnd.get(1, 100) <= SignSpawner.getEquipments().get(m.toLowerCase()).getEquipChance(t));
    }
    
    public static void setEquip(String mob, String type, List<String> item, int chance, float drop) {
        if(!SignSpawner.isEquipmentType(type))
            return;
        
        Equipment equip = getEquipment(mob.toLowerCase());
        for(String i: item) {
            String[] it = i.split("\\:");
            if(Material.valueOf(it[0].toUpperCase()) != null) {
                equip.addItem(type, Material.valueOf(it[0].toUpperCase()));
                continue;
            }
            
            if(PotionEffectType.getByName(it[0].toUpperCase()) != null) {
                if(it.length < 3) {
                    SignSpawner.getInstance().getLogger().log(Level.INFO, "Wrong Configuration of PotionEffect {0}. Need Format PotionEffectType:Stage:Time", it[0]);
                    continue;
                }
                
                if(!Util.isNumeric(it[1]) || !Util.isNumeric(it[2])) {
                    SignSpawner.getInstance().getLogger().log(Level.INFO, "Wrong Configuration of PotionEffect {0} in {1} or {2} one of this is not a number.", new Object[]{it[0], it[1], it[2]});
                    continue;
                }
                
                Effects eff = new Effects(PotionEffectType.getByName(it[0]), Integer.parseInt(it[1]), Integer.parseInt(it[2]));
                equip.addEffect(eff);
                continue;
            }
            SignSpawner.getInstance().getLogger().log(Level.INFO, "Can''t found {0} as Material and PotionEffectType.", i);
        }
        equip.setDropChance(type, drop);
        equip.setEquipChance(type, chance);
        SignSpawner.getEquipments().put(mob.toLowerCase(), equip);
    }
    
    public boolean hasEffects() {
        return !_effects.isEmpty();
    }
    
    public boolean hasEquips() {
        return _items.size() > 0;
    }
    
    public boolean isTypeDrop(String t) {
        return _items.containsKey(t);
    }
    
    public Material getDrop(String t) {
        if(!isTypeDrop(t))
            return null;
        Material mat = _items.get(t).get(Rnd.get(0,_items.get(t).size()-1));
        SignSpawner.getInstance().getLogger().log(Level.INFO, "Set {0} for {1}.", new Object[]{mat.name(), t});
        return mat;
    }
    
    public Effects getEffect() {
        if(_effects.isEmpty())
            return null;
        return _effects.get(Rnd.get(0,_effects.size()-1));
    }
    
    public void addItem(String t, Material m) {
        if(!_items.containsKey(t))
            _items.put(t, new ArrayList<Material>());
        
        _items.get(t).add(m);
    }
    
    public void addEffect(Effects eff) {
        _effects.add(eff);
    }
    
    public void setDropChance(String t, float f) {
        _drop.put(t, f);
    }
    
    public float getDropChance(String t) {
        return _drop.containsKey(t)?_drop.get(t):0.0f;
    }
    
    public void setEquipChance(String t, int i) {
        _chance.put(t, i);
    }
    
    public int getEquipChance(String t) {
        return _chance.containsKey(t)?_chance.get(t):0;
    }
    
    public void setName(String n) {
        _name = n;
    }
    
    public String getName() {
        return _name;
    }
}