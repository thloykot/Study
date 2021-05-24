package com.company;

import com.company.car.Car;
import com.company.car.Mark;
import com.company.builder.OutputBuilder;
import com.company.carDB.DataBaseHandler;
import com.company.dao.CarDaoImpl;
import com.company.dao.EngineDaoImpl;
import com.company.entity.SingletonProvider;
import com.company.diller.Diller;
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
        Diller diller = SingletonProvider.getDiller();
        DBConnectionService connectionService = SingletonProvider.getConnectionService();


        ArrayList<Car> carArrayList = new ArrayList<>();

        diller.getCar(Mark.BMW, "dda", "fgf", 23, 43)
                .ifPresent(carArrayList::add);
        diller.getCar(Mark.MERCEDES, "aaf", "hgh", 2323, 43)
                .ifPresent(carArrayList::add);
        diller.getCar(Mark.VOLKSWAGEN, "ad", "gh", 23223, 655)
                .ifPresent(carArrayList::add);

        List<Car> carList = sorting.sort(carArrayList);
        outputBuilder.showAllInfo(carList);
        System.out.println(connectionService.isConnected());
        CarServise carServise = new CarServiseImpl();
        DataBaseHandler dataBaseHandler = new DataBaseHandler();
        EngineDaoImpl engineDao = new EngineDaoImpl(dataBaseHandler.getDbDSLContext());
    }

}
