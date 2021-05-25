package com.company.dao;

import com.company.car.Car;
import com.company.engine.Engine;

import java.util.List;
import java.util.Optional;

public interface EngineDao {

    void save(Engine engine);

    void delete(int capasity);

    void update(Engine engine, int capasity);

    Optional<Engine> get(String capasity);

    List<Engine> getAll();

}
