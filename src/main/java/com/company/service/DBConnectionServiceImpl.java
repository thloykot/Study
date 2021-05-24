package com.company.service;

import com.company.dao.DBConnectionDao;
import org.jooq.DSLContext;


public class DBConnectionServiceImpl implements DBConnectionService {

    private final DBConnectionDao dbConnectionDao;

    public DBConnectionServiceImpl(DBConnectionDao dbConnectionDao) {
        this.dbConnectionDao = dbConnectionDao;
    }

    @Override
    public boolean isConnected() {

        return dbConnectionDao.isConnected();
    }


}
