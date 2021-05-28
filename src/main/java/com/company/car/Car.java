package com.company.car;

import com.company.engine.Engine;

public abstract class Car {

    private final String model;
    private final int price;
    private final String color;
    private final Mark mark;

    public Car(Mark mark, String model, int price, String color) {
        this.mark = mark;
        this.model = model;
        this.price = price;
        this.color = color;

    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public Mark getMark() {
        return mark;
    }

    @Override
    public String toString() {
        return "Марка:" + mark.toString() + ". Модель:" + model + ", Ціна:" + price + ", ";
    }


}