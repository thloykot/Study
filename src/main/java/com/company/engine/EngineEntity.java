package com.company.engine;

import com.company.car.Mark;

public class EngineEntity {
    private final int id;
    private final Mark mark;
    private final int capasity;

    public EngineEntity(Mark mark, int capasity, int id) {
        this.capasity = capasity;
        this.id = id;
        this.mark = mark;
    }

    public Mark getMark() {
        return mark;
    }

    public int getCapasity() {
        return capasity;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof EngineEntity) {

            EngineEntity that = (EngineEntity) o;

            return capasity == that.capasity && mark == that.mark;
        }
        return false;
    }
}