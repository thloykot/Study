package com.company.factory;

import com.company.cars.Car;

public class Diller {
    public Car diller(String mark, String model, String color, int price) {
        switch (mark) {
            case "BMW":
                return new BMWFactory().createCar(model, color, price);
            case "Mercedes":
                return new MercedesFactory().createCar(model, color, price);
            case "Volkswagen":
                return new VolkswagenFactory().createCar(model, color, price);
            default:
                return null;
        }
    }
}
