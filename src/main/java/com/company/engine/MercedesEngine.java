package com.company.engine;

public class MercedesEngine extends Engine {

    public MercedesEngine(int capasity) {
        super(capasity);
    }

    @Override
    public String toString() {
        return "Це двигун від Mersedes, об'єм:" + capasity;
    }

}
