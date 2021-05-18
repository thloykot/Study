package com.company.factory;


import com.company.car.Car;
import com.company.car.Mark;
import com.company.car.Mercedes;
import com.company.engine.Engine;

import java.util.Optional;


public class MercedesFactory implements CarFactory {
    private final EngineFactory engineFactory;

    public MercedesFactory(EngineFactory engineFactory){
        this.engineFactory = engineFactory;
    }

    @Override
    public Optional<Car> createCar(String model, String color, int price, int sits) {
        Optional<Engine> engine = engineFactory.makeEngine(Mark.MERCEDES);
        return engine.map(value -> new Mercedes(model, price, value));
    }

}