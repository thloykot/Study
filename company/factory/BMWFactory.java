package com.company.factory;

import com.company.car.BMW;
import com.company.car.Car;
import com.company.entity.CarFactory;


public class BMWFactory extends CarFactory {

    @Override
    public Car createCar(String model, String color, int price) {
        return new BMW(model, price, engineFactory.engine(model));
    }
}
