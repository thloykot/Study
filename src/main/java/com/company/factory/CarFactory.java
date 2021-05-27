package com.company.factory;


import com.company.car.Car;
import com.company.car.Mark;

import java.util.Optional;

public interface CarFactory {

    Optional<Car> createCar(Mark mark, String model, String color, int price);

}