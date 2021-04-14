package com.company.entity;

import com.company.factory.BMWFactory;
import com.company.factory.EngineFactory;
import com.company.factory.MercedesFactory;
import com.company.factory.VolkswagenFactory;

public class FactoryMake extends EngineFactory {
    private static FactoryMake factoryMake;
    private EngineFactory engineFactory;
    private BMWFactory bmwFactory;
    private VolkswagenFactory volkswagenFactory;
    private MercedesFactory mercedesFactory;

    private FactoryMake() {
    }

    public static FactoryMake getSingltone() {
        if (factoryMake == null) {
            return new FactoryMake();
        }
        return factoryMake;
    }

    public VolkswagenFactory getVolkswagenFactory() {
        if (volkswagenFactory == null) {
            return new VolkswagenFactory();
        }
        return volkswagenFactory;
    }


    public MercedesFactory getMercedesFactory() {
        if (mercedesFactory == null) {
            mercedesFactory = new MercedesFactory();
        }
        return mercedesFactory;
    }


    public EngineFactory getEngineFactory() {
        if (engineFactory == null) {
            engineFactory = new EngineFactory();
        }
        return engineFactory;
    }

    public BMWFactory getBmwFactory() {
        if (bmwFactory == null) {
            bmwFactory = new BMWFactory();
        }
        return bmwFactory;
    }

}
