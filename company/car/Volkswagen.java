package com.company.car;

import com.company.entity.Engine;

public final  class Volkswagen extends Car {
    
    private final String carType;

    public Volkswagen(String model, int price, Engine engine, String carType) {
        super(model, price, engine);
        this.carType = carType;
    }

    public String getCarType() {
        return carType;
    }




}
