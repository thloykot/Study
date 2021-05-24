package com.company.dao;

import com.company.car.Car;
import org.jooq.DSLContext;
import static org.jooq.generatedDB.tables.Car.CAR;

public class CarDaoImpl implements CarDao {

    private final DSLContext dslContext;

    public CarDaoImpl(DSLContext dslContext) {

        this.dslContext = dslContext;
    }

    @Override
    public void save(Car car) {

        dslContext.insertInto(CAR, CAR.MODEL, CAR.PRICE, CAR.COLOR)
                .values(car.getModel(), car.getPrice(), car.getColor()).execute();
    }

    @Override
    public void delete(String model) {
        dslContext.deleteFrom(CAR).where(CAR.MODEL.eq(model)).execute();
    }

    @Override
    public void update(Car car,String model) {
        dslContext.update(CAR).set(CAR.MODEL,car.getModel())
                .set(CAR.PRICE,car.getPrice()).set(CAR.COLOR,car.getColor())
                .where(CAR.MODEL.eq(model)).execute();
    }
}
