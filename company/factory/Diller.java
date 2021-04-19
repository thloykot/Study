package com.company.factory;

import com.company.car.Car;
import com.company.car.Mark;
import com.company.entity.SingeltonProvider;

import java.util.EnumMap;
import java.util.Map;

import static java.util.Map.entry;


public class Diller {
    private static final BMWFactory bmwFactory = SingeltonProvider.getBmwFactory();
    private static final MercedesFactory mercedesFactory = SingeltonProvider.getMercedesFactory();
    private static final VolkswagenFactory volkswagenFactory = SingeltonProvider.getVolkswagenFactory();
    private static final Map<Mark, CarFactory> enumMap = Map.ofEntries(entry(Mark.BMW, bmwFactory),
            entry(Mark.MERCEDES, mercedesFactory),entry(Mark.VOLKSWAGEN, volkswagenFactory));


    public Car getCar(Mark mark, String model, String color, int price, int sits) {
        return enumMap.get(mark)
                .createCar(model, color, price, sits);
    }
}
