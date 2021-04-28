package com.company.factory;

import com.company.car.Car;
import com.company.car.Mark;
import com.company.entity.SingeltonProvider;

import java.util.Map;
import java.util.Optional;


public class Diller {
    private static final Map<Mark, CarFactory> enumMap = Map.of(
            Mark.BMW, SingeltonProvider.getBmwFactory(),
            Mark.MERCEDES, SingeltonProvider.getMercedesFactory(),
            Mark.VOLKSWAGEN, SingeltonProvider.getVolkswagenFactory());

    public Optional<Car> getCar(Mark mark, String model, String color, int price, int sits) {
        if (enumMap.containsKey(mark)) {
            return enumMap.get(mark).createCar(model, color, price, sits);
        }
        return Optional.empty();

    }

}