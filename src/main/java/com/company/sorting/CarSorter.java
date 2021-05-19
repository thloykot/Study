package com.company.sorting;

import com.company.car.Car;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CarSorter {

    public List<Car> sort(ArrayList<Car> car) {
        return car.stream().sorted(Comparator.comparing(o -> o.getModel()
                .toUpperCase())).collect(Collectors.toUnmodifiableList());
    }
}