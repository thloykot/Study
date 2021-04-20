package com.company.factory;

import com.company.car.Mark;
import com.company.car.Volkswagen;
import com.company.car.Car;
import com.company.entity.SingeltonProvider;


public class VolkswagenFactory implements CarFactory {
    private final EngineFactory engineFactory = SingeltonProvider.getEngineFactory();

    @Override
    public Car createCar(String model, String color, int price,int sits) {
        return new Volkswagen(model, price, engineFactory.makeEngine(Mark.VOLKSWAGEN));
    }
}
