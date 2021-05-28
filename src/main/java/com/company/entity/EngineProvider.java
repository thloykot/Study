package com.company.entity;

import com.company.car.Mark;
import com.company.engine.Engine;
import com.company.factory.EngineFactory;

import java.util.Optional;

public class EngineProvider {
    EngineFactory engineFactory = SingletonProvider.getEngineFactory();

    public Optional<Engine> makeEngine(Mark mark){
        return engineFactory.makeEngine(mark);
    }

}
