package com.company.factory;

import com.company.engine.BMWEngine;
import com.company.engine.MercedesEngine;
import com.company.engine.VolkswagenEngine;
import com.company.engine.Engine;
import com.company.car.Mark;

import java.util.EnumMap;

public class EngineFactory {
    private final MercedesEngine mercedesEngine = new MercedesEngine();
    private final BMWEngine bmwEngine = new BMWEngine();
    private final VolkswagenEngine volkswagenEngine = new VolkswagenEngine();
    private final EnumMap<Mark, Engine> enumMap = new EnumMap<>(Mark.class) {{
        put(Mark.BMW, bmwEngine);
        put(Mark.MERCEDES, mercedesEngine);
        put(Mark.VOLKSWAGEN, volkswagenEngine);
    }};



    public Engine makeEngine(Mark mark, int capasity) {
        enumMap.get(mark).setCapacity(capasity);
        return enumMap.get(mark);
}
}

