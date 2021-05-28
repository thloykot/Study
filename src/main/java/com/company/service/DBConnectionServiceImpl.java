package com.company.service;

import com.company.dao.DBConnectionDao;


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
