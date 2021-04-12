package com.company.car;

import com.company.entity.Engine;

public final class BMW extends Car {


    public BMW(String model, int price, Engine engine) {
        super(model, price, engine);
    }
    @Override
    public void print(){
        System.out.println("Це BMW");
    }


}


