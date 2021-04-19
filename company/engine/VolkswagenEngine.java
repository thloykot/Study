package com.company.engine;

public class VolkswagenEngine extends Engine {


    @Override
    public void showInfo() {
        System.out.println("Це двигун від Volkswagen, об'єм:" + capacity);
    }
}
