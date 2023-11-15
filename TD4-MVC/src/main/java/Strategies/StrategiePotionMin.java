package Strategies;

import Objets.Pokemon;

public class StrategiePotionMin implements StrategiePotion {
    @Override
    public int getPV(Pokemon p) {
        return 20;
    }
}
