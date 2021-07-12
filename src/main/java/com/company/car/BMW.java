package com.company.car;


import com.company.engine.Engine;

public final class BMW extends Car {

    public BMW(String model, int price, String color, Engine engine) {
        super(Mark.BMW, model, price, color, engine);
    }

}