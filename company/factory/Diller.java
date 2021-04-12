package com.company.factory;

import com.company.car.Car;


public class Diller {
    public Car diller(String mark, String model, String color, int price) {
        BMWFactory bmwFactory = new BMWFactory();
        MercedesFactory mercedesFactory = new MercedesFactory();
        VolkswagenFactory volkswagenFactory = new VolkswagenFactory();
        switch (mark) {
            case "BMW":
                return bmwFactory.createCar(model, color, price);
            case "Mercedes":
                return mercedesFactory.createCar(model, color, price);
            case "Volkswagen":
                return volkswagenFactory.createCar(model, color, price);
            default:
                return null;
        }
    }
}
