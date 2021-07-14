package com.company.factory.EngineFactoryImpl;

import com.company.engine.Engine;
import com.company.engine.VolkswagenEngine;
import com.company.factory.EngineFactory;

public class VolkswagenEngineFactory implements EngineFactory {
    @Override
    public Engine createEngine(int capasity) {
        return new VolkswagenEngine(capasity);
    }

}
