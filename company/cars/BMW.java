package com.company.cars;

import com.company.entity.Engine;

public class BMW extends Car {

    private String fuel;

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }


    public BMW(String model, int price, Engine engine) {
        super(model, price, engine);
    }

}


