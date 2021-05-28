package com.company.dao;


import com.company.car.Car;
import com.company.car.CarBuilder;
import com.company.entity.CarsProvider;
import com.company.entity.SingletonProvider;
import org.jooq.DSLContext;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static org.jooq.generatedDB.tables.Car.CAR;
import static org.jooq.generatedDB.tables.Engine.ENGINE;

public class CarDaoImpl implements CarDao {
    private final CarsProvider carsProvider = SingletonProvider.getCarsProvider();
    private final DSLContext dslContext;

    public CarDaoImpl(DSLContext dslContext) {

        this.dslContext = dslContext;
    }

    @Override
    public void save(Car car) {
        dslContext.insertInto(CAR, CAR.MARK, CAR.MODEL, CAR.PRICE, CAR.COLOR)
                .values(String.valueOf(car.getMark()), car.getModel(), car.getPrice(), car.getColor()).execute();
    }

    @Override
    public void delete(String model) {
        dslContext.deleteFrom(CAR).where(CAR.MODEL.eq(model)).orderBy(CAR.ID.desc()).execute();
    }

    @Override
    public void update(Car car, String model) {
        dslContext.update(CAR).set(CAR.MODEL, car.getModel())
                .set(CAR.PRICE, car.getPrice()).set(CAR.COLOR, car.getColor())
                .where(CAR.MODEL.eq(model)).execute();
    }

    @Override
    public Optional<Car> get(String model) {
        return dslContext.select(CAR.ID,CAR.MARK, CAR.MODEL, CAR.PRICE, CAR.COLOR)
                .from(CAR.join(ENGINE).on(CAR.ID.eq(ENGINE.ID))).where(CAR.MODEL.eq(model))
                .fetchAny().into(CarBuilder.class).createCar();
    }

    @Override
    public List<Optional<Car>> getAll() {

        List<CarBuilder> cars = dslContext.select(CAR.MARK, CAR.MODEL, CAR.PRICE, CAR.COLOR)
                .from(CAR.join(ENGINE).on(CAR.ID.eq(ENGINE.ID)))
                .fetch().into(CarBuilder.class);

        return  cars.stream().map(CarBuilder::createCar).collect(Collectors.toList());
    }
}
