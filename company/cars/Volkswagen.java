package com.company.cars;

import com.company.entity.Engine;

public class Volkswagen extends Car {
    
    private String carType;

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }


    public Volkswagen(String model, int price, Engine engine) {
        super(model, price, engine);
    }


}
