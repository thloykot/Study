package com.company.dao;

import com.company.car.Car;
import com.company.car.CarEntity;
import com.company.car.CarMetadata;
import com.company.car.Mark;

import java.util.List;

public interface CarDao {

    int save(Car car, int engineId);

    int delete(int id);

    int update(Car newCar, int oldCarId, int engineId);

    int update(CarMetadata carMetadata, int oldCarId);

    List<CarEntity> findCars(String model);

    boolean isExist(Mark mark, String model, int price, String color);
}
