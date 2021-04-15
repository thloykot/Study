package com.company.factory;

import com.company.engine.BMWEngine;
import com.company.engine.MercedesEngine;
import com.company.engine.VolkswagenEngine;
import com.company.engine.Engine;
import com.company.car.Mark;

public class EngineFactory {

    public Engine makeEngine(Mark mark,String model) {
        return switch (mark) {
            case BMW -> new BMWEngine(20);
            case MERCEDES -> new MercedesEngine(20);
            case VOLKSWAGEN -> new VolkswagenEngine(20);
        };
    }
}

