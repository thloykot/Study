package com.company.service;

import com.company.engine.Engine;

public interface EngineServise {

    void save(Engine engine);

    void delete(int capasity);

    void update(Engine engine, int capasity);
}
