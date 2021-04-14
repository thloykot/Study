package com.company.entity;

import com.company.factory.BMWFactory;
import com.company.factory.EngineFactory;
import com.company.factory.MercedesFactory;
import com.company.factory.VolkswagenFactory;

public class Singletone extends EngineFactory {
    private static EngineFactory engineFactory;
    private static BMWFactory bmwFactory;
    private static VolkswagenFactory volkswagenFactory;
    private static MercedesFactory mercedesFactory;

    private Singletone() {
    }

    public static VolkswagenFactory getVolkswagenFactory() {
        if (volkswagenFactory == null) {
            return new VolkswagenFactory();
        }
        return volkswagenFactory;
    }


    public static MercedesFactory getMercedesFactory() {
        if (mercedesFactory == null) {
            mercedesFactory = new MercedesFactory();
        }
        return mercedesFactory;
    }


    public static EngineFactory getEngineFactory() {
        if (engineFactory == null) {
            engineFactory = new EngineFactory();
        }
        return engineFactory;
    }

    public static BMWFactory getBmwFactory() {
        if (bmwFactory == null) {
            bmwFactory = new BMWFactory();
        }
        return bmwFactory;
    }

}
