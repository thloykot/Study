package com.company.engine;

import com.company.car.Mark;

public class MercedesEngine extends Engine {

    public MercedesEngine(int capasity) {
        super(capasity);
    }

    @Override
    public Mark getMark() {
        return Mark.MERCEDES;
    }

}
