package com.company.factory;



import com.company.cars.Volkswagen;
import com.company.engins.VolkswagenEngine;
import com.company.entity.Car;

public class VilkswagenFactory {
    VolkswagenEngine volkswagenEngine = new VolkswagenEngine();
    public Car volkswagen(String model, String color, int price){
        return new Volkswagen(volkswagenEngine.makeEngine(model),model,price);
    }
}
