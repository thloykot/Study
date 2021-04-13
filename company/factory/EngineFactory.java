package com.company.factory;

import com.company.engine.BMWEngine;
import com.company.engine.MercedesEngine;
import com.company.engine.VolkswagenEngine;
import com.company.entity.Engine;
import com.company.factory.model.BMWModels;
import com.company.factory.model.MercedesModels;
import com.company.factory.model.VolkswagenModels;

import java.util.ArrayList;
import java.util.Arrays;

public class EngineFactory {

    public Engine engine(String model) {
        boolean find = false;
        while (!find) {
            for ( BMWModels i : BMWModels.values() ) {
                if (i.toString().equals(model)) {
                    find = true;
                    return new BMWEngine();
                }
            }
            for ( VolkswagenModels i : VolkswagenModels.values() ) {
                if (i.toString().equals(model)) {
                    find = true;
                    return new VolkswagenEngine();
                }
            }
            for ( MercedesModels i : MercedesModels.values() ) {
                if (i.toString().equals(model)) {
                    find = true;
                    return new MercedesEngine();
                }
            }
        }
        return null;
    }

}

