package com.company.sorting;

import com.company.car.Car;

import java.util.ArrayList;

public class BabbleSort {

    public ArrayList<Car> sort(ArrayList<Car> car) {
        boolean isSorted = false;
        Car buf;
        while (!isSorted) {
            isSorted = true;
            for ( int i = 0; i < car.size() - 1; i++ ) {
                if (car.get(i).getModel().compareTo(car.get(i + 1).getModel()) > 0) {
                    isSorted = false;

                    buf = car.get(i);
                    car.set(i, car.get(i + 1));
                    car.set(i + 1, buf);

                }
            }
        }
        return car;
    }
}