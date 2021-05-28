package com.company.entity;

import com.company.builder.OutputBuilder;
import com.company.carDB.DataBaseHandler;
import com.company.dao.*;
import com.company.diller.Diller;
import com.company.engine.EngineBuilder;
import com.company.factory.*;
import com.company.service.*;

import com.company.sorting.CarSorter;
import org.jooq.DSLContext;

import java.util.Map.Entry;

public class SingletonProvider {
    private static final EngineFactory engineFactory = new EngineFactory();
    private static final BMWFactory bmwFactory = new BMWFactory(engineFactory);
    private static final VolkswagenFactory volkswagenFactory = new VolkswagenFactory(engineFactory);
    private static final MercedesFactory mercedesFactory = new MercedesFactory(engineFactory);
    private static final CarsProvider carsProvider = new CarsProvider(bmwFactory, mercedesFactory, volkswagenFactory);
    private static final CarSorter sorting = new CarSorter();
    private static final OutputBuilder builder = new OutputBuilder();
    private static final DataBaseHandler dataBaseHandler = new DataBaseHandler();
    private static final DSLContext dlsContext = dataBaseHandler.getDbDSLContext();
    private static final DBConnectionDao dbConnDao = new DBConnectionDaoImpl(dlsContext);
    private static final DBConnectionService dbConnectionService = new DBConnectionServiceImpl(dbConnDao);
    private static final CarDao carDao = new CarDaoImpl(dlsContext);
    private static final EngineDao engineDao = new EngineDaoImpl(dlsContext);
    private static final CarServise carServise = new CarServiseImpl(carDao);
    private static final EngineServise engineServise = new EngineServiseImpl(engineDao);
    private static final Diller diller = new Diller(dlsContext);

    private SingletonProvider() {
    }

    public static Diller getDiller(){return  diller;}

    public static CarsProvider getCarsProvider() {
        return carsProvider;
    }

    public static CarSorter getCarSorter() {
        return sorting;
    }

    public static OutputBuilder getOutputBuilder() {
        return builder;
    }

    public static DBConnectionService getConnectionService() {
        return dbConnectionService;
    }

    public static EngineServise getEngineServise(){return engineServise;}

    public static CarServise getCarServise(){return carServise;}

    public static EngineFactory getEngineFactory() {
        return engineFactory;
    }
}