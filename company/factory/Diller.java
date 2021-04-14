package com.company.factory;

import com.company.car.Car;
import com.company.car.Mark;
import com.company.entity.FactoryMake;


public class Diller {
    private final FactoryMake factoryMake = FactoryMake.getSingltone();
    private final BMWFactory bmwFactory = factoryMake.getBmwFactory();
    private final MercedesFactory mercedesFactory = factoryMake.getMercedesFactory();
    private final VolkswagenFactory volkswagenFactory = factoryMake.getVolkswagenFactory();

    public Car getCar(Mark mark, String model, String color, int price) {
        return switch (mark) {
            case BMW -> bmwFactory.createCar(model, color, price);
            case MERCEDES -> mercedesFactory.createCar(model, color, price);
            case VOLKSWAGEN -> volkswagenFactory.createCar(model, color, price);
        };
    }
}
