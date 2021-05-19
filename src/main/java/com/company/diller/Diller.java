package com.company.diller;

import com.company.car.Car;
import com.company.car.Mark;
import com.company.factory.BMWFactory;
import com.company.factory.CarFactory;
import com.company.factory.MercedesFactory;
import com.company.factory.VolkswagenFactory;

import java.util.Map;
import java.util.Optional;


public class Diller {
    private final Map<Mark, CarFactory> carFactoryMap;

    public Diller(BMWFactory bmwFactory, MercedesFactory mercedesFactory, VolkswagenFactory volkswagenFactory) {
        carFactoryMap = Map.of(
                Mark.BMW, bmwFactory,
                Mark.MERCEDES, mercedesFactory,
                Mark.VOLKSWAGEN, volkswagenFactory);
    }

    public Optional<Car> getCar(Mark mark, String model, String color, int price, int sits) {
        if (carFactoryMap.containsKey(mark)) {
            return carFactoryMap.get(mark).createCar(model, color, price, sits);
        }
        return Optional.empty();

    }

}