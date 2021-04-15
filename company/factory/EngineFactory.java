package com.company.factory;

import com.company.engine.BMWEngine;
import com.company.engine.MercedesEngine;
import com.company.engine.VolkswagenEngine;
import com.company.engine.Engine;
import com.company.car.Mark;

public class EngineFactory {

    public Engine makeEngine(Mark mark, int capasity) {
        return switch (mark) {
            case BMW -> new BMWEngine(capasity);
            case MERCEDES -> new MercedesEngine(capasity);
            case VOLKSWAGEN -> new VolkswagenEngine(capasity);
        };
    }
}

