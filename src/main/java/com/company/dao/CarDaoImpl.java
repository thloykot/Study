package com.company.dao;

import com.company.car.Car;
import com.company.entity.CarsProvider;
import com.company.entity.SingletonProvider;
import org.jooq.DSLContext;
import org.jooq.Record5;
import org.jooq.Result;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.jooq.generatedDB.tables.Car.CAR;

public class CarDaoImpl implements CarDao {
    private final CarsProvider carsProvider = SingletonProvider.getCarsProvider();
    private final DSLContext dslContext;

    public CarDaoImpl(DSLContext dslContext) {

        this.dslContext = dslContext;
    }

    @Override
    public void save(Car car) {
        dslContext.insertInto(CAR, CAR.MARK, CAR.MODEL, CAR.PRICE, CAR.COLOR)
                .values(carsProvider.getMark(car).toString(), car.getModel(), car.getPrice(), car.getColor()).execute();
    }

    @Override
    public void delete(String model) {
        dslContext.deleteFrom(CAR).where(CAR.MODEL.eq(model)).execute();
    }

    @Override
    public void update(Car car, String model) {
        dslContext.update(CAR).set(CAR.MODEL, car.getModel())
                .set(CAR.PRICE, car.getPrice()).set(CAR.COLOR, car.getColor())
                .where(CAR.MODEL.eq(model)).execute();
    }

    @Override
    public Optional<Car> get(String model) {
        Record5<Integer, String, String, Integer, String> objectMap = dslContext.select(CAR.ID, CAR.MARK, CAR.MODEL, CAR.PRICE, CAR.COLOR)
                .from(CAR).where(CAR.MODEL.eq(model)).fetchSingle();
        return carsProvider.getCar(carsProvider.getMark(objectMap.value2()), objectMap.value3(), objectMap.component5(), objectMap.value4());
    }

    @Override
    public List<Car> getAll() {
        List<Car> carList = new ArrayList<>();
        Result<Record5<Integer, String, String, Integer, String>> getedCars = dslContext.select(CAR.ID, CAR.MARK, CAR.MODEL, CAR.PRICE, CAR.COLOR).from(CAR).fetch();
        for (var car : getedCars) {
            Optional<Car> Car = carsProvider.getCar(carsProvider.getMark(car.value2()), car.value3(), car.component5(), car.value4());
            Car.ifPresent(carList::add);
        }
        return carList;
    }
}
