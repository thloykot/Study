package com.company.factory;


import com.company.car.Car;
import com.company.car.Mark;

import java.util.function.BiFunction;

public interface CarFactory  {

    Car createCar(String model, String color, int price, int sits);

}
