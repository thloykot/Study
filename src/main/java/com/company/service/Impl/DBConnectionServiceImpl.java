package com.company.service.Impl;

import com.company.dao.DBConnectionDao;
import com.company.service.DBConnectionService;


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
