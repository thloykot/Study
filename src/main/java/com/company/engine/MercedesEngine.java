package com.company.engine;

public class MercedesEngine extends Engine {

    public MercedesEngine(int capasity) {
        super(capasity);
    }

    @Override
    public String toString() {
        return "двигун марки Mersedes, об'єм:" + capasity;
    }

}
