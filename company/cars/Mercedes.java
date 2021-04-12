package com.company.cars;

import com.company.entity.Car;
import com.company.entity.Engine;

public class Mercedes extends Car {
    public Mercedes(String model, int price, Engine engine) {
        super(model, price, engine);
    }

    public void fuel() {
        System.out.println("Mercedes cars have oil, diesel and electric fuel system");
    }
}