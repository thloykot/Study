package com.company.engine;

import com.company.car.Mark;

public class VolkswagenEngine extends Engine {

    public VolkswagenEngine(int capasity) {
        super(capasity);
    }

    @Override
    public Mark getMark() {
        return Mark.VOLKSWAGEN;
    }

}