package com.company.car;


import com.company.engine.Engine;

public final class Mercedes extends Car {

    public Mercedes(String model, int price, String color, Engine engine) {
        super(Mark.MERCEDES, model, price, color, engine);
    }
}