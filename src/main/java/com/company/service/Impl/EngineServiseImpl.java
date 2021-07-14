package com.company.service.Impl;

import com.company.car.Mark;
import com.company.dao.EngineDao;
import com.company.engine.Engine;
import com.company.factory.EngineFactoryImpl.BMWEngineFactory;
import com.company.factory.EngineFactory;
import com.company.factory.EngineFactoryImpl.MercedesEngineFactory;
import com.company.factory.EngineFactoryImpl.VolkswagenEngineFactory;
import com.company.service.EngineServise;

import java.util.Map;
import java.util.Optional;

public class EngineServiseImpl implements EngineServise {
    private final EngineDao engineDao;
    private final Map<Mark, EngineFactory> engineFactoryMap;

    public EngineServiseImpl(EngineDao engineDao) {
        this.engineDao = engineDao;
        engineFactoryMap = Map.of(Mark.BMW, new BMWEngineFactory(),
                Mark.MERCEDES, new MercedesEngineFactory(),
                Mark.VOLKSWAGEN, new VolkswagenEngineFactory());
    }

    @Override
    public int save(Engine engine) {
        if (isExist(engine)) {
            throw new IllegalArgumentException("Такий двигун вже присутній");
        }
        return engineDao.save(engine);
    }

    @Override
    public int delete(int id) {
        return engineDao.delete(id);
    }

    @Override
    public int update(Engine engine, int id) {
        if (isExist(engine)) {
            throw new IllegalArgumentException("Такий двигун вже присутній");
        }
        return engineDao.update(engine, id);

    }

    @Override
    public Optional<Engine> findEngine(int id) {
        return engineDao.findEngine(id)
                .map(dbEngine -> engineFactoryMap
                .get(dbEngine.getMark()).createEngine(dbEngine.getCapasity()));
    }

    @Override
    public Optional<Integer> findEngineId(Engine engine) {
        return engineDao.findEngineId(engine);
    }

    private boolean isExist(Engine engine) {
        return engineDao.isExist(engine);
    }
}
