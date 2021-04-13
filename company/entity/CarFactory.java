package com.company.entity;


import com.company.car.Car;
import com.company.factory.EngineFactory;

public abstract class CarFactory {

    protected EngineFactory engineFactory = new EngineFactory();

    public abstract Car createCar(String model, String color, int price);

}
