package com.company.car;

public class CarEntity {

    private final int id;
    private final Mark mark;
    private final String model;
    private final int price;
    private final String color;
    private final int engineId;

    public CarEntity(int id, Mark mark, String model, int price, String color, int engineId) {
        this.id = id;
        this.mark = mark;
        this.model = model;
        this.price = price;
        this.color = color;
        this.engineId = engineId;

    }

    public int getId() {
        return id;
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

    public int getEngineId() {
        return engineId;
    }

}
