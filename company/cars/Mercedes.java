package com.company.cars;

import com.company.entity.Car;
import com.company.entity.Engine;

public class Mercedes extends Car {
    private String model;
    private int price;
    private Engine engine;
    public Mercedes(Engine engine, String model, int price) {
        super(engine, model, price);
    }

}