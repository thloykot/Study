package com.company.factory;

import com.company.car.BMW;
import com.company.car.Car;
import com.company.car.Mark;
import com.company.entity.CarFactory;
import com.company.entity.SingeltonProvider;


public class BMWFactory implements CarFactory {
    private final EngineFactory engineFactory =SingeltonProvider.getEngineFactory();

    @Override
    public Car createCar(String model, String color, int price) {
        return new BMW(model, price, engineFactory.makeEngine(Mark.BMW,model));
    }
}
