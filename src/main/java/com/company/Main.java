package com.company;

import com.company.car.Car;
import com.company.car.Mark;
import com.company.builder.OutputBuilder;
import com.company.carDB.DataBaseHandler;
import com.company.dao.EngineDaoImpl;
import com.company.entity.CarsProvider;
import com.company.entity.SingletonProvider;
import com.company.service.CarServise;
import com.company.service.CarServiseImpl;
import com.company.service.DBConnectionService;
import com.company.sorting.CarSorter;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        CarSorter sorting = SingletonProvider.getCarSorter();
        OutputBuilder outputBuilder = SingletonProvider.getOutputBuilder();
        CarsProvider carsProvider = SingletonProvider.getCarsProvider();
        DBConnectionService connectionService = SingletonProvider.getConnectionService();


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
        CarServise carServise = new CarServiseImpl();
        DataBaseHandler dataBaseHandler = new DataBaseHandler();
        EngineDaoImpl engineDao = new EngineDaoImpl(dataBaseHandler.getDbDSLContext());
        carServise.delete("ad");
        carServise.delete("aaf");
    }

}
