package com.company.factory.CarFactoryImpl;

import com.company.car.BMW;
import com.company.car.Car;
import com.company.car.CarEntity;
import com.company.engine.Engine;
import com.company.factory.CarFactory;


public class BMWFactory implements CarFactory {

    @Override
    public Car convertToCar(CarEntity carEntity, Engine engine) {
        return new BMW(carEntity.getModel(), carEntity.getPrice(), carEntity.getColor(), engine);
    }


}
