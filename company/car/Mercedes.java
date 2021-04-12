package com.company.car;

import com.company.entity.Engine;

public class Mercedes extends Car {

    private int sits;

    public int getSits() {
        return sits;
    }

    public void setSits(int sits) {
        this.sits = sits;
    }


    public Mercedes(String model, int price, Engine engine) {
        super(model, price, engine);
    }
}