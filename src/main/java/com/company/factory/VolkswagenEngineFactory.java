package com.company.factory;

import com.company.engine.Engine;
import com.company.engine.VolkswagenEngine;

public class VolkswagenEngineFactory implements EngineFactory {
    @Override
    public Engine createEngine(int capasity) {
        return new VolkswagenEngine(capasity);
    }

}
