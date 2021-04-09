package com.company.cars;

import com.company.entity.Car;
import com.company.entity.Engine;

public class Volkswagen extends Car {
    private String model;
    private int price;
    private Engine engine;

    public Volkswagen(Engine engine, String model, int price) {
        super(engine, model, price);
    }

}
