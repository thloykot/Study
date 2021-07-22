package com.company.diller;

import com.company.builder.OutputBuilder;
import com.company.car.Car;
import com.company.service.CarServise;

import java.util.List;

public class Diller {
    private final CarServise carServise;


    public Diller(CarServise carServise) {
        this.carServise = carServise;
    }

    public void findCars(String model) {
        OutputBuilder.showAllInfo(carServise.findCars(model));
    }
}