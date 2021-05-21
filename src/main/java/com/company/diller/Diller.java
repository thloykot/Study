package com.company.diller;

import com.company.car.Car;
import com.company.service.CarServise;

import java.util.List;

public class Diller {
    private final CarServise carServise;


    public Diller(CarServise carServise) {
        this.carServise = carServise;
    }

    public List<Car> findCars(String model) {
        return carServise.findCars(model);
    }
}