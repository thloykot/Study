package com.company.entity;

import com.company.factory.BMWFactory;
import com.company.factory.EngineFactory;
import com.company.factory.MercedesFactory;
import com.company.factory.VolkswagenFactory;

public class SingeltonProvider {
    private static final EngineFactory engineFactory = new EngineFactory();
    private static final BMWFactory bmwFactory = new BMWFactory();
    private static final VolkswagenFactory volkswagenFactory = new VolkswagenFactory();
    private static final MercedesFactory mercedesFactory = new MercedesFactory();

    private SingeltonProvider() {
    }

    public static VolkswagenFactory getVolkswagenFactory() {
        return volkswagenFactory;
    }


    public static MercedesFactory getMercedesFactory() {
        return mercedesFactory;
    }


    public static EngineFactory getEngineFactory() {
        return engineFactory;
    }

    public static BMWFactory getBmwFactory() {
        return bmwFactory;
    }

}
