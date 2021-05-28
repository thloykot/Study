package com.company.entity;

import com.company.car.Car;
import com.company.engine.Engine;
import com.company.service.CarServise;
import com.company.service.EngineServise;

public class DBTablesSaver {
    CarServise carServise = SingletonProvider.getCarServise();
    EngineServise engineServise = SingletonProvider.getEngineServise();

    public void save(Car car, Engine engine){
        carServise.save(car);
        engineServise.save(engine);
    }
}
