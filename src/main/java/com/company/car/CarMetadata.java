package com.company.car;

public class CarMetadata {
    protected final Mark mark;
    protected final String model;
    protected final int price;
    protected final String color;

    public CarMetadata(Mark mark, String model, int price, String color) {
        this.mark = mark;
        this.model = model;
        this.price = price;
        this.color = color;
    }

    public Mark getMark() {
        return mark;
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
}
