package com.company.factory.EngineFactoryImpl;

import com.company.engine.Engine;
import com.company.engine.MercedesEngine;
import com.company.factory.EngineFactory;

public class MercedesEngineFactory implements EngineFactory {
    @Override
    public Engine createEngine(int capasity) {
        return new MercedesEngine(capasity);
    }

}
