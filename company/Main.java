package com.company;


import com.company.car.Car;
import com.company.car.Mark;
import com.company.engine.Engine;
import com.company.entity.OutputBuilder;
import com.company.entity.SingeltonProvider;
import com.company.factory.Diller;
import com.company.sorting.Sorting;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Sorting sorting = SingeltonProvider.getSorting();
        OutputBuilder builder = SingeltonProvider.getBuilder();
        Diller diller = SingeltonProvider.getDiller();

        ArrayList<Car> carArrayList = new ArrayList<>();

        diller.getCar(Mark.BMW, "dda", "fgf", 23, 43)
                .ifPresent(carArrayList::add);
        diller.getCar(Mark.MERCEDES, "aaf", "hgh", 2323, 43)
                .ifPresent(carArrayList::add);
        List<Car> carList = sorting.sort(carArrayList);
        builder.showAllInfo(carList);
    }
}