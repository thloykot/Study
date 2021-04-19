package com.company.factory;

import com.company.engine.BMWEngine;
import com.company.engine.MercedesEngine;
import com.company.engine.VolkswagenEngine;
import com.company.engine.Engine;
import com.company.car.Mark;
import static java.util.Map.entry;

import java.util.EnumMap;
import java.util.Map;

public class EngineFactory {
    private final MercedesEngine mercedesEngine = new MercedesEngine();
    private final BMWEngine bmwEngine = new BMWEngine();
    private final VolkswagenEngine volkswagenEngine = new VolkswagenEngine();
    private final Map<Mark, Engine> enumMap = Map.ofEntries(entry(Mark.BMW,bmwEngine),
            entry(Mark.MERCEDES,mercedesEngine),entry(Mark.VOLKSWAGEN,volkswagenEngine));



    public Engine makeEngine(Mark mark, int capasity) {
        enumMap.get(mark).setCapacity(capasity);
        return enumMap.get(mark);
}
}

