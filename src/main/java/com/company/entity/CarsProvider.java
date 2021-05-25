package com.company.entity;

import com.company.car.Car;
import com.company.car.Mark;
import com.company.factory.BMWFactory;
import com.company.factory.CarFactory;
import com.company.factory.MercedesFactory;
import com.company.factory.VolkswagenFactory;

import java.util.Map;
import java.util.Optional;

public class CarsProvider {
    private final Map<Mark, CarFactory> carFactoryMap;
    private final Map<CarFactory, Mark> markMap;
    private final Map<String, Mark> markString;

    public CarsProvider(BMWFactory bmwFactory, MercedesFactory mercedesFactory, VolkswagenFactory volkswagenFactory) {
        carFactoryMap = Map.of(
                Mark.BMW, bmwFactory,
                Mark.MERCEDES, mercedesFactory,
                Mark.VOLKSWAGEN, volkswagenFactory);
        markMap = Map.of(
                bmwFactory, Mark.BMW,
                mercedesFactory, Mark.MERCEDES,
                volkswagenFactory, Mark.VOLKSWAGEN);
        markString = Map.of(
                "MERCEDES", Mark.MERCEDES,
                "BMW", Mark.BMW,
                "VOLKSWAGEN", Mark.VOLKSWAGEN);
    }

    public Mark getMark(Car car) {
        return markMap.get(car);
    }

    public Mark getMark(String mark) {
        return markString.get(mark);
    }

    public Optional<Car> getCar(Mark mark, String model, String color, int price) {
        if (carFactoryMap.containsKey(mark)) {
            return carFactoryMap.get(mark).createCar(model, color, price);
        }
        return Optional.empty();

    }
}
