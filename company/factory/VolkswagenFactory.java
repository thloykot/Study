package com.company.factory;

import com.company.cars.Volkswagen;
import com.company.entity.Car;
import com.company.entity.CarFactory;
import com.company.entity.VolkswagenEngine;

public class VolkswagenFactory implements CarFactory {
    @Override
    public Car createCar(String model, String color, int price) {
        return new Volkswagen(model, price, new VolkswagenEngine().makeEngine(model));
    }
}
