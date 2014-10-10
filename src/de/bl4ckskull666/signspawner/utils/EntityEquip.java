package de.bl4ckskull666.signspawner.utils;

import de.bl4ckskull666.signspawner.Effects;
import de.bl4ckskull666.signspawner.Equipment;
import de.bl4ckskull666.signspawner.SignSpawner;
import java.util.logging.Level;
import org.bukkit.entity.*;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;

public final class EntityEquip {
    public static void bat(Entity e) {
        Bat b = (Bat)e;
        
        String name = b.getType().name().toLowerCase();
        
        if(!Equipment.hasEquipment(name))
            return;
        
        if(!Equipment.getName(name).isEmpty()) {
            b.setCustomName(Equipment.getName(name));
            b.setCustomNameVisible(true);
        }
        
        if(Equipment.getEquipment(name).hasEffects()) {
            Effects eff = Equipment.getEquipment(name).getEffect();
            b.addPotionEffect(new PotionEffect(eff.getEffect(), eff.getLength(), eff.getStage()));
        }
        
        if(!Equipment.isEquips(name))
            return;
            
        if(Equipment.isEquipsForType(name, "hand") && Equipment.getEquipChance(name, "hand")) {
            b.getEquipment().setItemInHand(new ItemStack(Equipment.getEquip(name, "hand")));
            b.getEquipment().setItemInHandDropChance(Equipment.getDropChance(name, "hand"));
        }
        if(Equipment.isEquipsForType(name, "helmet") && Equipment.getEquipChance(name, "helmet")) {
            b.getEquipment().setHelmet(new ItemStack(Equipment.getEquip(name, "helmet")));
            b.getEquipment().setHelmetDropChance(Equipment.getDropChance(name, "helmet"));
        }
        if(Equipment.isEquipsForType(name, "armor") && Equipment.getEquipChance(name, "armor")) {
            b.getEquipment().setChestplate(new ItemStack(Equipment.getEquip(name, "armor")));
            b.getEquipment().setChestplateDropChance(Equipment.getDropChance(name, "armor"));
        }
        if(Equipment.isEquipsForType(name, "legging") && Equipment.getEquipChance(name, "legging")) {
            b.getEquipment().setLeggings(new ItemStack(Equipment.getEquip(name, "legging")));
            b.getEquipment().setLeggingsDropChance(Equipment.getDropChance(name, "legging"));
        }
        if(Equipment.isEquipsForType(name, "boot") && Equipment.getEquipChance(name, "boot")) {
            b.getEquipment().setBoots(new ItemStack(Equipment.getEquip(name, "boot")));
            b.getEquipment().setBootsDropChance(Equipment.getDropChance(name, "boot"));
        }
    }
    
    public static void blaze(Entity e) {
        Blaze b = (Blaze)e;
        
        String name = b.getType().name().toLowerCase();
        
        if(!Equipment.hasEquipment(name))
            return;
        
        if(!Equipment.getName(name).isEmpty()) {
            b.setCustomName(Equipment.getName(name));
            b.setCustomNameVisible(true);
        }
        
        if(Equipment.getEquipment(name).hasEffects()) {
            Effects eff = Equipment.getEquipment(name).getEffect();
            b.addPotionEffect(new PotionEffect(eff.getEffect(), eff.getLength(), eff.getStage()));
        }
        
        if(!Equipment.isEquips(name))
            return;
        
        if(Equipment.isEquipsForType(name, "hand") && Equipment.getEquipChance(name, "hand")) {
            b.getEquipment().setItemInHand(new ItemStack(Equipment.getEquip(name, "hand")));
            b.getEquipment().setItemInHandDropChance(Equipment.getDropChance(name, "hand"));
        }
        if(Equipment.isEquipsForType(name, "helmet") && Equipment.getEquipChance(name, "helmet")) {
            b.getEquipment().setHelmet(new ItemStack(Equipment.getEquip(name, "helmet")));
            b.getEquipment().setHelmetDropChance(Equipment.getDropChance(name, "helmet"));
        }
        if(Equipment.isEquipsForType(name, "armor") && Equipment.getEquipChance(name, "armor")) {
            b.getEquipment().setChestplate(new ItemStack(Equipment.getEquip(name, "armor")));
            b.getEquipment().setChestplateDropChance(Equipment.getDropChance(name, "armor"));
        }
        if(Equipment.isEquipsForType(name, "legging") && Equipment.getEquipChance(name, "legging")) {
            b.getEquipment().setLeggings(new ItemStack(Equipment.getEquip(name, "legging")));
            b.getEquipment().setLeggingsDropChance(Equipment.getDropChance(name, "legging"));
        }
        if(Equipment.isEquipsForType(name, "boot") && Equipment.getEquipChance(name, "boot")) {
            b.getEquipment().setBoots(new ItemStack(Equipment.getEquip(name, "boot")));
            b.getEquipment().setBootsDropChance(Equipment.getDropChance(name, "boot"));
        }
    }
    
    public static void cavespider(Entity e) {
        CaveSpider b = (CaveSpider)e;
        
        String name = b.getType().name().toLowerCase();
        
        if(!Equipment.hasEquipment(name))
            return;
        
        if(!Equipment.getName(name).isEmpty()) {
            b.setCustomName(Equipment.getName(name));
            b.setCustomNameVisible(true);
        }
        
        if(Equipment.getEquipment(name).hasEffects()) {
            Effects eff = Equipment.getEquipment(name).getEffect();
            b.addPotionEffect(new PotionEffect(eff.getEffect(), eff.getLength(), eff.getStage()));
        }
        
        if(!Equipment.isEquips(name))
            return;
        
        if(Equipment.isEquipsForType(name, "hand") && Equipment.getEquipChance(name, "hand")) {
            b.getEquipment().setItemInHand(new ItemStack(Equipment.getEquip(name, "hand")));
            b.getEquipment().setItemInHandDropChance(Equipment.getDropChance(name, "hand"));
        }
        if(Equipment.isEquipsForType(name, "helmet") && Equipment.getEquipChance(name, "helmet")) {
            b.getEquipment().setHelmet(new ItemStack(Equipment.getEquip(name, "helmet")));
            b.getEquipment().setHelmetDropChance(Equipment.getDropChance(name, "helmet"));
        }
        if(Equipment.isEquipsForType(name, "armor") && Equipment.getEquipChance(name, "armor")) {
            b.getEquipment().setChestplate(new ItemStack(Equipment.getEquip(name, "armor")));
            b.getEquipment().setChestplateDropChance(Equipment.getDropChance(name, "armor"));
        }
        if(Equipment.isEquipsForType(name, "legging") && Equipment.getEquipChance(name, "legging")) {
            b.getEquipment().setLeggings(new ItemStack(Equipment.getEquip(name, "legging")));
            b.getEquipment().setLeggingsDropChance(Equipment.getDropChance(name, "legging"));
        }
        if(Equipment.isEquipsForType(name, "boot") && Equipment.getEquipChance(name, "boot")) {
            b.getEquipment().setBoots(new ItemStack(Equipment.getEquip(name, "boot")));
            b.getEquipment().setBootsDropChance(Equipment.getDropChance(name, "boot"));
        }
    }
    
    public static void chicken(Entity e) {
        Chicken b = (Chicken)e;
        
        String name = b.getType().name().toLowerCase();
        
        if(!Equipment.hasEquipment(name))
            return;
        
        if(!Equipment.getName(name).isEmpty()) {
            b.setCustomName(Equipment.getName(name));
            b.setCustomNameVisible(true);
        }
        
        if(Equipment.getEquipment(name).hasEffects()) {
            Effects eff = Equipment.getEquipment(name).getEffect();
            b.addPotionEffect(new PotionEffect(eff.getEffect(), eff.getLength(), eff.getStage()));
        }
        
        if(!Equipment.isEquips(name))
            return;
        
        if(Equipment.isEquipsForType(name, "hand") && Equipment.getEquipChance(name, "hand")) {
            b.getEquipment().setItemInHand(new ItemStack(Equipment.getEquip(name, "hand")));
            b.getEquipment().setItemInHandDropChance(Equipment.getDropChance(name, "hand"));
        }
        if(Equipment.isEquipsForType(name, "helmet") && Equipment.getEquipChance(name, "helmet")) {
            b.getEquipment().setHelmet(new ItemStack(Equipment.getEquip(name, "helmet")));
            b.getEquipment().setHelmetDropChance(Equipment.getDropChance(name, "helmet"));
        }
        if(Equipment.isEquipsForType(name, "armor") && Equipment.getEquipChance(name, "armor")) {
            b.getEquipment().setChestplate(new ItemStack(Equipment.getEquip(name, "armor")));
            b.getEquipment().setChestplateDropChance(Equipment.getDropChance(name, "armor"));
        }
        if(Equipment.isEquipsForType(name, "legging") && Equipment.getEquipChance(name, "legging")) {
            b.getEquipment().setLeggings(new ItemStack(Equipment.getEquip(name, "legging")));
            b.getEquipment().setLeggingsDropChance(Equipment.getDropChance(name, "legging"));
        }
        if(Equipment.isEquipsForType(name, "boot") && Equipment.getEquipChance(name, "boot")) {
            b.getEquipment().setBoots(new ItemStack(Equipment.getEquip(name, "boot")));
            b.getEquipment().setBootsDropChance(Equipment.getDropChance(name, "boot"));
        }
    }
    
    public static void cow(Entity e) {
        Cow b = (Cow)e;
        
        String name = b.getType().name().toLowerCase();
        
        if(!Equipment.hasEquipment(name))
            return;
        
        if(!Equipment.getName(name).isEmpty()) {
            b.setCustomName(Equipment.getName(name));
            b.setCustomNameVisible(true);
        }
        
        if(Equipment.getEquipment(name).hasEffects()) {
            Effects eff = Equipment.getEquipment(name).getEffect();
            b.addPotionEffect(new PotionEffect(eff.getEffect(), eff.getLength(), eff.getStage()));
        }
        
        if(!Equipment.isEquips(name))
            return;
        
        if(Equipment.isEquipsForType(name, "hand") && Equipment.getEquipChance(name, "hand")) {
            b.getEquipment().setItemInHand(new ItemStack(Equipment.getEquip(name, "hand")));
            b.getEquipment().setItemInHandDropChance(Equipment.getDropChance(name, "hand"));
        }
        if(Equipment.isEquipsForType(name, "helmet") && Equipment.getEquipChance(name, "helmet")) {
            b.getEquipment().setHelmet(new ItemStack(Equipment.getEquip(name, "helmet")));
            b.getEquipment().setHelmetDropChance(Equipment.getDropChance(name, "helmet"));
        }
        if(Equipment.isEquipsForType(name, "armor") && Equipment.getEquipChance(name, "armor")) {
            b.getEquipment().setChestplate(new ItemStack(Equipment.getEquip(name, "armor")));
            b.getEquipment().setChestplateDropChance(Equipment.getDropChance(name, "armor"));
        }
        if(Equipment.isEquipsForType(name, "legging") && Equipment.getEquipChance(name, "legging")) {
            b.getEquipment().setLeggings(new ItemStack(Equipment.getEquip(name, "legging")));
            b.getEquipment().setLeggingsDropChance(Equipment.getDropChance(name, "legging"));
        }
        if(Equipment.isEquipsForType(name, "boot") && Equipment.getEquipChance(name, "boot")) {
            b.getEquipment().setBoots(new ItemStack(Equipment.getEquip(name, "boot")));
            b.getEquipment().setBootsDropChance(Equipment.getDropChance(name, "boot"));
        }
    }
    
    public static void creeper(Entity e) {
        Creeper b = (Creeper)e;
        
        String name = b.getType().name().toLowerCase();
        
        if(!Equipment.hasEquipment(name))
            return;
        
        if(!Equipment.getName(name).isEmpty()) {
            b.setCustomName(Equipment.getName(name));
            b.setCustomNameVisible(true);
        }
        
        if(Equipment.getEquipment(name).hasEffects()) {
            Effects eff = Equipment.getEquipment(name).getEffect();
            b.addPotionEffect(new PotionEffect(eff.getEffect(), eff.getLength(), eff.getStage()));
        }
        
        if(!Equipment.isEquips(name))
            return;
        
        if(Equipment.isEquipsForType(name, "hand") && Equipment.getEquipChance(name, "hand")) {
            b.getEquipment().setItemInHand(new ItemStack(Equipment.getEquip(name, "hand")));
            b.getEquipment().setItemInHandDropChance(Equipment.getDropChance(name, "hand"));
        }
        if(Equipment.isEquipsForType(name, "helmet") && Equipment.getEquipChance(name, "helmet")) {
            b.getEquipment().setHelmet(new ItemStack(Equipment.getEquip(name, "helmet")));
            b.getEquipment().setHelmetDropChance(Equipment.getDropChance(name, "helmet"));
        }
        if(Equipment.isEquipsForType(name, "armor") && Equipment.getEquipChance(name, "armor")) {
            b.getEquipment().setChestplate(new ItemStack(Equipment.getEquip(name, "armor")));
            b.getEquipment().setChestplateDropChance(Equipment.getDropChance(name, "armor"));
        }
        if(Equipment.isEquipsForType(name, "legging") && Equipment.getEquipChance(name, "legging")) {
            b.getEquipment().setLeggings(new ItemStack(Equipment.getEquip(name, "legging")));
            b.getEquipment().setLeggingsDropChance(Equipment.getDropChance(name, "legging"));
        }
        if(Equipment.isEquipsForType(name, "boot") && Equipment.getEquipChance(name, "boot")) {
            b.getEquipment().setBoots(new ItemStack(Equipment.getEquip(name, "boot")));
            b.getEquipment().setBootsDropChance(Equipment.getDropChance(name, "boot"));
        }
    }
    
    public static void enderdragon(Entity e) {
        EnderDragon b = (EnderDragon)e;
        
        String name = b.getType().name().toLowerCase();
        
        if(!Equipment.hasEquipment(name))
            return;
        
        if(!Equipment.getName(name).isEmpty()) {
            b.setCustomName(Equipment.getName(name));
            b.setCustomNameVisible(true);
        }
        
        if(Equipment.getEquipment(name).hasEffects()) {
            Effects eff = Equipment.getEquipment(name).getEffect();
            b.addPotionEffect(new PotionEffect(eff.getEffect(), eff.getLength(), eff.getStage()));
        }
        
        if(!Equipment.isEquips(name))
            return;
        
        if(Equipment.isEquipsForType(name, "hand") && Equipment.getEquipChance(name, "hand")) {
            b.getEquipment().setItemInHand(new ItemStack(Equipment.getEquip(name, "hand")));
            b.getEquipment().setItemInHandDropChance(Equipment.getDropChance(name, "hand"));
        }
        if(Equipment.isEquipsForType(name, "helmet") && Equipment.getEquipChance(name, "helmet")) {
            b.getEquipment().setHelmet(new ItemStack(Equipment.getEquip(name, "helmet")));
            b.getEquipment().setHelmetDropChance(Equipment.getDropChance(name, "helmet"));
        }
        if(Equipment.isEquipsForType(name, "armor") && Equipment.getEquipChance(name, "armor")) {
            b.getEquipment().setChestplate(new ItemStack(Equipment.getEquip(name, "armor")));
            b.getEquipment().setChestplateDropChance(Equipment.getDropChance(name, "armor"));
        }
        if(Equipment.isEquipsForType(name, "legging") && Equipment.getEquipChance(name, "legging")) {
            b.getEquipment().setLeggings(new ItemStack(Equipment.getEquip(name, "legging")));
            b.getEquipment().setLeggingsDropChance(Equipment.getDropChance(name, "legging"));
        }
        if(Equipment.isEquipsForType(name, "boot") && Equipment.getEquipChance(name, "boot")) {
            b.getEquipment().setBoots(new ItemStack(Equipment.getEquip(name, "boot")));
            b.getEquipment().setBootsDropChance(Equipment.getDropChance(name, "boot"));
        }
    }
    
    public static void enderman(Entity e) {
        Enderman b = (Enderman)e;
        
        String name = b.getType().name().toLowerCase();
        
        if(!Equipment.hasEquipment(name))
            return;
        
        if(!Equipment.getName(name).isEmpty()) {
            b.setCustomName(Equipment.getName(name));
            b.setCustomNameVisible(true);
        }
        
        if(Equipment.getEquipment(name).hasEffects()) {
            Effects eff = Equipment.getEquipment(name).getEffect();
            b.addPotionEffect(new PotionEffect(eff.getEffect(), eff.getLength(), eff.getStage()));
        }
        
        if(!Equipment.isEquips(name))
            return;
        
        if(Equipment.isEquipsForType(name, "hand") && Equipment.getEquipChance(name, "hand")) {
            b.getEquipment().setItemInHand(new ItemStack(Equipment.getEquip(name, "hand")));
            b.getEquipment().setItemInHandDropChance(Equipment.getDropChance(name, "hand"));
        }
        if(Equipment.isEquipsForType(name, "helmet") && Equipment.getEquipChance(name, "helmet")) {
            b.getEquipment().setHelmet(new ItemStack(Equipment.getEquip(name, "helmet")));
            b.getEquipment().setHelmetDropChance(Equipment.getDropChance(name, "helmet"));
        }
        if(Equipment.isEquipsForType(name, "armor") && Equipment.getEquipChance(name, "armor")) {
            b.getEquipment().setChestplate(new ItemStack(Equipment.getEquip(name, "armor")));
            b.getEquipment().setChestplateDropChance(Equipment.getDropChance(name, "armor"));
        }
        if(Equipment.isEquipsForType(name, "legging") && Equipment.getEquipChance(name, "legging")) {
            b.getEquipment().setLeggings(new ItemStack(Equipment.getEquip(name, "legging")));
            b.getEquipment().setLeggingsDropChance(Equipment.getDropChance(name, "legging"));
        }
        if(Equipment.isEquipsForType(name, "boot") && Equipment.getEquipChance(name, "boot")) {
            b.getEquipment().setBoots(new ItemStack(Equipment.getEquip(name, "boot")));
            b.getEquipment().setBootsDropChance(Equipment.getDropChance(name, "boot"));
        }
    }
    
    public static void ghast(Entity e) {
        Ghast b = (Ghast)e;
        
        String name = b.getType().name().toLowerCase();
        
        if(!Equipment.hasEquipment(name))
            return;
        
        if(!Equipment.getName(name).isEmpty()) {
            b.setCustomName(Equipment.getName(name));
            b.setCustomNameVisible(true);
        }
        
        if(Equipment.getEquipment(name).hasEffects()) {
            Effects eff = Equipment.getEquipment(name).getEffect();
            b.addPotionEffect(new PotionEffect(eff.getEffect(), eff.getLength(), eff.getStage()));
        }
        
        if(!Equipment.isEquips(name))
            return;
        
        if(Equipment.isEquipsForType(name, "hand") && Equipment.getEquipChance(name, "hand")) {
            b.getEquipment().setItemInHand(new ItemStack(Equipment.getEquip(name, "hand")));
            b.getEquipment().setItemInHandDropChance(Equipment.getDropChance(name, "hand"));
        }
        if(Equipment.isEquipsForType(name, "helmet") && Equipment.getEquipChance(name, "helmet")) {
            b.getEquipment().setHelmet(new ItemStack(Equipment.getEquip(name, "helmet")));
            b.getEquipment().setHelmetDropChance(Equipment.getDropChance(name, "helmet"));
        }
        if(Equipment.isEquipsForType(name, "armor") && Equipment.getEquipChance(name, "armor")) {
            b.getEquipment().setChestplate(new ItemStack(Equipment.getEquip(name, "armor")));
            b.getEquipment().setChestplateDropChance(Equipment.getDropChance(name, "armor"));
        }
        if(Equipment.isEquipsForType(name, "legging") && Equipment.getEquipChance(name, "legging")) {
            b.getEquipment().setLeggings(new ItemStack(Equipment.getEquip(name, "legging")));
            b.getEquipment().setLeggingsDropChance(Equipment.getDropChance(name, "legging"));
        }
        if(Equipment.isEquipsForType(name, "boot") && Equipment.getEquipChance(name, "boot")) {
            b.getEquipment().setBoots(new ItemStack(Equipment.getEquip(name, "boot")));
            b.getEquipment().setBootsDropChance(Equipment.getDropChance(name, "boot"));
        }
    }
    
    public static void giant(Entity e) {
        Giant b = (Giant)e;
        
        String name = b.getType().name().toLowerCase();
        
        if(!Equipment.hasEquipment(name))
            return;
        
        if(!Equipment.getName(name).isEmpty()) {
            b.setCustomName(Equipment.getName(name));
            b.setCustomNameVisible(true);
        }
        
        if(Equipment.getEquipment(name).hasEffects()) {
            Effects eff = Equipment.getEquipment(name).getEffect();
            b.addPotionEffect(new PotionEffect(eff.getEffect(), eff.getLength(), eff.getStage()));
        }
        
        if(!Equipment.isEquips(name))
            return;
        
        if(Equipment.isEquipsForType(name, "hand") && Equipment.getEquipChance(name, "hand")) {
            b.getEquipment().setItemInHand(new ItemStack(Equipment.getEquip(name, "hand")));
            b.getEquipment().setItemInHandDropChance(Equipment.getDropChance(name, "hand"));
        }
        if(Equipment.isEquipsForType(name, "helmet") && Equipment.getEquipChance(name, "helmet")) {
            b.getEquipment().setHelmet(new ItemStack(Equipment.getEquip(name, "helmet")));
            b.getEquipment().setHelmetDropChance(Equipment.getDropChance(name, "helmet"));
        }
        if(Equipment.isEquipsForType(name, "armor") && Equipment.getEquipChance(name, "armor")) {
            b.getEquipment().setChestplate(new ItemStack(Equipment.getEquip(name, "armor")));
            b.getEquipment().setChestplateDropChance(Equipment.getDropChance(name, "armor"));
        }
        if(Equipment.isEquipsForType(name, "legging") && Equipment.getEquipChance(name, "legging")) {
            b.getEquipment().setLeggings(new ItemStack(Equipment.getEquip(name, "legging")));
            b.getEquipment().setLeggingsDropChance(Equipment.getDropChance(name, "legging"));
        }
        if(Equipment.isEquipsForType(name, "boot") && Equipment.getEquipChance(name, "boot")) {
            b.getEquipment().setBoots(new ItemStack(Equipment.getEquip(name, "boot")));
            b.getEquipment().setBootsDropChance(Equipment.getDropChance(name, "boot"));
        }
    }
    
    public static void horse(Entity e) {
        Horse b = (Horse)e;
        
        String name = b.getType().name().toLowerCase();
        
        if(!Equipment.hasEquipment(name))
            return;
        
        if(!Equipment.getName(name).isEmpty()) {
            b.setCustomName(Equipment.getName(name));
            b.setCustomNameVisible(true);
        }
        
        if(Equipment.getEquipment(name).hasEffects()) {
            Effects eff = Equipment.getEquipment(name).getEffect();
            b.addPotionEffect(new PotionEffect(eff.getEffect(), eff.getLength(), eff.getStage()));
        }
        
        if(!Equipment.isEquips(name))
            return;
        
        if(Equipment.isEquipsForType(name, "hand") && Equipment.getEquipChance(name, "hand")) {
            b.getEquipment().setItemInHand(new ItemStack(Equipment.getEquip(name, "hand")));
            b.getEquipment().setItemInHandDropChance(Equipment.getDropChance(name, "hand"));
        }
        if(Equipment.isEquipsForType(name, "helmet") && Equipment.getEquipChance(name, "helmet")) {
            b.getEquipment().setHelmet(new ItemStack(Equipment.getEquip(name, "helmet")));
            b.getEquipment().setHelmetDropChance(Equipment.getDropChance(name, "helmet"));
        }
        if(Equipment.isEquipsForType(name, "armor") && Equipment.getEquipChance(name, "armor")) {
            b.getEquipment().setChestplate(new ItemStack(Equipment.getEquip(name, "armor")));
            b.getEquipment().setChestplateDropChance(Equipment.getDropChance(name, "armor"));
        }
        if(Equipment.isEquipsForType(name, "legging") && Equipment.getEquipChance(name, "legging")) {
            b.getEquipment().setLeggings(new ItemStack(Equipment.getEquip(name, "legging")));
            b.getEquipment().setLeggingsDropChance(Equipment.getDropChance(name, "legging"));
        }
        if(Equipment.isEquipsForType(name, "boot") && Equipment.getEquipChance(name, "boot")) {
            b.getEquipment().setBoots(new ItemStack(Equipment.getEquip(name, "boot")));
            b.getEquipment().setBootsDropChance(Equipment.getDropChance(name, "boot"));
        }
    }
    
    public static void irongolem(Entity e) {
        IronGolem b = (IronGolem)e;
        
        String name = b.getType().name().toLowerCase();
        
        if(!Equipment.hasEquipment(name))
            return;
        
        if(!Equipment.getName(name).isEmpty()) {
            b.setCustomName(Equipment.getName(name));
            b.setCustomNameVisible(true);
        }
        
        if(Equipment.getEquipment(name).hasEffects()) {
            Effects eff = Equipment.getEquipment(name).getEffect();
            b.addPotionEffect(new PotionEffect(eff.getEffect(), eff.getLength(), eff.getStage()));
        }
        
        if(!Equipment.isEquips(name))
            return;
        
        if(Equipment.isEquipsForType(name, "hand") && Equipment.getEquipChance(name, "hand")) {
            b.getEquipment().setItemInHand(new ItemStack(Equipment.getEquip(name, "hand")));
            b.getEquipment().setItemInHandDropChance(Equipment.getDropChance(name, "hand"));
        }
        if(Equipment.isEquipsForType(name, "helmet") && Equipment.getEquipChance(name, "helmet")) {
            b.getEquipment().setHelmet(new ItemStack(Equipment.getEquip(name, "helmet")));
            b.getEquipment().setHelmetDropChance(Equipment.getDropChance(name, "helmet"));
        }
        if(Equipment.isEquipsForType(name, "armor") && Equipment.getEquipChance(name, "armor")) {
            b.getEquipment().setChestplate(new ItemStack(Equipment.getEquip(name, "armor")));
            b.getEquipment().setChestplateDropChance(Equipment.getDropChance(name, "armor"));
        }
        if(Equipment.isEquipsForType(name, "legging") && Equipment.getEquipChance(name, "legging")) {
            b.getEquipment().setLeggings(new ItemStack(Equipment.getEquip(name, "legging")));
            b.getEquipment().setLeggingsDropChance(Equipment.getDropChance(name, "legging"));
        }
        if(Equipment.isEquipsForType(name, "boot") && Equipment.getEquipChance(name, "boot")) {
            b.getEquipment().setBoots(new ItemStack(Equipment.getEquip(name, "boot")));
            b.getEquipment().setBootsDropChance(Equipment.getDropChance(name, "boot"));
        }
    }
    
    public static void magmacube(Entity e) {
        MagmaCube b = (MagmaCube)e;
        
        String name = b.getType().name().toLowerCase();
        
        if(!Equipment.hasEquipment(name))
            return;
        
        if(!Equipment.getName(name).isEmpty()) {
            b.setCustomName(Equipment.getName(name));
            b.setCustomNameVisible(true);
        }
        
        if(Equipment.getEquipment(name).hasEffects()) {
            Effects eff = Equipment.getEquipment(name).getEffect();
            b.addPotionEffect(new PotionEffect(eff.getEffect(), eff.getLength(), eff.getStage()));
        }
        
        if(!Equipment.isEquips(name))
            return;
        
        if(Equipment.isEquipsForType(name, "hand") && Equipment.getEquipChance(name, "hand")) {
            b.getEquipment().setItemInHand(new ItemStack(Equipment.getEquip(name, "hand")));
            b.getEquipment().setItemInHandDropChance(Equipment.getDropChance(name, "hand"));
        }
        if(Equipment.isEquipsForType(name, "helmet") && Equipment.getEquipChance(name, "helmet")) {
            b.getEquipment().setHelmet(new ItemStack(Equipment.getEquip(name, "helmet")));
            b.getEquipment().setHelmetDropChance(Equipment.getDropChance(name, "helmet"));
        }
        if(Equipment.isEquipsForType(name, "armor") && Equipment.getEquipChance(name, "armor")) {
            b.getEquipment().setChestplate(new ItemStack(Equipment.getEquip(name, "armor")));
            b.getEquipment().setChestplateDropChance(Equipment.getDropChance(name, "armor"));
        }
        if(Equipment.isEquipsForType(name, "legging") && Equipment.getEquipChance(name, "legging")) {
            b.getEquipment().setLeggings(new ItemStack(Equipment.getEquip(name, "legging")));
            b.getEquipment().setLeggingsDropChance(Equipment.getDropChance(name, "legging"));
        }
        if(Equipment.isEquipsForType(name, "boot") && Equipment.getEquipChance(name, "boot")) {
            b.getEquipment().setBoots(new ItemStack(Equipment.getEquip(name, "boot")));
            b.getEquipment().setBootsDropChance(Equipment.getDropChance(name, "boot"));
        }
    }
    
    public static void mushroomcow(Entity e) {
        MushroomCow b = (MushroomCow)e;
        
        String name = b.getType().name().toLowerCase();
        
        if(!Equipment.hasEquipment(name))
            return;
        
        if(!Equipment.getName(name).isEmpty()) {
            b.setCustomName(Equipment.getName(name));
            b.setCustomNameVisible(true);
        }
        
        if(Equipment.getEquipment(name).hasEffects()) {
            Effects eff = Equipment.getEquipment(name).getEffect();
            b.addPotionEffect(new PotionEffect(eff.getEffect(), eff.getLength(), eff.getStage()));
        }
        
        if(!Equipment.isEquips(name))
            return;
        
        if(Equipment.isEquipsForType(name, "hand") && Equipment.getEquipChance(name, "hand")) {
            b.getEquipment().setItemInHand(new ItemStack(Equipment.getEquip(name, "hand")));
            b.getEquipment().setItemInHandDropChance(Equipment.getDropChance(name, "hand"));
        }
        if(Equipment.isEquipsForType(name, "helmet") && Equipment.getEquipChance(name, "helmet")) {
            b.getEquipment().setHelmet(new ItemStack(Equipment.getEquip(name, "helmet")));
            b.getEquipment().setHelmetDropChance(Equipment.getDropChance(name, "helmet"));
        }
        if(Equipment.isEquipsForType(name, "armor") && Equipment.getEquipChance(name, "armor")) {
            b.getEquipment().setChestplate(new ItemStack(Equipment.getEquip(name, "armor")));
            b.getEquipment().setChestplateDropChance(Equipment.getDropChance(name, "armor"));
        }
        if(Equipment.isEquipsForType(name, "legging") && Equipment.getEquipChance(name, "legging")) {
            b.getEquipment().setLeggings(new ItemStack(Equipment.getEquip(name, "legging")));
            b.getEquipment().setLeggingsDropChance(Equipment.getDropChance(name, "legging"));
        }
        if(Equipment.isEquipsForType(name, "boot") && Equipment.getEquipChance(name, "boot")) {
            b.getEquipment().setBoots(new ItemStack(Equipment.getEquip(name, "boot")));
            b.getEquipment().setBootsDropChance(Equipment.getDropChance(name, "boot"));
        }
    }
    
    public static void ocelot(Entity e) {
        Ocelot b = (Ocelot)e;
        
        String name = b.getType().name().toLowerCase();
        
        if(!Equipment.hasEquipment(name))
            return;
        
        if(!Equipment.getName(name).isEmpty()) {
            b.setCustomName(Equipment.getName(name));
            b.setCustomNameVisible(true);
        }
        
        if(Equipment.getEquipment(name).hasEffects()) {
            Effects eff = Equipment.getEquipment(name).getEffect();
            b.addPotionEffect(new PotionEffect(eff.getEffect(), eff.getLength(), eff.getStage()));
        }
        
        if(!Equipment.isEquips(name))
            return;
        
        if(Equipment.isEquipsForType(name, "hand") && Equipment.getEquipChance(name, "hand")) {
            b.getEquipment().setItemInHand(new ItemStack(Equipment.getEquip(name, "hand")));
            b.getEquipment().setItemInHandDropChance(Equipment.getDropChance(name, "hand"));
        }
        if(Equipment.isEquipsForType(name, "helmet") && Equipment.getEquipChance(name, "helmet")) {
            b.getEquipment().setHelmet(new ItemStack(Equipment.getEquip(name, "helmet")));
            b.getEquipment().setHelmetDropChance(Equipment.getDropChance(name, "helmet"));
        }
        if(Equipment.isEquipsForType(name, "armor") && Equipment.getEquipChance(name, "armor")) {
            b.getEquipment().setChestplate(new ItemStack(Equipment.getEquip(name, "armor")));
            b.getEquipment().setChestplateDropChance(Equipment.getDropChance(name, "armor"));
        }
        if(Equipment.isEquipsForType(name, "legging") && Equipment.getEquipChance(name, "legging")) {
            b.getEquipment().setLeggings(new ItemStack(Equipment.getEquip(name, "legging")));
            b.getEquipment().setLeggingsDropChance(Equipment.getDropChance(name, "legging"));
        }
        if(Equipment.isEquipsForType(name, "boot") && Equipment.getEquipChance(name, "boot")) {
            b.getEquipment().setBoots(new ItemStack(Equipment.getEquip(name, "boot")));
            b.getEquipment().setBootsDropChance(Equipment.getDropChance(name, "boot"));
        }
    }
    
    public static void pig(Entity e) {
        Pig b = (Pig)e;
        
        String name = b.getType().name().toLowerCase();
        
        if(!Equipment.hasEquipment(name))
            return;
        
        if(!Equipment.getName(name).isEmpty()) {
            b.setCustomName(Equipment.getName(name));
            b.setCustomNameVisible(true);
        }
        
        if(Equipment.getEquipment(name).hasEffects()) {
            Effects eff = Equipment.getEquipment(name).getEffect();
            b.addPotionEffect(new PotionEffect(eff.getEffect(), eff.getLength(), eff.getStage()));
        }
        
        if(!Equipment.isEquips(name))
            return;
        
        if(Equipment.isEquipsForType(name, "hand") && Equipment.getEquipChance(name, "hand")) {
            b.getEquipment().setItemInHand(new ItemStack(Equipment.getEquip(name, "hand")));
            b.getEquipment().setItemInHandDropChance(Equipment.getDropChance(name, "hand"));
        }
        if(Equipment.isEquipsForType(name, "helmet") && Equipment.getEquipChance(name, "helmet")) {
            b.getEquipment().setHelmet(new ItemStack(Equipment.getEquip(name, "helmet")));
            b.getEquipment().setHelmetDropChance(Equipment.getDropChance(name, "helmet"));
        }
        if(Equipment.isEquipsForType(name, "armor") && Equipment.getEquipChance(name, "armor")) {
            b.getEquipment().setChestplate(new ItemStack(Equipment.getEquip(name, "armor")));
            b.getEquipment().setChestplateDropChance(Equipment.getDropChance(name, "armor"));
        }
        if(Equipment.isEquipsForType(name, "legging") && Equipment.getEquipChance(name, "legging")) {
            b.getEquipment().setLeggings(new ItemStack(Equipment.getEquip(name, "legging")));
            b.getEquipment().setLeggingsDropChance(Equipment.getDropChance(name, "legging"));
        }
        if(Equipment.isEquipsForType(name, "boot") && Equipment.getEquipChance(name, "boot")) {
            b.getEquipment().setBoots(new ItemStack(Equipment.getEquip(name, "boot")));
            b.getEquipment().setBootsDropChance(Equipment.getDropChance(name, "boot"));
        }
    }
    
    public static void pigzombie(Entity e) {
        PigZombie b = (PigZombie)e;
        
        String name = b.getType().name().toLowerCase();
        
        if(!Equipment.hasEquipment(name))
            return;
        
        if(!Equipment.getName(name).isEmpty()) {
            b.setCustomName(Equipment.getName(name));
            b.setCustomNameVisible(true);
        }
        
        if(Equipment.getEquipment(name).hasEffects()) {
            Effects eff = Equipment.getEquipment(name).getEffect();
            b.addPotionEffect(new PotionEffect(eff.getEffect(), eff.getLength(), eff.getStage()));
        }
        
        if(!Equipment.isEquips(name))
            return;
        
        if(Equipment.isEquipsForType(name, "hand") && Equipment.getEquipChance(name, "hand")) {
            b.getEquipment().setItemInHand(new ItemStack(Equipment.getEquip(name, "hand")));
            b.getEquipment().setItemInHandDropChance(Equipment.getDropChance(name, "hand"));
        }
        if(Equipment.isEquipsForType(name, "helmet") && Equipment.getEquipChance(name, "helmet")) {
            b.getEquipment().setHelmet(new ItemStack(Equipment.getEquip(name, "helmet")));
            b.getEquipment().setHelmetDropChance(Equipment.getDropChance(name, "helmet"));
        }
        if(Equipment.isEquipsForType(name, "armor") && Equipment.getEquipChance(name, "armor")) {
            b.getEquipment().setChestplate(new ItemStack(Equipment.getEquip(name, "armor")));
            b.getEquipment().setChestplateDropChance(Equipment.getDropChance(name, "armor"));
        }
        if(Equipment.isEquipsForType(name, "legging") && Equipment.getEquipChance(name, "legging")) {
            b.getEquipment().setLeggings(new ItemStack(Equipment.getEquip(name, "legging")));
            b.getEquipment().setLeggingsDropChance(Equipment.getDropChance(name, "legging"));
        }
        if(Equipment.isEquipsForType(name, "boot") && Equipment.getEquipChance(name, "boot")) {
            b.getEquipment().setBoots(new ItemStack(Equipment.getEquip(name, "boot")));
            b.getEquipment().setBootsDropChance(Equipment.getDropChance(name, "boot"));
        }
    }
    
    public static void sheep(Entity e) {
        Sheep b = (Sheep)e;
        
        String name = b.getType().name().toLowerCase();
        
        if(!Equipment.hasEquipment(name))
            return;
        
        if(!Equipment.getName(name).isEmpty()) {
            b.setCustomName(Equipment.getName(name));
            b.setCustomNameVisible(true);
        }
        
        if(Equipment.getEquipment(name).hasEffects()) {
            Effects eff = Equipment.getEquipment(name).getEffect();
            b.addPotionEffect(new PotionEffect(eff.getEffect(), eff.getLength(), eff.getStage()));
        }
        
        if(!Equipment.isEquips(name))
            return;
        
        if(Equipment.isEquipsForType(name, "hand") && Equipment.getEquipChance(name, "hand")) {
            b.getEquipment().setItemInHand(new ItemStack(Equipment.getEquip(name, "hand")));
            b.getEquipment().setItemInHandDropChance(Equipment.getDropChance(name, "hand"));
        }
        if(Equipment.isEquipsForType(name, "helmet") && Equipment.getEquipChance(name, "helmet")) {
            b.getEquipment().setHelmet(new ItemStack(Equipment.getEquip(name, "helmet")));
            b.getEquipment().setHelmetDropChance(Equipment.getDropChance(name, "helmet"));
        }
        if(Equipment.isEquipsForType(name, "armor") && Equipment.getEquipChance(name, "armor")) {
            b.getEquipment().setChestplate(new ItemStack(Equipment.getEquip(name, "armor")));
            b.getEquipment().setChestplateDropChance(Equipment.getDropChance(name, "armor"));
        }
        if(Equipment.isEquipsForType(name, "legging") && Equipment.getEquipChance(name, "legging")) {
            b.getEquipment().setLeggings(new ItemStack(Equipment.getEquip(name, "legging")));
            b.getEquipment().setLeggingsDropChance(Equipment.getDropChance(name, "legging"));
        }
        if(Equipment.isEquipsForType(name, "boot") && Equipment.getEquipChance(name, "boot")) {
            b.getEquipment().setBoots(new ItemStack(Equipment.getEquip(name, "boot")));
            b.getEquipment().setBootsDropChance(Equipment.getDropChance(name, "boot"));
        }
    }
    
    public static void silverfish(Entity e) {
        Silverfish b = (Silverfish)e;
        
        String name = b.getType().name().toLowerCase();
        
        if(!Equipment.hasEquipment(name))
            return;
        
        if(!Equipment.getName(name).isEmpty()) {
            b.setCustomName(Equipment.getName(name));
            b.setCustomNameVisible(true);
        }
        
        if(Equipment.getEquipment(name).hasEffects()) {
            Effects eff = Equipment.getEquipment(name).getEffect();
            b.addPotionEffect(new PotionEffect(eff.getEffect(), eff.getLength(), eff.getStage()));
        }
        
        if(!Equipment.isEquips(name))
            return;
        
        if(Equipment.isEquipsForType(name, "hand") && Equipment.getEquipChance(name, "hand")) {
            b.getEquipment().setItemInHand(new ItemStack(Equipment.getEquip(name, "hand")));
            b.getEquipment().setItemInHandDropChance(Equipment.getDropChance(name, "hand"));
        }
        if(Equipment.isEquipsForType(name, "helmet") && Equipment.getEquipChance(name, "helmet")) {
            b.getEquipment().setHelmet(new ItemStack(Equipment.getEquip(name, "helmet")));
            b.getEquipment().setHelmetDropChance(Equipment.getDropChance(name, "helmet"));
        }
        if(Equipment.isEquipsForType(name, "armor") && Equipment.getEquipChance(name, "armor")) {
            b.getEquipment().setChestplate(new ItemStack(Equipment.getEquip(name, "armor")));
            b.getEquipment().setChestplateDropChance(Equipment.getDropChance(name, "armor"));
        }
        if(Equipment.isEquipsForType(name, "legging") && Equipment.getEquipChance(name, "legging")) {
            b.getEquipment().setLeggings(new ItemStack(Equipment.getEquip(name, "legging")));
            b.getEquipment().setLeggingsDropChance(Equipment.getDropChance(name, "legging"));
        }
        if(Equipment.isEquipsForType(name, "boot") && Equipment.getEquipChance(name, "boot")) {
            b.getEquipment().setBoots(new ItemStack(Equipment.getEquip(name, "boot")));
            b.getEquipment().setBootsDropChance(Equipment.getDropChance(name, "boot"));
        }
    }
    
    public static void skeleton(Entity e) {
        Skeleton b = (Skeleton)e;
        
        String name = b.getType().name().toLowerCase();
        
        if(!Equipment.hasEquipment(name))
            return;
        
        if(!Equipment.getName(name).isEmpty()) {
            b.setCustomName(Equipment.getName(name));
            b.setCustomNameVisible(true);
        }
        
        if(Equipment.getEquipment(name).hasEffects()) {
            Effects eff = Equipment.getEquipment(name).getEffect();
            b.addPotionEffect(new PotionEffect(eff.getEffect(), eff.getLength(), eff.getStage()));
        }
        
        if(!Equipment.isEquips(name))
            return;
        
        if(Equipment.isEquipsForType(name, "hand") && Equipment.getEquipChance(name, "hand")) {
            b.getEquipment().setItemInHand(new ItemStack(Equipment.getEquip(name, "hand")));
            b.getEquipment().setItemInHandDropChance(Equipment.getDropChance(name, "hand"));
        }
        if(Equipment.isEquipsForType(name, "helmet") && Equipment.getEquipChance(name, "helmet")) {
            b.getEquipment().setHelmet(new ItemStack(Equipment.getEquip(name, "helmet")));
            b.getEquipment().setHelmetDropChance(Equipment.getDropChance(name, "helmet"));
        }
        if(Equipment.isEquipsForType(name, "armor") && Equipment.getEquipChance(name, "armor")) {
            b.getEquipment().setChestplate(new ItemStack(Equipment.getEquip(name, "armor")));
            b.getEquipment().setChestplateDropChance(Equipment.getDropChance(name, "armor"));
        }
        if(Equipment.isEquipsForType(name, "legging") && Equipment.getEquipChance(name, "legging")) {
            b.getEquipment().setLeggings(new ItemStack(Equipment.getEquip(name, "legging")));
            b.getEquipment().setLeggingsDropChance(Equipment.getDropChance(name, "legging"));
        }
        if(Equipment.isEquipsForType(name, "boot") && Equipment.getEquipChance(name, "boot")) {
            b.getEquipment().setBoots(new ItemStack(Equipment.getEquip(name, "boot")));
            b.getEquipment().setBootsDropChance(Equipment.getDropChance(name, "boot"));
        }
    }
    
    public static void slime(Entity e) {
        Slime b = (Slime)e;
        
        String name = b.getType().name().toLowerCase();
        
        if(!Equipment.hasEquipment(name))
            return;
        
        if(!Equipment.getName(name).isEmpty()) {
            b.setCustomName(Equipment.getName(name));
            b.setCustomNameVisible(true);
        }
        
        if(Equipment.getEquipment(name).hasEffects()) {
            Effects eff = Equipment.getEquipment(name).getEffect();
            b.addPotionEffect(new PotionEffect(eff.getEffect(), eff.getLength(), eff.getStage()));
        }
        
        if(!Equipment.isEquips(name))
            return;
        
        if(Equipment.isEquipsForType(name, "hand") && Equipment.getEquipChance(name, "hand")) {
            b.getEquipment().setItemInHand(new ItemStack(Equipment.getEquip(name, "hand")));
            b.getEquipment().setItemInHandDropChance(Equipment.getDropChance(name, "hand"));
        }
        if(Equipment.isEquipsForType(name, "helmet") && Equipment.getEquipChance(name, "helmet")) {
            b.getEquipment().setHelmet(new ItemStack(Equipment.getEquip(name, "helmet")));
            b.getEquipment().setHelmetDropChance(Equipment.getDropChance(name, "helmet"));
        }
        if(Equipment.isEquipsForType(name, "armor") && Equipment.getEquipChance(name, "armor")) {
            b.getEquipment().setChestplate(new ItemStack(Equipment.getEquip(name, "armor")));
            b.getEquipment().setChestplateDropChance(Equipment.getDropChance(name, "armor"));
        }
        if(Equipment.isEquipsForType(name, "legging") && Equipment.getEquipChance(name, "legging")) {
            b.getEquipment().setLeggings(new ItemStack(Equipment.getEquip(name, "legging")));
            b.getEquipment().setLeggingsDropChance(Equipment.getDropChance(name, "legging"));
        }
        if(Equipment.isEquipsForType(name, "boot") && Equipment.getEquipChance(name, "boot")) {
            b.getEquipment().setBoots(new ItemStack(Equipment.getEquip(name, "boot")));
            b.getEquipment().setBootsDropChance(Equipment.getDropChance(name, "boot"));
        }
    }
    
    public static void snowman(Entity e) {
        Snowman b = (Snowman)e;
        
        String name = b.getType().name().toLowerCase();
        
        if(!Equipment.hasEquipment(name))
            return;
        
        if(!Equipment.getName(name).isEmpty()) {
            b.setCustomName(Equipment.getName(name));
            b.setCustomNameVisible(true);
        }
        
        if(Equipment.getEquipment(name).hasEffects()) {
            Effects eff = Equipment.getEquipment(name).getEffect();
            b.addPotionEffect(new PotionEffect(eff.getEffect(), eff.getLength(), eff.getStage()));
        }
        
        if(!Equipment.isEquips(name))
            return;
        
        if(Equipment.isEquipsForType(name, "hand") && Equipment.getEquipChance(name, "hand")) {
            b.getEquipment().setItemInHand(new ItemStack(Equipment.getEquip(name, "hand")));
            b.getEquipment().setItemInHandDropChance(Equipment.getDropChance(name, "hand"));
        }
        if(Equipment.isEquipsForType(name, "helmet") && Equipment.getEquipChance(name, "helmet")) {
            b.getEquipment().setHelmet(new ItemStack(Equipment.getEquip(name, "helmet")));
            b.getEquipment().setHelmetDropChance(Equipment.getDropChance(name, "helmet"));
        }
        if(Equipment.isEquipsForType(name, "armor") && Equipment.getEquipChance(name, "armor")) {
            b.getEquipment().setChestplate(new ItemStack(Equipment.getEquip(name, "armor")));
            b.getEquipment().setChestplateDropChance(Equipment.getDropChance(name, "armor"));
        }
        if(Equipment.isEquipsForType(name, "legging") && Equipment.getEquipChance(name, "legging")) {
            b.getEquipment().setLeggings(new ItemStack(Equipment.getEquip(name, "legging")));
            b.getEquipment().setLeggingsDropChance(Equipment.getDropChance(name, "legging"));
        }
        if(Equipment.isEquipsForType(name, "boot") && Equipment.getEquipChance(name, "boot")) {
            b.getEquipment().setBoots(new ItemStack(Equipment.getEquip(name, "boot")));
            b.getEquipment().setBootsDropChance(Equipment.getDropChance(name, "boot"));
        }
    }
    
    public static void spider(Entity e) {
        Spider b = (Spider)e;
        
        String name = b.getType().name().toLowerCase();
        
        if(!Equipment.hasEquipment(name))
            return;
        
        if(!Equipment.getName(name).isEmpty()) {
            b.setCustomName(Equipment.getName(name));
            b.setCustomNameVisible(true);
        }
        
        if(Equipment.getEquipment(name).hasEffects()) {
            Effects eff = Equipment.getEquipment(name).getEffect();
            b.addPotionEffect(new PotionEffect(eff.getEffect(), eff.getLength(), eff.getStage()));
        }
        
        if(!Equipment.isEquips(name))
            return;
        
        if(Equipment.isEquipsForType(name, "hand") && Equipment.getEquipChance(name, "hand")) {
            b.getEquipment().setItemInHand(new ItemStack(Equipment.getEquip(name, "hand")));
            b.getEquipment().setItemInHandDropChance(Equipment.getDropChance(name, "hand"));
        }
        if(Equipment.isEquipsForType(name, "helmet") && Equipment.getEquipChance(name, "helmet")) {
            b.getEquipment().setHelmet(new ItemStack(Equipment.getEquip(name, "helmet")));
            b.getEquipment().setHelmetDropChance(Equipment.getDropChance(name, "helmet"));
        }
        if(Equipment.isEquipsForType(name, "armor") && Equipment.getEquipChance(name, "armor")) {
            b.getEquipment().setChestplate(new ItemStack(Equipment.getEquip(name, "armor")));
            b.getEquipment().setChestplateDropChance(Equipment.getDropChance(name, "armor"));
        }
        if(Equipment.isEquipsForType(name, "legging") && Equipment.getEquipChance(name, "legging")) {
            b.getEquipment().setLeggings(new ItemStack(Equipment.getEquip(name, "legging")));
            b.getEquipment().setLeggingsDropChance(Equipment.getDropChance(name, "legging"));
        }
        if(Equipment.isEquipsForType(name, "boot") && Equipment.getEquipChance(name, "boot")) {
            b.getEquipment().setBoots(new ItemStack(Equipment.getEquip(name, "boot")));
            b.getEquipment().setBootsDropChance(Equipment.getDropChance(name, "boot"));
        }
    }
    
    public static void squid(Entity e) {
        Squid b = (Squid)e;
        
        String name = b.getType().name().toLowerCase();
        
        if(!Equipment.hasEquipment(name))
            return;
        
        if(!Equipment.getName(name).isEmpty()) {
            b.setCustomName(Equipment.getName(name));
            b.setCustomNameVisible(true);
        }
        
        if(Equipment.getEquipment(name).hasEffects()) {
            Effects eff = Equipment.getEquipment(name).getEffect();
            b.addPotionEffect(new PotionEffect(eff.getEffect(), eff.getLength(), eff.getStage()));
        }
        
        if(!Equipment.isEquips(name))
            return;
        
        if(Equipment.isEquipsForType(name, "hand") && Equipment.getEquipChance(name, "hand")) {
            b.getEquipment().setItemInHand(new ItemStack(Equipment.getEquip(name, "hand")));
            b.getEquipment().setItemInHandDropChance(Equipment.getDropChance(name, "hand"));
        }
        if(Equipment.isEquipsForType(name, "helmet") && Equipment.getEquipChance(name, "helmet")) {
            b.getEquipment().setHelmet(new ItemStack(Equipment.getEquip(name, "helmet")));
            b.getEquipment().setHelmetDropChance(Equipment.getDropChance(name, "helmet"));
        }
        if(Equipment.isEquipsForType(name, "armor") && Equipment.getEquipChance(name, "armor")) {
            b.getEquipment().setChestplate(new ItemStack(Equipment.getEquip(name, "armor")));
            b.getEquipment().setChestplateDropChance(Equipment.getDropChance(name, "armor"));
        }
        if(Equipment.isEquipsForType(name, "legging") && Equipment.getEquipChance(name, "legging")) {
            b.getEquipment().setLeggings(new ItemStack(Equipment.getEquip(name, "legging")));
            b.getEquipment().setLeggingsDropChance(Equipment.getDropChance(name, "legging"));
        }
        if(Equipment.isEquipsForType(name, "boot") && Equipment.getEquipChance(name, "boot")) {
            b.getEquipment().setBoots(new ItemStack(Equipment.getEquip(name, "boot")));
            b.getEquipment().setBootsDropChance(Equipment.getDropChance(name, "boot"));
        }
    }
    
    public static void villager(Entity e) {
        Villager b = (Villager)e;
        
        String name = b.getType().name().toLowerCase();
        
        if(!Equipment.hasEquipment(name))
            return;
        
        if(!Equipment.getName(name).isEmpty()) {
            b.setCustomName(Equipment.getName(name));
            b.setCustomNameVisible(true);
        }
        
        if(Equipment.getEquipment(name).hasEffects()) {
            Effects eff = Equipment.getEquipment(name).getEffect();
            b.addPotionEffect(new PotionEffect(eff.getEffect(), eff.getLength(), eff.getStage()));
        }
        
        if(!Equipment.isEquips(name))
            return;
        
        if(Equipment.isEquipsForType(name, "hand") && Equipment.getEquipChance(name, "hand")) {
            b.getEquipment().setItemInHand(new ItemStack(Equipment.getEquip(name, "hand")));
            b.getEquipment().setItemInHandDropChance(Equipment.getDropChance(name, "hand"));
        }
        if(Equipment.isEquipsForType(name, "helmet") && Equipment.getEquipChance(name, "helmet")) {
            b.getEquipment().setHelmet(new ItemStack(Equipment.getEquip(name, "helmet")));
            b.getEquipment().setHelmetDropChance(Equipment.getDropChance(name, "helmet"));
        }
        if(Equipment.isEquipsForType(name, "armor") && Equipment.getEquipChance(name, "armor")) {
            b.getEquipment().setChestplate(new ItemStack(Equipment.getEquip(name, "armor")));
            b.getEquipment().setChestplateDropChance(Equipment.getDropChance(name, "armor"));
        }
        if(Equipment.isEquipsForType(name, "legging") && Equipment.getEquipChance(name, "legging")) {
            b.getEquipment().setLeggings(new ItemStack(Equipment.getEquip(name, "legging")));
            b.getEquipment().setLeggingsDropChance(Equipment.getDropChance(name, "legging"));
        }
        if(Equipment.isEquipsForType(name, "boot") && Equipment.getEquipChance(name, "boot")) {
            b.getEquipment().setBoots(new ItemStack(Equipment.getEquip(name, "boot")));
            b.getEquipment().setBootsDropChance(Equipment.getDropChance(name, "boot"));
        }
    }
    
    public static void witch(Entity e) {
        Witch b = (Witch)e;
        
        String name = b.getType().name().toLowerCase();
        
        if(!Equipment.hasEquipment(name))
            return;
        
        if(!Equipment.getName(name).isEmpty()) {
            b.setCustomName(Equipment.getName(name));
            b.setCustomNameVisible(true);
        }
        
        if(Equipment.getEquipment(name).hasEffects()) {
            Effects eff = Equipment.getEquipment(name).getEffect();
            b.addPotionEffect(new PotionEffect(eff.getEffect(), eff.getLength(), eff.getStage()));
        }
        
        if(!Equipment.isEquips(name))
            return;
        
        if(Equipment.isEquipsForType(name, "hand") && Equipment.getEquipChance(name, "hand")) {
            b.getEquipment().setItemInHand(new ItemStack(Equipment.getEquip(name, "hand")));
            b.getEquipment().setItemInHandDropChance(Equipment.getDropChance(name, "hand"));
        }
        if(Equipment.isEquipsForType(name, "helmet") && Equipment.getEquipChance(name, "helmet")) {
            b.getEquipment().setHelmet(new ItemStack(Equipment.getEquip(name, "helmet")));
            b.getEquipment().setHelmetDropChance(Equipment.getDropChance(name, "helmet"));
        }
        if(Equipment.isEquipsForType(name, "armor") && Equipment.getEquipChance(name, "armor")) {
            b.getEquipment().setChestplate(new ItemStack(Equipment.getEquip(name, "armor")));
            b.getEquipment().setChestplateDropChance(Equipment.getDropChance(name, "armor"));
        }
        if(Equipment.isEquipsForType(name, "legging") && Equipment.getEquipChance(name, "legging")) {
            b.getEquipment().setLeggings(new ItemStack(Equipment.getEquip(name, "legging")));
            b.getEquipment().setLeggingsDropChance(Equipment.getDropChance(name, "legging"));
        }
        if(Equipment.isEquipsForType(name, "boot") && Equipment.getEquipChance(name, "boot")) {
            b.getEquipment().setBoots(new ItemStack(Equipment.getEquip(name, "boot")));
            b.getEquipment().setBootsDropChance(Equipment.getDropChance(name, "boot"));
        }
    }
    
    public static void wither(Entity e) {
        Wither b = (Wither)e;
        
        String name = b.getType().name().toLowerCase();
        
        if(!Equipment.hasEquipment(name))
            return;
        
        if(!Equipment.getName(name).isEmpty()) {
            b.setCustomName(Equipment.getName(name));
            b.setCustomNameVisible(true);
        }
        
        if(Equipment.getEquipment(name).hasEffects()) {
            Effects eff = Equipment.getEquipment(name).getEffect();
            b.addPotionEffect(new PotionEffect(eff.getEffect(), eff.getLength(), eff.getStage()));
        }
        
        if(!Equipment.isEquips(name))
            return;
        
        if(Equipment.isEquipsForType(name, "hand") && Equipment.getEquipChance(name, "hand")) {
            b.getEquipment().setItemInHand(new ItemStack(Equipment.getEquip(name, "hand")));
            b.getEquipment().setItemInHandDropChance(Equipment.getDropChance(name, "hand"));
        }
        if(Equipment.isEquipsForType(name, "helmet") && Equipment.getEquipChance(name, "helmet")) {
            b.getEquipment().setHelmet(new ItemStack(Equipment.getEquip(name, "helmet")));
            b.getEquipment().setHelmetDropChance(Equipment.getDropChance(name, "helmet"));
        }
        if(Equipment.isEquipsForType(name, "armor") && Equipment.getEquipChance(name, "armor")) {
            b.getEquipment().setChestplate(new ItemStack(Equipment.getEquip(name, "armor")));
            b.getEquipment().setChestplateDropChance(Equipment.getDropChance(name, "armor"));
        }
        if(Equipment.isEquipsForType(name, "legging") && Equipment.getEquipChance(name, "legging")) {
            b.getEquipment().setLeggings(new ItemStack(Equipment.getEquip(name, "legging")));
            b.getEquipment().setLeggingsDropChance(Equipment.getDropChance(name, "legging"));
        }
        if(Equipment.isEquipsForType(name, "boot") && Equipment.getEquipChance(name, "boot")) {
            b.getEquipment().setBoots(new ItemStack(Equipment.getEquip(name, "boot")));
            b.getEquipment().setBootsDropChance(Equipment.getDropChance(name, "boot"));
        }
    }
    
    public static void wolf(Entity e) {
        Wolf b = (Wolf)e;
        
        String name = b.getType().name().toLowerCase();
        
        if(!Equipment.hasEquipment(name))
            return;
        
        if(!Equipment.getName(name).isEmpty()) {
            b.setCustomName(Equipment.getName(name));
            b.setCustomNameVisible(true);
        }
        
        if(Equipment.getEquipment(name).hasEffects()) {
            Effects eff = Equipment.getEquipment(name).getEffect();
            b.addPotionEffect(new PotionEffect(eff.getEffect(), eff.getLength(), eff.getStage()));
        }
        
        if(!Equipment.isEquips(name))
            return;
        
        if(Equipment.isEquipsForType(name, "hand") && Equipment.getEquipChance(name, "hand")) {
            b.getEquipment().setItemInHand(new ItemStack(Equipment.getEquip(name, "hand")));
            b.getEquipment().setItemInHandDropChance(Equipment.getDropChance(name, "hand"));
        }
        if(Equipment.isEquipsForType(name, "helmet") && Equipment.getEquipChance(name, "helmet")) {
            b.getEquipment().setHelmet(new ItemStack(Equipment.getEquip(name, "helmet")));
            b.getEquipment().setHelmetDropChance(Equipment.getDropChance(name, "helmet"));
        }
        if(Equipment.isEquipsForType(name, "armor") && Equipment.getEquipChance(name, "armor")) {
            b.getEquipment().setChestplate(new ItemStack(Equipment.getEquip(name, "armor")));
            b.getEquipment().setChestplateDropChance(Equipment.getDropChance(name, "armor"));
        }
        if(Equipment.isEquipsForType(name, "legging") && Equipment.getEquipChance(name, "legging")) {
            b.getEquipment().setLeggings(new ItemStack(Equipment.getEquip(name, "legging")));
            b.getEquipment().setLeggingsDropChance(Equipment.getDropChance(name, "legging"));
        }
        if(Equipment.isEquipsForType(name, "boot") && Equipment.getEquipChance(name, "boot")) {
            b.getEquipment().setBoots(new ItemStack(Equipment.getEquip(name, "boot")));
            b.getEquipment().setBootsDropChance(Equipment.getDropChance(name, "boot"));
        }
    }
    
    public static void zombie(Entity e) {
        Zombie b = (Zombie)e;
        
        String name = b.getType().name().toLowerCase();
        
        if(!Equipment.hasEquipment(name))
            return;
        
        if(!Equipment.getName(name).isEmpty()) {
            b.setCustomName(Equipment.getName(name));
            b.setCustomNameVisible(true);
        }
        
        if(Equipment.getEquipment(name).hasEffects()) {
            Effects eff = Equipment.getEquipment(name).getEffect();
            b.addPotionEffect(new PotionEffect(eff.getEffect(), eff.getLength(), eff.getStage()));
        }
        
        if(!Equipment.isEquips(name))
            return;
        
        if(Equipment.isEquipsForType(name, "hand") && Equipment.getEquipChance(name, "hand")) {
            b.getEquipment().setItemInHand(new ItemStack(Equipment.getEquip(name, "hand")));
            b.getEquipment().setItemInHandDropChance(Equipment.getDropChance(name, "hand"));
        }
        if(Equipment.isEquipsForType(name, "helmet") && Equipment.getEquipChance(name, "helmet")) {
            b.getEquipment().setHelmet(new ItemStack(Equipment.getEquip(name, "helmet")));
            b.getEquipment().setHelmetDropChance(Equipment.getDropChance(name, "helmet"));
        }
        if(Equipment.isEquipsForType(name, "armor") && Equipment.getEquipChance(name, "armor")) {
            b.getEquipment().setChestplate(new ItemStack(Equipment.getEquip(name, "armor")));
            b.getEquipment().setChestplateDropChance(Equipment.getDropChance(name, "armor"));
        }
        if(Equipment.isEquipsForType(name, "legging") && Equipment.getEquipChance(name, "legging")) {
            b.getEquipment().setLeggings(new ItemStack(Equipment.getEquip(name, "legging")));
            b.getEquipment().setLeggingsDropChance(Equipment.getDropChance(name, "legging"));
        }
        if(Equipment.isEquipsForType(name, "boot") && Equipment.getEquipChance(name, "boot")) {
            b.getEquipment().setBoots(new ItemStack(Equipment.getEquip(name, "boot")));
            b.getEquipment().setBootsDropChance(Equipment.getDropChance(name, "boot"));
        }
    }
    
    public static void EquipEntity(Entity e) {
        if(e instanceof Bat)
            bat(e);
        else if(e instanceof Blaze)
            blaze(e);
        else if(e instanceof CaveSpider)
            cavespider(e);
        else if(e instanceof Chicken)
            chicken(e);
        else if(e instanceof Cow)
            cow(e);
        else if(e instanceof Creeper)
            creeper(e);
        else if(e instanceof EnderDragon)
            enderdragon(e);
        else if(e instanceof Enderman)
            enderman(e);
        else if(e instanceof Ghast)
            ghast(e);
        else if(e instanceof Giant)
            giant(e);
        else if(e instanceof Horse)
            horse(e);
        else if(e instanceof IronGolem)
            irongolem(e);
        else if(e instanceof MagmaCube)
            magmacube(e);
        else if(e instanceof MushroomCow)
            mushroomcow(e);
        else if(e instanceof Ocelot)
            ocelot(e);
        else if(e instanceof Pig)
            pig(e);
        else if(e instanceof PigZombie)
            pigzombie(e);
        else if(e instanceof Sheep)
            sheep(e);
        else if(e instanceof Silverfish)
            silverfish(e);
        else if(e instanceof Skeleton)
            skeleton(e);
        else if(e instanceof Slime)
            slime(e);
        else if(e instanceof Snowman)
            snowman(e);
        else if(e instanceof Spider)
            spider(e);
        else if(e instanceof Squid)
            squid(e);
        else if(e instanceof Villager)
            villager(e);
        else if(e instanceof Witch)
            witch(e);
        else if(e instanceof Wither)
            wither(e);
        else if(e instanceof Wolf)
            wolf(e);
        else if(e instanceof Zombie)
            zombie(e);
    }
}