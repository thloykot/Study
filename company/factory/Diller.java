package com.company.factory;

import com.company.car.Car;
import com.company.car.Mark;


public class Diller {

    public Car diller(Mark mark, String model, String color, int price) {
        BMWFactory bmwFactory = new BMWFactory();
        MercedesFactory mercedesFactory = new MercedesFactory();
        VolkswagenFactory volkswagenFactory = new VolkswagenFactory();
        switch (mark) {
            case BMW:
                return bmwFactory.createCar(model, color, price);
            case MERCEDES:
                return mercedesFactory.createCar(model, color, price);
            case VOLKSWAGEN:
                return volkswagenFactory.createCar(model, color, price);
            default:
                return null;
        }
    }
}
