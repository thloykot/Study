package com.company.factory;


import com.company.car.Car;
import java.util.Optional;

public interface CarFactory {

    Optional<Car> createCar(String model, String color, int price);

}