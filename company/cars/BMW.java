package com.company.cars;


import com.company.entity.Car;
import com.company.entity.Engine;

public class BMW extends Car {
    public BMW(String model, int price, Engine engine) {
        super(model, price, engine);
    }

    public void fuel() {
        System.out.println("BMW cars have oil, diesel and electric fuel system");
    }
}


