package com.company.builder;

import com.company.car.Car;

import java.util.List;

public class OutputBuilder {

    public void showAllInfo(List<Car> carArrayList) {
        for ( Car i : carArrayList ) {
            System.out.println(i);
        }
    }
    public void showAllInfo(Car car){
        System.out.println(car);
    }

}
