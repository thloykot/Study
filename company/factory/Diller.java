package com.company.factory;

import com.company.car.Car;
import com.company.car.Mark;
import com.company.entity.SingeltonProvider;

import java.util.EnumMap;


public class Diller {
    private final BMWFactory bmwFactory = SingeltonProvider.getBmwFactory();
    private final MercedesFactory mercedesFactory = SingeltonProvider.getMercedesFactory();
    private final VolkswagenFactory volkswagenFactory = SingeltonProvider.getVolkswagenFactory();
    private static final EnumMap<Mark, CarFactory> enumMap = new EnumMap<>(Mark.class);

    private EnumMap<Mark, CarFactory> makeMap() {
        enumMap.put(Mark.BMW, bmwFactory);
        enumMap.put(Mark.MERCEDES, mercedesFactory);
        enumMap.put(Mark.VOLKSWAGEN, volkswagenFactory);
        return enumMap;
    }

    public Car getCar(Mark mark, String model, String color, int price, int sits) {
        try {
            return makeMap().get(mark)
                    .createCar(model, color, price, sits);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        return null;
    }
}
