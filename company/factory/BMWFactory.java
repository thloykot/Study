package com.company.factory;

import com.company.car.BMW;
import com.company.car.Car;
import com.company.car.Mark;
import com.company.engine.Engine;

import java.util.Optional;


public class BMWFactory implements CarFactory {
    private final EngineFactory engineFactory;

    public BMWFactory(EngineFactory engineFactory){
        this.engineFactory = engineFactory;
    }

    @Override
    public Optional<Car> createCar(String model, String color, int price, int sits) {
        Optional<Engine> engine = engineFactory.makeEngine(Mark.BMW);
        return engine.map(value -> new BMW(model, price, value));
    }

}
