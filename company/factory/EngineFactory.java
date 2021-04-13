package com.company.factory;

import com.company.engine.BMWEngine;
import com.company.engine.MercedesEngine;
import com.company.engine.VolkswagenEngine;
import com.company.entity.Engine;
import com.company.car.Mark;

public class EngineFactory {
    private static EngineFactory engineFactory;

    private EngineFactory(){};

    public static synchronized EngineFactory getEngineFactory() {
        if (engineFactory == null) {
            engineFactory = new EngineFactory();
        }
        return engineFactory;
    }

    public static Engine makeEngine(Mark mark) {
        return switch (mark) {
            case BMW -> new BMWEngine();
            case Mercedes -> new MercedesEngine();
            case Volkswagen -> new VolkswagenEngine();
        };
    }
}

