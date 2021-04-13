package com.company.factory;


import com.company.car.Mark;
import com.company.car.Mercedes;
import com.company.car.Car;
import com.company.entity.CarFactory;


public class MercedesFactory implements CarFactory {

    @Override
    public Car createCar(String model, String color, int price) {
        EngineFactory engineFactory = EngineFactory.getEngineFactory();
        return new Mercedes(model, price, engineFactory.makeEngine(Mark.Mercedes));
    }

}
