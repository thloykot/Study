package com.company.entity;

import com.company.carDB.DataBaseHandler;
import com.company.dao.*;
import com.company.diller.Diller;
import com.company.service.*;
import org.jooq.DSLContext;

public class SingletonProvider {
    private static final DataBaseHandler dataBaseHandler = new DataBaseHandler();
    private static final DSLContext dlsContext = dataBaseHandler.getDbDSLContext();
    private static final DBConnectionDao dbConnDao = new DBConnectionDaoImpl(dlsContext);
    private static final DBConnectionService dbConnectionService = new DBConnectionServiceImpl(dbConnDao);
    private static final EngineDao engineDao = new EngineDaoImpl(dlsContext);
    private static final CarDao carDao = new CarDaoImpl(dlsContext);
    private static final EngineServise engineServise = new EngineServiseImpl(engineDao);
    private static final CarServise carServise = new CarServiseImpl(carDao, engineServise);
    private static final Diller diller = new Diller(carServise);

    private SingletonProvider() {
    }


    public static Diller getDiller() {
        return diller;
    }

    public static DBConnectionService getConnectionService() {
        return dbConnectionService;
    }

    public static CarServise getCarServise() {
        return carServise;
    }

    public static EngineServise getEngineServise() {
        return engineServise;
    }
}