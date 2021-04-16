package com.company.factory;

import com.company.engine.BMWEngine;
import com.company.engine.MercedesEngine;
import com.company.engine.VolkswagenEngine;
import com.company.engine.Engine;
import com.company.car.Mark;

import java.util.EnumMap;

public class EngineFactory {
    private final EnumMap<Mark, Engine> enumMap = new EnumMap<>(Mark.class);


    private EnumMap<Mark, Engine> makeMap(int capasity) {
        MercedesEngine mercedesEngine = new MercedesEngine(capasity);
        BMWEngine bmwEngine = new BMWEngine(capasity);
        VolkswagenEngine volkswagenEngine = new VolkswagenEngine(capasity);

        enumMap.put(Mark.BMW, bmwEngine);
        enumMap.put(Mark.MERCEDES, mercedesEngine);
        enumMap.put(Mark.VOLKSWAGEN, volkswagenEngine);
        return enumMap;
    }

    public Engine makeEngine(Mark mark, int capasity) {
        return makeMap(capasity).get(mark);
    }
}

