package com.company.dao;

import com.company.car.Car;

import java.util.List;
import java.util.Optional;

public interface CarDao {

    void save(Car car);

    void delete(String model);

    void update(Car car, String model);

    Optional<Car> get(String model);

    List<Car> getAll();
}
