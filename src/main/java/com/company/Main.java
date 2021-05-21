package com.company;

import com.company.builder.OutputBuilder;
import com.company.car.BMW;
import com.company.car.Car;
import com.company.car.Mercedes;
import com.company.car.Volkswagen;
import com.company.diller.Diller;
import com.company.engine.BMWEngine;
import com.company.engine.MercedesEngine;
import com.company.engine.VolkswagenEngine;
import com.company.entity.SingletonProvider;
import com.company.service.CarServise;


public class Main {
    private static final Diller diller = SingletonProvider.getDiller();
    private static final CarServise carServise = SingletonProvider.getCarServise();

    public static void main(String[] args) {

        if (SingletonProvider.getConnectionService().isConnected()) {
            Car car1 = new Mercedes("Moooopz", 49000000, "black", new MercedesEngine(54));
            Car car2 = new Volkswagen("Jt", 60000, "green", new VolkswagenEngine(60));
            Car car3 = new BMW("X5", 4200400, "black", new BMWEngine(55));


            int car1Id = carServise.save(car1);
            int car2Id = carServise.save(car2);

            carServise.delete(car1Id);
            carServise.update(car1, car2Id);
            carServise.save(car3);

            OutputBuilder.showAllInfo(diller.findCars(car1.getModel()));
            OutputBuilder.showAllInfo(diller.findCars(car3.getModel()));

        }
    }
}