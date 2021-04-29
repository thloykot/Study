package com.company.entity;

import com.company.builder.OutputBuilder;
import com.company.diller.Diller;
import com.company.factory.*;
import com.company.sorting.CarSorter;

public class SingeltonProvider {
    private static final EngineFactory engineFactory = new EngineFactory();
    private static final BMWFactory bmwFactory = new BMWFactory();
    private static final VolkswagenFactory volkswagenFactory = new VolkswagenFactory();
    private static final MercedesFactory mercedesFactory = new MercedesFactory();
    private static final Diller diller = new Diller();
    private static final CarSorter sorting = new CarSorter();
    private static final OutputBuilder builder = new OutputBuilder();

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

    public static Diller getDiller(){
        return diller;
    }

    public static CarSorter getSorting(){return sorting;}

    public static OutputBuilder getBuilder(){return builder;}

}