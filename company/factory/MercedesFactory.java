package com.company.factory;

import com.company.cars.Mercedes;
import com.company.engins.MercedesEngine;
import com.company.entity.Car;

public class MercedesFactory {
    MercedesEngine mercedesEngine = new MercedesEngine();
    public Car Mercedes(String model, String color, int price){
        return new Mercedes(mercedesEngine.makeEngine(model),model,price);
    }
}
