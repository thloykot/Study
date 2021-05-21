package com.company.factory;

import com.company.engine.BMWEngine;
import com.company.engine.Engine;

public class BMWEngineFactory implements EngineFactory {
    @Override
    public Engine createEngine(int capasity) {
        return new BMWEngine(capasity);
    }

}
