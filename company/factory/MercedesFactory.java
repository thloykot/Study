package com.company.factory;

import com.company.car.Mark;
import com.company.car.Mercedes;
import com.company.car.Car;
import com.company.entity.CarFactory;
import com.company.entity.FactoryMake;


public class MercedesFactory implements CarFactory {
    private final FactoryMake factoryMake = FactoryMake.getSingltone();
    private final EngineFactory engineFactory = factoryMake.getEngineFactory();

    @Override
    public Car createCar(String model, String color, int price) {
        return new Mercedes(model, price, engineFactory.makeEngine(Mark.MERCEDES, model));
    }
}
