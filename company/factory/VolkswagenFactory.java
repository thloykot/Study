package com.company.factory;

import com.company.cars.Volkswagen;
import com.company.cars.Car;
import com.company.entity.CarFactory;
import com.company.engines.VolkswagenEngine;

public class VolkswagenFactory implements CarFactory {
    @Override
    public Car createCar(String model, String color, int price) {
        return new Volkswagen(model, price, new VolkswagenEngine().makeEngine(model));
    }
}
