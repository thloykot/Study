package com.company.service;

import com.company.car.Car;
import com.company.dao.CarDao;
import com.company.entity.SingletonProvider;

import java.util.List;
import java.util.Optional;


public class CarServiseImpl implements CarServise {

    private final CarDao carDao = SingletonProvider.getCarDao();

    @Override
    public void save(Car car) {
        carDao.save(car);
    }

    @Override
    public void delete(String model) {
        carDao.delete(model);
    }

    @Override
    public void update(Car car, String model) {
        carDao.update(car, model);
    }

    @Override
    public Optional<Car> get(String model) {
        return carDao.get(model);
    }

    @Override
    public List<Car> getAll() {
        return carDao.getAll();
    }
}
