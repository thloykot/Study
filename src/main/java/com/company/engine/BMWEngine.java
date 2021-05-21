package com.company.engine;

import com.company.car.Mark;

public class BMWEngine extends Engine {

    public BMWEngine(int capasity) {
        super(capasity);
    }

    @Override
    public Mark getMark() {
        return Mark.BMW;
    }

}