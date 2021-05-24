package com.company.service;

import com.company.dao.EngineDao;
import com.company.engine.Engine;
import com.company.entity.SingletonProvider;

public class EngineServiseImpl implements EngineServise{
    EngineDao engineDao = SingletonProvider.getEngineDao();

    @Override
    public void save(Engine engine) {
        engineDao.save(engine);
    }

    @Override
    public void delete(int capasity) {
        engineDao.delete(capasity);
    }

    @Override
    public void update(Engine engine, int capasity) {
        engineDao.update(engine,capasity);
    }
}
