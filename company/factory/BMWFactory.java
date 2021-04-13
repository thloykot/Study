package com.company.factory;

import com.company.car.BMW;
import com.company.car.Car;
import com.company.car.Mark;
import com.company.entity.CarFactory;


public class BMWFactory implements CarFactory {

    @Override
    public Car createCar(String model, String color, int price) {
        EngineFactory engineFactory = EngineFactory.getEngineFactory();
        return new BMW(model, price, engineFactory.makeEngine(Mark.BMW));
    }
}
