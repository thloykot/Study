package com.company.car;

import com.company.entity.Engine;

public final class Mercedes extends Car {

    private int sits;

    public int getSits() {
        return sits;
    }

    public Mercedes(String model, int price, Engine engine, int sits) {
        super(model, price, engine);
        this.sits = sits;
    }
}