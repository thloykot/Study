package com.company.factory;

import com.company.car.Car;
import com.company.car.Mark;
import java.util.Map;



public class Diller {
    private static final Map<Mark, CarFactory> enumMap = Map.of(Mark.BMW, new BMWFactory(),
            Mark.MERCEDES, new MercedesFactory(),Mark.VOLKSWAGEN, new VolkswagenFactory());


    public Car getCar(Mark mark, String model, String color, int price, int sits) {
        return enumMap.getOrDefault(mark,new BMWFactory()).createCar(model,color,price,sits);

    }
}
