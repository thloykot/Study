package com.company;
import org.apache.commons.lang3.math.NumberUtils;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        /*System.out.println("hello world");
        System.out.println(NumberUtils.LONG_ZERO);
        System.out.println(NumberUtils.INTEGER_ZERO);
        int[] i  = {4,6,36,31,5423,765};
        System.out.println(NumberUtils.max(i));*/
        Car_factory factory = new Car_factory();

        ArrayList<Car> list = new ArrayList<Car>();
        list.add(factory.Factory("BMW","blue","b",10000));
        list.add(factory.Factory("Volkvagen","black","a",90000));
        list.add(factory.Factory("Mercedes","tre","c",10000));
        Babble_sort babble_sort = new Babble_sort();
        ArrayList<Car> Cars = babble_sort.sort(list);
        for (int i = 0;i<list.size();i++ ){
            System.out.println(Cars.get(i).getModel());
        }

    }
}
