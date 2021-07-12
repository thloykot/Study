package com.company.car;


import com.company.engine.Engine;

public final class Volkswagen extends Car {

    public Volkswagen(String model, int price, String color, Engine engine) {
        super(Mark.VOLKSWAGEN, model, price, color, engine);
    }
}
