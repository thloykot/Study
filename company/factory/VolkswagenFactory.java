package com.company.factory;

import com.company.car.Volkswagen;
import com.company.car.Car;
import com.company.entity.CarFactory;
import com.company.engine.VolkswagenEngine;

import java.util.Scanner;

public class VolkswagenFactory extends CarFactory {

    @Override
    public Car createCar(String model, String color, int price) {
        return new Volkswagen(model, price, engineFactory.engine(model));
    }
}
