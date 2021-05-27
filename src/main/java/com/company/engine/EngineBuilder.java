package com.company.engine;

import com.company.car.Mark;
import com.company.entity.SingletonProvider;
import com.company.factory.EngineFactory;

import java.util.Optional;

public class EngineBuilder {
    private final Mark mark;
    private final int capasity;
    private final EngineFactory engineFactory = SingletonProvider.getEngineFactory();

    public EngineBuilder(Mark mark, int capasity) {
        this.mark = mark;
        this.capasity = capasity;
    }

    public Optional<Engine> getEngine(){
        return engineFactory.makeEngine(mark);
    }
}
