package com.company.factory;

import com.company.car.BMW;
import com.company.car.Car;
import com.company.car.Mark;
import com.company.engine.Engine;
import com.company.entity.SingeltonProvider;

import java.util.Optional;


public class BMWFactory implements CarFactory {
    private final EngineFactory engineFactory = SingeltonProvider.getEngineFactory();

    @Override
    public Optional<Car> createCar(String model, String color, int price, int sits) {
        Optional<Engine> engine = engineFactory.makeEngine(Mark.BMW);
        return engine.map(value -> new BMW(model, price, value));
    }

}
