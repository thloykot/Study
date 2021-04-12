package com.company.factory;

import com.company.cars.BMW;
import com.company.engine.BMWEngine;
import com.company.cars.Car;
import com.company.entity.CarFactory;

public class BMWFactory implements CarFactory {
    @Override
    public Car createCar(String model, String color, int price) {
        return new BMW(model, price, new BMWEngine().makeEngine(model));
    }
}
