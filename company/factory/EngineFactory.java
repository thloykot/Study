package com.company.factory;

import com.company.engine.BMWEngine;
import com.company.engine.MercedesEngine;
import com.company.engine.VolkswagenEngine;
import com.company.entity.Engine;

import java.util.ArrayList;
import java.util.Arrays;

public class EngineFactory {
    private String[] bmwModels = {"x-5", "mojero", "x-3"};
    private String[] volksvagenModels = {"awd", "gskd", "fawj"};
    private String[] mercedesModels = {"dascx", "bfcf", "gfdg"};
    public Engine engine(String model) {
        boolean find = false;
        while (!find) {
            for ( int i = 0; i < bmwModels.length; i++ ) {
                if (bmwModels[i].equals(model)) {
                    find = true;
                    return new BMWEngine();
                }
            }
            for ( int i = 0; i < volksvagenModels.length; i++ ) {
                if (volksvagenModels[i].equals(model)) {
                    find = true;
                    return new VolkswagenEngine();
                }
            }
            for ( int i = 0; i < mercedesModels.length; i++ ) {
                if (mercedesModels[i].equals(model)) {
                    find = true;
                    return new MercedesEngine();
                }
            }
        }
        return null;
    }
    public void printBMWList(){
        for (int i = 0;i< bmwModels.length;i++){
            System.out.print(bmwModels[i] + " | ");
        }
        System.out.println("\n");
    }
    public void printMercedesList(){
        for (int i = 0;i< mercedesModels.length;i++){
            System.out.print(mercedesModels[i] + " | ");
        }
        System.out.println("\n");
    }
    public void printVolkswagenList(){
        for (int i = 0;i< volksvagenModels.length;i++){
            System.out.print(volksvagenModels[i] + " | ");
        }
        System.out.println("\n");
    }
}

