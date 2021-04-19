package com.company.factory;


import com.company.car.Car;

public interface CarFactory {

    Car createCar(String model, String color, int price, int sits);

}
