package com.company.factory;

import com.company.engine.Engine;
import com.company.engine.MercedesEngine;

public class MercedesEngineFactory implements EngineFactory {
    @Override
    public Engine createEngine(int capasity) {
        return new MercedesEngine(capasity);
    }

}
