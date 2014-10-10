package de.bl4ckskull666.signspawner.utils;

import de.bl4ckskull666.signspawner.SignSpawner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import org.bukkit.entity.EntityType;

public final class Util {
    public static boolean isNumeric(String str) {
        try {
            int n = Integer.parseInt(str);
            return true;
        } catch(NumberFormatException e) {
            return false;
        }
    }
    
    /*public static int getRand(int max) {
        Random rand = new Random(); 
        return (rand.nextInt(max) + 1);
    }
    
    public static int getRand(int min, int max) {
        int diff = Math.max(min, max)-Math.min(min, max);
        Random rand = new Random(); 
        return (rand.nextInt(diff) + Math.min(min, max));
    }*/
    
    public static ArrayList<EntityType> getEntityList(List<String> list) {
        ArrayList<EntityType> etl = new ArrayList<>();
        for(String str_et: list) {
            if(EntityType.valueOf(str_et.toUpperCase()) == null) {
                SignSpawner.getInstance().getLogger().log(Level.INFO, "Can't found EntityType " + str_et + ", ignore it.");
            }
            etl.add(EntityType.valueOf(str_et.toUpperCase()));
        }
        return etl;
    }
}