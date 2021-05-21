package com.company.factory;

import com.company.car.Car;
import com.company.car.CarEntity;
import com.company.car.Volkswagen;
import com.company.engine.Engine;

public class VolkswagenFactory implements CarFactory {

    @Override
    public Car convertToCar(CarEntity carEntity, Engine engine) {
        return new Volkswagen(carEntity.getModel(), carEntity.getPrice(), carEntity.getColor(), engine);
    }
}
