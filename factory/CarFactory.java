package com.factory;
import com.company.BMW;
import com.company.Mercedes;
import com.company.Volkswagen;
import com.company.Volkswagen;
import com.entity.Car;
import com.entity.Engine;

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
