package com.company.factory;


import com.company.car.Car;
import com.company.car.CarEntity;
import com.company.engine.Engine;

public interface CarFactory {

    Car convertToCar(CarEntity carEntity, Engine engine);

}