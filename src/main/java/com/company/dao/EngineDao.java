package com.company.dao;

import com.company.engine.Engine;

public interface EngineDao {

    void save(Engine engine);

    void delete(int capasity);

    void update(Engine engine, int capasity);

}
