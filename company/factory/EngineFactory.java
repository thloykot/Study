package com.company.factory;

import com.company.engine.BMWEngine;
import com.company.engine.MercedesEngine;
import com.company.engine.VolkswagenEngine;
import com.company.engine.Engine;
import com.company.car.Mark;

import java.util.EnumMap;

public class EngineFactory {
    private static final EnumMap<Mark, Engine> enumMap = new EnumMap<>(Mark.class);


    private EnumMap<Mark, Engine> makeMap(int capasity) {
        final MercedesEngine mercedesEngine = new MercedesEngine(capasity);
        final BMWEngine bmwEngine = new BMWEngine(capasity);
        final VolkswagenEngine volkswagenEngine = new VolkswagenEngine(capasity);

        enumMap.put(Mark.BMW, bmwEngine);
        enumMap.put(Mark.MERCEDES, mercedesEngine);
        enumMap.put(Mark.VOLKSWAGEN, volkswagenEngine);
        return enumMap;
    }

    public Engine makeEngine(Mark mark, int capasity) {
        try {
            return makeMap(capasity).get(mark);
        }
        catch (NullPointerException e){
            e.printStackTrace();
        }
        return makeMap(capasity).get(mark);
    }
}

