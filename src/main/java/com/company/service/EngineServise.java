package com.company.service;

import com.company.engine.Engine;

import java.util.List;
import java.util.Optional;

public interface EngineServise {

    void save(Engine engine);

    void delete(int capasity);

    void update(Engine engine, int capasity);

    Optional<Engine> get(int capasity);

    List<Engine> getAll();
}
