package com.company.factory;

import com.company.cars.BMW;
import com.company.cars.Volkswagen;
import com.company.engins.BMWEngine;
import com.company.entity.Car;

import java.util.ArrayList;

public class Diller {
    BMWFactory bmwFactory = new BMWFactory();
    MercedesFactory mercedesFactory = new MercedesFactory();
    VilkswagenFactory vilkswagenFactory = new VilkswagenFactory();

    public Car dillerOreder(String mark, String model, String color, int price) {
        switch (mark) {
            case "BMW":
                return bmwFactory.BMW(model, color, price);
            case "Mercedes":
                return mercedesFactory.Mercedes(model,color,price);
            case "Volkswagen":return vilkswagenFactory.volkswagen(model,color,price);
            default:return null;
        }
    }
}
