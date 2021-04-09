package com.company.factory;


import com.company.cars.Mercedes;
import com.company.entity.MercedesEngine;

public class MercedesFactory {
    public Mercedes mercedes(String model, String color, int price){
        return new Mercedes(model,price,new  MercedesEngine().makeEngine(model));
    }
}
