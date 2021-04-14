package com.company.factory;

import com.company.car.Mark;
import com.company.car.Volkswagen;
import com.company.car.Car;
import com.company.entity.CarFactory;
import com.company.entity.Singletone;


public class VolkswagenFactory implements CarFactory {
    private final EngineFactory engineFactory = Singletone.getEngineFactory();

    @Override
    public Car createCar(String model, String color, int price) {
        return new Volkswagen(model, price, engineFactory.makeEngine(Mark.VOLKSWAGEN, model));
    }
}
