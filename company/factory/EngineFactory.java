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
    private static final Map<Mark, Engine> enumMap = Map.of(Mark.BMW,new BMWEngine(),
            Mark.MERCEDES,new MercedesEngine(),Mark.VOLKSWAGEN,new VolkswagenEngine());


    public Engine makeEngine(Mark mark) {
        return enumMap.getOrDefault(mark,new BMWEngine());
}
}

