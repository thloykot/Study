package com.company.entity;

import com.company.builder.OutputBuilder;
import com.company.carDB.DataBaseHandler;
import com.company.dao.DBConnectionDao;
import com.company.dao.DBConnectionDaoImpl;
import com.company.diller.Diller;
import com.company.factory.*;
import com.company.service.DBConnectionService;
import com.company.service.DBConnectionServiceImpl;

import com.company.sorting.CarSorter;
import org.jooq.DSLContext;

public class SingletonProvider {
    private static final EngineFactory engineFactory = new EngineFactory();
    private static final BMWFactory bmwFactory = new BMWFactory(engineFactory);
    private static final VolkswagenFactory volkswagenFactory = new VolkswagenFactory(engineFactory);
    private static final MercedesFactory mercedesFactory = new MercedesFactory(engineFactory);
    private static final Diller diller = new Diller(bmwFactory, mercedesFactory, volkswagenFactory);
    private static final CarSorter sorting = new CarSorter();
    private static final OutputBuilder builder = new OutputBuilder();
    private static final DataBaseHandler dataBaseHandler = new DataBaseHandler();
    private static final DSLContext dlsContext = dataBaseHandler.getDbDSLContext();
    private static final DBConnectionDao dbConnDao = new DBConnectionDaoImpl(dlsContext);
    private static final DBConnectionService dbConnectionService = new DBConnectionServiceImpl(dbConnDao);

    private SingletonProvider() {
    }

    public static Diller getDiller() {
        return diller;
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

}