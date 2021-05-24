package com.company.service;

import com.company.car.Car;

import java.util.Optional;

public interface CarServise {
    void save(Car car);

    void delete(String model);

    void update(Car car,String model);

}
