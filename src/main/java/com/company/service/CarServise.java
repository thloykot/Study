package com.company.service;

import com.company.car.Car;
import com.company.car.CarMetadata;

import java.util.List;

public interface CarServise {
    int save(Car car);

    int delete(int id);

    int update(Car car, int id);

    int update(CarMetadata carMetadata, int oldCarId);

    List<Car> findCars(String model);

}
