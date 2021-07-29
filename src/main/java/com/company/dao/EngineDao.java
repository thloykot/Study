package com.company.dao;

import com.company.engine.Engine;
import com.company.engine.EngineEntity;

import java.util.List;
import java.util.Optional;

public interface EngineDao {

    int save(Engine engine);

    int delete(int id);

    int update(Engine newEngine, int id);

    Optional<EngineEntity> findEngine(int id);

    Optional<Integer> findEngineId(Engine engine);

    boolean isExist(Engine engine);

}
