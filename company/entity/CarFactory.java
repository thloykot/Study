package com.company.entity;


import com.company.cars.Car;

public interface CarFactory {
    Car createCar(String model, String color, int price);

}
