package com.company;

import com.company.builder.OutputBuilder;
import com.company.car.Car;
import com.company.car.Mark;
import com.company.diller.Diller;
import com.company.entity.CarsProvider;
import com.company.entity.SingletonProvider;
import com.company.service.*;
import com.company.sorting.CarSorter;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        CarSorter sorting = SingletonProvider.getCarSorter();
        OutputBuilder outputBuilder = SingletonProvider.getOutputBuilder();
        CarsProvider carsProvider = SingletonProvider.getCarsProvider();
        DBConnectionService connectionService = SingletonProvider.getConnectionService();
        CarServise carServise = SingletonProvider.getCarServise();
        EngineServise engineServise = SingletonProvider.getEngineServise();
        Diller diller = SingletonProvider.getDiller();


        ArrayList<Car> carArrayList = new ArrayList<>();

        carsProvider.getCar(Mark.BMW, "dda", "fgf", 23)
                .ifPresent(carArrayList::add);
        carsProvider.getCar(Mark.MERCEDES, "aaf", "hgh", 2323)
                .ifPresent(carArrayList::add);
        carsProvider.getCar(Mark.VOLKSWAGEN, "ad", "gh", 23223)
                .ifPresent(carArrayList::add);

        List<Car> carList = sorting.sort(carArrayList);
        outputBuilder.showAllInfo(carList);
        System.out.println(connectionService.isConnected());
        //Optional<Car> car = carServise.get("dda");
        //car.ifPresent(outputBuilder::showAllInfo);
        //System.out.println(carServise.getAll());
        //System.out.println(engineServise.get(12));
        diller.get("dda");

    }

}
