package com.company.engine;

import com.company.entity.Engine;

public class VolkswagenEngine implements Engine {
    @Override
    public void showInfo() {
        System.out.println("Це двигун від Volkswagen");
    }
}
