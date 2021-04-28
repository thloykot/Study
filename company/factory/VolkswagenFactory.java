package com.company.factory;

import com.company.car.Car;
import com.company.car.Mark;
import com.company.car.Volkswagen;
import com.company.engine.Engine;
import com.company.entity.SingeltonProvider;

import java.util.Optional;


public class VolkswagenFactory implements CarFactory {
    private final EngineFactory engineFactory = SingeltonProvider.getEngineFactory();

    @Override
    public Optional<Car> createCar(String model, String color, int price, int sits) {
        Optional<Engine> engine = engineFactory.makeEngine(Mark.VOLKSWAGEN);
        return engine.map(value -> new Volkswagen(model, price, value));
    }

}
