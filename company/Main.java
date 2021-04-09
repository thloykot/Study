package com.company;


import com.company.entity.Car;
import com.company.factory.Diller;
import com.company.sorting.BabbleSort;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Diller diller = new Diller();
        ArrayList<Car> cars = new ArrayList<>();
        BabbleSort sort = new BabbleSort();
        /*System.out.println("hello world");
        System.out.println(NumberUtils.LONG_ZERO);
        System.out.println(NumberUtils.INTEGER_ZERO);
        int[] i  = {4,6,36,31,5423,765};
        System.out.println(NumberUtils.max(i));*/
        cars.add(diller.dillerOreder("BMW", "X-5", "Black", 1000));
        cars.add(diller.dillerOreder("Volkswagen","Monjero","blue",9000));
        cars.add(diller.dillerOreder("Mercedes", "Bemz", "red", 900));
        ArrayList<Car> List = sort.sort(cars);
        for (int i = 0; i < cars.size(); i++ ) {
            System.out.println(List.get(i).getModel());
        }

    }
}