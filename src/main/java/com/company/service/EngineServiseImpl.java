package com.company.service;

import com.company.dao.EngineDao;
import com.company.engine.Engine;
import com.company.entity.SingletonProvider;

import java.util.List;
import java.util.Optional;

public class EngineServiseImpl implements EngineServise{
    private final EngineDao engineDao;

    public EngineServiseImpl(EngineDao engineDao){
        this.engineDao = engineDao;
    }

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

    @Override
    public Optional<Engine> get(int capasity) {
        return engineDao.get(capasity);
    }

    @Override
    public List<Engine> getAll() {
        return engineDao.getAll();
    }
}
