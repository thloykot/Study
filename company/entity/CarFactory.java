package com.company.entity;


import com.company.car.Car;
import com.company.factory.EngineFactory;

public interface CarFactory {

    public abstract Car createCar(String model, String color, int price);

}
