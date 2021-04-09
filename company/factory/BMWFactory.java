package com.company.factory;

import com.company.cars.BMW;
import com.company.entity.BMWEngine;

public class BMWFactory {
    public BMW bmw(String model, String color, int price){
        return new BMW(model,price,new BMWEngine().makeEngine(model));
    }
}
