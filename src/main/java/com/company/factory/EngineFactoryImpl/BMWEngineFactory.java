package com.company.factory.EngineFactoryImpl;

import com.company.engine.BMWEngine;
import com.company.engine.Engine;
import com.company.factory.EngineFactory;

public class BMWEngineFactory implements EngineFactory {
    @Override
    public Engine createEngine(int capasity) {
        return new BMWEngine(capasity);
    }

}
