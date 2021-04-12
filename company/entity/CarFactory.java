package com.company.entity;


import com.company.car.Car;
import com.company.factory.EngineFactory;

public interface CarFactory {
    EngineFactory engineFactory = new EngineFactory();
    Car createCar(String model, String color, int price);

}
