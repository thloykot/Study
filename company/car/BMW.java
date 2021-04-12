package com.company.car;

import com.company.entity.Engine;

public final class BMW extends Car {

    private final String fuel;

    public BMW(String model, int price, Engine engine,String fuel) {
        super(model, price, engine);
        this.fuel = fuel;
    }

    public String getFuel() {
        return fuel;
    }

}


