package com.company.engine;

import com.company.entity.Engine;

public class MercedesEngine implements Engine {
    @Override
    public void showInfo() {
        System.out.println("Це двигун від Mercedes");
    }
}


