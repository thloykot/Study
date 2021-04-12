package com.company.car;

import com.company.entity.Engine;

public class BMW extends Car {

    public String getFuel() {
        return fuel;
    }

    private String fuel;

    public BMW(String model, int price, Engine engine,String fuel) {
        super(model, price, engine);
        this.fuel = fuel;
    }

}


