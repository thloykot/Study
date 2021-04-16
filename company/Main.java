package com.company;


import com.company.car.Car;
import com.company.car.Mark;
import com.company.engine.Engine;
import com.company.factory.Diller;
import com.company.sorting.Sorting;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /*System.out.println("hello world");
        System.out.println(NumberUtils.LONG_ZERO);
        System.out.println(NumberUtils.INTEGER_ZERO);
        int[] i  = {4,6,36,31,5423,765};
        System.out.println(NumberUtils.max(i));*/
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Diller().getCar(Mark.BMW, "X_5", "Black", 1000,20));
        cars.add((new Diller().getCar(Mark.MERCEDES, "CDR", "Blue", 10000,6)));
        cars.add(new Diller().getCar(Mark.VOLKSWAGEN, "LANCE", "red", 100,5));
        List<Car> lis = new Sorting().Sort(cars);
        Engine engine = lis.get(0).getEngine();
        engine.showInfo();
        System.out.println(lis);

         

    }
}