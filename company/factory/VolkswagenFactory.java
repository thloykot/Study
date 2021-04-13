package com.company.factory;

import com.company.car.Mark;
import com.company.car.Volkswagen;
import com.company.car.Car;
import com.company.entity.CarFactory;
import com.company.engine.VolkswagenEngine;

import java.util.Scanner;

public class VolkswagenFactory implements CarFactory {
    @Override
    public Car createCar(String model, String color, int price) {
        EngineFactory engineFactory = EngineFactory.getEngineFactory();
        return new Volkswagen(model, price, engineFactory.makeEngine(Mark.Volkswagen));
    }
}
