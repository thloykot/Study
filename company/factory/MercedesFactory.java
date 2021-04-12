package com.company.factory;


import com.company.car.Mercedes;
import com.company.car.Car;
import com.company.entity.CarFactory;
import com.company.engines.MercedesEngine;

public class MercedesFactory implements CarFactory {
    @Override
    public Car createCar(String model, String color, int price) {
        return new Mercedes(model, price, new MercedesEngine().makeEngine(model));
    }

}
