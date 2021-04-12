package com.company.car;

import com.company.entity.Engine;

public final class BMW extends Car {

    private String fuel;

    public String getFuel() {
        return fuel;
    }

    public BMW(String model, int price, Engine engine,String fuel) {
        super(model, price, engine);
        this.fuel = fuel;
    }

}


