package com.company.builder;

import com.company.car.Car;

import java.util.List;

public class OutputBuilder {

    public static void showAllInfo(List<Car> carArrayList) {
        carArrayList.forEach(System.out::println);
    }

}
