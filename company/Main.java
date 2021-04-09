package com.company;


import java.util.ArrayList;

import com.company.entity.Car;
import com.company.factory.CarFactory;
import com.company.sorting.BabbleSort;

public class Main {

    public static void main(String[] args) {
        /*System.out.println("hello world");
        System.out.println(NumberUtils.LONG_ZERO);
        System.out.println(NumberUtils.INTEGER_ZERO);
        int[] i  = {4,6,36,31,5423,765};
        System.out.println(NumberUtils.max(i));*/
        CarFactory factory = new CarFactory();

        ArrayList<Car> list = new ArrayList<Car>();
        list.add(factory.Factory("BMW", "blue", "X5", 10000));
        list.add(factory.Factory("Volkvagen", "black", "Jetta", 90000));
        list.add(factory.Factory("Mercedes", "tre", "Gle", 10000));
        BabbleSort babble_sort = new BabbleSort();
        ArrayList<Car> Cars = babble_sort.sort(list);
        for ( int i = 0; i < list.size(); i++ ) {
            System.out.println(Cars.get(i).getModel());
        }

    }
}