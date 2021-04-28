package com.company.entity;

import com.company.factory.*;
import com.company.sorting.Sorting;

public class SingeltonProvider {
    private static final EngineFactory engineFactory = new EngineFactory();
    private static final BMWFactory bmwFactory = new BMWFactory();
    private static final VolkswagenFactory volkswagenFactory = new VolkswagenFactory();
    private static final MercedesFactory mercedesFactory = new MercedesFactory();
    private static final Diller diller = new Diller();
    private static final Sorting sorting = new Sorting();
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

    public static Sorting getSorting(){return sorting;}

    public static OutputBuilder getBuilder(){return builder;}

}