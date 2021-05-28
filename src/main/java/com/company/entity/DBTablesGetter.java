package com.company.entity;

import com.company.car.Car;
import com.company.car.CarBuilder;
import com.company.car.Mark;
import com.company.engine.Engine;
import com.company.engine.EngineBuilder;
import com.company.service.CarServise;
import com.company.service.EngineServise;

import java.util.Optional;

public class DBTablesGetter {
    private final Mark mark;
    private final String model;
    private final int price;
    private final String color;
    private final int capasity;
    private final CarBuilder carBuilder;
    private final EngineBuilder engineBuilder;



    public DBTablesGetter(Mark mark, String model, int price, String color, int capasity) {
        this.mark = mark;
        this.model = model;
        this.price = price;
        this.color = color;
        this.capasity = capasity;
        carBuilder = new CarBuilder(mark,model,price,color);
        engineBuilder = new EngineBuilder(mark,capasity);
    }

    public void giveInfo(){
        Optional<Car> car = carBuilder.createCar();
        Optional<Engine> engine = engineBuilder.getEngine();
        if(car.isPresent() & engine.isPresent()){
            System.out.println(car.get() + "" + engine.get());
        }

    }
}
