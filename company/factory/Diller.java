package com.company.factory;
import com.company.entity.Car;

public class Diller {
    public Car diller(String mark,String model,String color,int price){
        switch (mark){
            case "BMW":return new BMWFactory().bmw(model,color,price);
            case "Mercedes":return new MercedesFactory().mercedes(model,color,price);
            case "Volkswagen":return new VolkswagenFactory().volkswagen(model,color,price);
            default:return null;
        }
    }
}
