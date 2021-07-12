package com.company.car;

import com.company.engine.Engine;

public abstract class Car extends CarMetadata {

    private final Engine engine;

    public Car(Mark mark, String model, int price, String color, Engine engine) {
        super(mark, model, price, color);
        this.engine = engine;
    }


    public Mark getMark() {
        return mark;
    }

    public Engine getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return "Машина марки:" + getMark() + ". Модель:" + model + ". Ціна:" + price + ". Колір:" + color + ".\n" + engine;
    }


}