package com.company.factory;

import com.company.car.Car;
import com.company.car.Mark;
import com.company.entity.SingeltonProvider;


public class Diller {
    private final BMWFactory bmwFactory = SingeltonProvider.getBmwFactory();
    private final MercedesFactory mercedesFactory = SingeltonProvider.getMercedesFactory();
    private final VolkswagenFactory volkswagenFactory = SingeltonProvider.getVolkswagenFactory();

    public Car getCar(Mark mark, String model, String color, int price, int sits) {
        return switch (mark) {
            case BMW -> bmwFactory.createCar(model, color, price, sits);
            case MERCEDES -> mercedesFactory.createCar(model, color, price, sits);
            case VOLKSWAGEN -> volkswagenFactory.createCar(model, color, price, sits);
        };
    }
}
