package com.company.engine;

public class MercedesEngine extends Engine {

    public MercedesEngine(int capasity) {
        super(capasity);
    }

    @Override
    public void showInfo() {
        System.out.println("Це двигун від Mercedes, об'єм:" + capacity);
    }
}


