package com.company.dao;


import com.company.car.Car;
import com.company.car.CarEntity;
import com.company.car.CarMetadata;
import com.company.car.Mark;
import org.jooq.DSLContext;

import java.util.List;

import static org.jooq.generatedDB.tables.Car.CAR;


public class CarDaoImpl implements CarDao {

    private final DSLContext dslContext;


    public CarDaoImpl(DSLContext dslContext) {
        this.dslContext = dslContext;

    }

    @Override
    public int save(Car car, int engineId) {
        return dslContext.insertInto(CAR, CAR.MARK, CAR.MODEL, CAR.PRICE, CAR.COLOR, CAR.ENGINE_ID)
                .values(car.getMark().name(), car.getModel(), car.getPrice(), car.getColor(), engineId)
                .returningResult(CAR.ID).fetchOne().into(int.class);
    }

    @Override
    public int delete(int id) {
        return dslContext.deleteFrom(CAR).where(CAR.ID.eq(id)).execute();
    }

    @Override
    public int update(Car car, int oldCarId, int engineId) {
        return dslContext.update(CAR).set(CAR.MARK, car.getMark().name())
                .set(CAR.MODEL, car.getModel()).set(CAR.PRICE, car.getPrice())
                .set(CAR.COLOR, car.getColor()).set(CAR.ENGINE_ID, engineId)
                .where(CAR.ID.eq(oldCarId)).execute();
    }

    @Override
    public int update(CarMetadata carMetadata, int oldCarId) {
        return dslContext.update(CAR).set(CAR.MARK, carMetadata.getMark().name())
                .set(CAR.MODEL, carMetadata.getModel()).set(CAR.PRICE, carMetadata.getPrice())
                .set(CAR.COLOR, carMetadata.getColor()).where(CAR.ID.eq(oldCarId)).execute();
    }


    @Override
    public List<CarEntity> findCars(String model) {
        return dslContext.select(CAR.ID, CAR.MARK, CAR.MODEL, CAR.PRICE, CAR.COLOR, CAR.ENGINE_ID)
                .from(CAR).where(CAR.MODEL.eq(model))
                .fetchInto(CarEntity.class);
    }


    @Override
    public boolean isExist(Mark mark, String model, int price, String color) {
        return dslContext.fetchExists(CAR, CAR.MARK.eq(mark.name()), CAR.MODEL.eq(model), CAR.PRICE.eq(price), CAR.COLOR.eq(color));
    }
}
