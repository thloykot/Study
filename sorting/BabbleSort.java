package com.sorting;
import com.entity.Car;

import java.util.ArrayList;

public class BabbleSort {
    public ArrayList<Car> sort(ArrayList<Car> Car) {
        boolean isSorted = false;
        Car buf;
        while (!isSorted) {
            isSorted = true;
            for ( int i = 0; i < Car.size() - 1; i++ ) {
                if (Car.get(i).getModel().compareTo(Car.get(i+1).getModel())>0) {
                    isSorted = false;

                    buf = Car.get(i);
                    Car.set(i,Car.get(i+1));
                    Car.set(i+1,buf);

                }
            }
        }
        return Car;
    }
}
