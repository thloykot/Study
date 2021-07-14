package com.company.factory.CarFactoryImpl;


import com.company.car.Car;
import com.company.car.CarEntity;
import com.company.car.Mercedes;
import com.company.engine.Engine;
import com.company.factory.CarFactory;


public class MercedesFactory implements CarFactory {

    @Override
    public Car convertToCar(CarEntity carEntity, Engine engine) {
        return new Mercedes(carEntity.getModel(), carEntity.getPrice(), carEntity.getColor(), engine);
    }
}