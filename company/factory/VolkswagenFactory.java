package com.company.factory;

import com.company.car.Volkswagen;
import com.company.car.Car;
import com.company.entity.CarFactory;
import com.company.engines.VolkswagenEngine;

import java.util.Scanner;

public class VolkswagenFactory implements CarFactory {
    @Override
    public Car createCar(String model, String color, int price) {
        System.out.println("Car Type");
        String carType = new Scanner(System.in).nextLine();
        return new Volkswagen(model, price, new VolkswagenEngine().makeEngine(model),carType);
    }
}
