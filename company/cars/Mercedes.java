package com.company.cars;

import com.company.entity.Engine;

public class Mercedes extends Car {
    public Mercedes(String model, int price, Engine engine) {
        super(model, price, engine);
    }

    public void sits() {
        System.out.println("Mercedes cars has 2 or 4 sits in their cars and 22 in their basses");
    }
}