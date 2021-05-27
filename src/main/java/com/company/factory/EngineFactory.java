package com.company.factory;

import com.company.car.Mark;
import com.company.engine.BMWEngine;
import com.company.engine.Engine;
import com.company.engine.MercedesEngine;
import com.company.engine.VolkswagenEngine;

import java.util.Map;
import java.util.Optional;

public class EngineFactory {
    private int CAPASITY = 20;

    public EngineFactory() {
    }

    private final Map<Mark, Engine> engineMap = Map.of(Mark.BMW, new BMWEngine(CAPASITY),
            Mark.MERCEDES, new MercedesEngine(CAPASITY), Mark.VOLKSWAGEN, new VolkswagenEngine(CAPASITY));

    public Optional<Engine> makeEngine(Mark mark) {
        return Optional.ofNullable(engineMap.get(mark));
    }

}
