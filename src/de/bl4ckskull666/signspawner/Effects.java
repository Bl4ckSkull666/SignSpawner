package de.bl4ckskull666.signspawner;

import org.bukkit.potion.PotionEffectType;

public class Effects {
    private final PotionEffectType _pet;
    private final int _stage;
    private final int _length;
    
    public Effects(PotionEffectType pet, int stage, int length) {
        _pet = pet;
        _stage = stage;
        _length = length;
    }
    
    public PotionEffectType getEffect() {
        return _pet;
    }
    
    public int getStage() {
        return _stage;
    }
    
    public int getLength() {
        return _length*20;
    }
}