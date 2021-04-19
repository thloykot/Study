package com.company.sorting;

import com.company.car.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting {

    public List<Car> Sort(ArrayList<Car> car) {

        return car.stream().sorted((o1, o2) -> o1.getModel().toUpperCase()
                .compareTo(o2.getModel().toUpperCase())).collect(Collectors.toUnmodifiableList());
    }
}