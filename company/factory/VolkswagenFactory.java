package com.company.factory;


import com.company.cars.Volkswagen;
import com.company.entity.VolkswagenEngine;

public class VolkswagenFactory {
    public Volkswagen volkswagen(String model, String color, int price){
        return new Volkswagen(model,price,new VolkswagenEngine().makeEngine(model));
    }
}
