package com.company.factory;

import com.company.car.BMW;
import com.company.engine.BMWEngine;
import com.company.car.Car;
import com.company.entity.CarFactory;

import java.util.Scanner;

public class BMWFactory implements CarFactory {
    @Override
    public Car createCar(String model, String color, int price) {
        return new BMW(model, price,engineFactory.engine(model));
    }
}
