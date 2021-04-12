package com.company.cars;

import com.company.entity.Car;
import com.company.entity.Engine;

public class Volkswagen extends Car {
    public Volkswagen(String model, int price, Engine engine) {
        super(model, price, engine);
    }

    public void fuel() {
        System.out.println("Volkswagen cars have oil, diesel and electric fuel system");
    }
}
