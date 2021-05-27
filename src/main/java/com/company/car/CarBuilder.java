package com.company.car;

import com.company.engine.EngineBuilder;
import com.company.entity.CarsProvider;
import com.company.entity.SingletonProvider;

import java.util.Optional;

public class CarBuilder {
    private final String model;
    private final int price;
    private final String color;
    private final Mark mark;
    private final CarsProvider carsProvider = SingletonProvider.getCarsProvider();

    public CarBuilder(Mark mark,String model, int price, String color) {
        this.model = model;
        this.price = price;
        this.color = color;
        this.mark = mark;
    }

    public Optional<Car> createCar(){
        return carsProvider.getCar(mark, model, color, price);
    }
}
