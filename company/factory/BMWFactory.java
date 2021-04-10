package com.company.factory;

import com.company.cars.BMW;
import com.company.entity.BMWEngine;
import com.company.entity.Car;
import com.company.entity.CarFactory;

public class BMWFactory implements CarFactory {
    @Override
    public Car createCar(String model, String color, int price) {
        return new BMW(model, price, new BMWEngine().makeEngine(model));
    }
}
