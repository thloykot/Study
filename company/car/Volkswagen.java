package com.company.car;

import com.company.entity.Engine;

public final class Volkswagen extends Car {

    public Volkswagen(String model, int price, Engine engine) {
        super(model, price, engine);
    }

    @Override
    public void printInfo() {
        System.out.println("Це Mercedes");
    }

}
