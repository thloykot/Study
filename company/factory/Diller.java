package com.company.factory;

import com.company.car.Car;
import com.company.car.Mark;
import com.company.entity.Singletone;


public class Diller {
    private final BMWFactory bmwFactory = Singletone.getBmwFactory();
    private final MercedesFactory mercedesFactory = Singletone.getMercedesFactory();
    private final VolkswagenFactory volkswagenFactory = Singletone.getVolkswagenFactory();

    public Car diller(Mark mark, String model, String color, int price) {
        return switch (mark) {
            case BMW -> bmwFactory.createCar(model, color, price);
            case MERCEDES -> mercedesFactory.createCar(model, color, price);
            case VOLKSWAGEN -> volkswagenFactory.createCar(model, color, price);
        };
    }
}
