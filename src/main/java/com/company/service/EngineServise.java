package com.company.service;

import com.company.engine.Engine;

import java.util.Optional;

public interface EngineServise {

    int save(Engine engine);

    int delete(int id);

    int update(Engine engine, int id);

    Optional<Engine> findEngine(int id);

    Optional<Integer> findEngineId(Engine engine);
}
