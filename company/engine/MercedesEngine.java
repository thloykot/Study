package com.company.engine;

import com.company.entity.Engine;

public class MercedesEngine extends Engine {

    public MercedesEngine(String model, int capasity) {
        super(model, capasity);
    }

    @Override
    public void showMark() {
        System.out.println("Це двигун від Mercedes");
    }
}


