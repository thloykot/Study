package com.company.factory;

import com.company.cars.BMW;
import com.company.engins.BMWEngine;
import com.company.entity.Car;

public class BMWFactory {
    BMWEngine bmwEngine = new BMWEngine();
    public Car BMW(String model,String color,int price){
        return new BMW(bmwEngine.makeEngine(model),model,price);
    }
}
