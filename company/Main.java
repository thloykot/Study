package com.company;


import com.company.cars.BMW;
import com.company.entity.BMWEngine;
import com.company.entity.Car;
import com.company.factory.Diller;
import com.company.sorting.BabbleSort;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        /*System.out.println("hello world");
        System.out.println(NumberUtils.LONG_ZERO);
        System.out.println(NumberUtils.INTEGER_ZERO);
        int[] i  = {4,6,36,31,5423,765};
        System.out.println(NumberUtils.max(i));*/
        BabbleSort babbleSort = new BabbleSort();
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Diller().diller("BMW","X-5","Black",1000));
        cars.add((new Diller().diller("Mercedes","Uno","Blue",10000)));
        cars.add(new Diller().diller("Volkswagen","pop","red",100));

    }
}