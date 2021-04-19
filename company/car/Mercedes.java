package com.company.car;

import com.company.engine.Engine;

public final class Mercedes extends Car {

    public Mercedes(String model, int price, Engine engine) {
        super(model, price, engine);
    }

    @Override
    public void printInfo() {
        System.out.println("Це Mercedes");
    }

}