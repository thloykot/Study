package com.company.factory;

import com.company.car.BMW;
import com.company.car.Mercedes;
import com.company.car.Volkswagen;
import com.company.entity.Car;
import com.company.entity.Engine;

public class CarFactory implements Engine {
    public Car Factory(String Mark, String color, String model, int price){
        switch (Mark){
            case "BMW": return new BMW(info(Mark),model,price);
            case "Volkvagen": return new Volkswagen(info(Mark),model,price);
            case "Mercedes":return new Mercedes(info(Mark),model,price);
            default:return null;
        }
    }
    @Override
    public String info(String Mark) {
        return Mark + " engine";
    }



}