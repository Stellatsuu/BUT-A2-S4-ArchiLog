package Strategies;

import Objets.Pokemon;

public class StrategiePotionMax implements StrategiePotion {


    @Override
    public int getPV(Pokemon p) {
        return p.getPvmax();
    }
}
