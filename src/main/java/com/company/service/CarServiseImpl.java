package com.company.service;

import com.company.car.Car;
import com.company.car.CarEntity;
import com.company.car.CarMetadata;
import com.company.car.Mark;
import com.company.dao.CarDao;
import com.company.engine.Engine;
import com.company.factory.BMWFactory;
import com.company.factory.CarFactory;
import com.company.factory.MercedesFactory;
import com.company.factory.VolkswagenFactory;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;


public class CarServiseImpl implements CarServise {

    private final CarDao carDao;
    private final EngineServise engineServise;
    private final Map<Mark, CarFactory> carFactoryMap;

    public CarServiseImpl(CarDao carDao, EngineServise engineServise) {
        this.carDao = carDao;
        this.engineServise = engineServise;
        carFactoryMap = Map.of(Mark.BMW, new BMWFactory(),
                Mark.MERCEDES, new MercedesFactory(),
                Mark.VOLKSWAGEN, new VolkswagenFactory());
    }

    @Override
    public int save(Car car) {
        if (isExist(car)) {
            throw new IllegalArgumentException(car.getMark() + ": " + car.getModel() + " уже присутня");
        }
        return carDao.save(car, findOrSaveEngine(car.getEngine()));
    }

    @Override
    public int delete(int id) {
        return carDao.delete(id);
    }

    @Override
    public int update(Car car, int oldCarId) {
        if (isExist(car)) {
            throw new IllegalArgumentException(car.getMark().name() + ": " + car.getModel() + " уже присутня");
        }
        return carDao.update(car, oldCarId, findOrSaveEngine(car.getEngine()));
    }

    @Override
    public int update(CarMetadata carMetadata, int oldCarId) {
        if (isExist(carMetadata)) {
            throw new IllegalArgumentException(carMetadata.getMark().name() + ": " + carMetadata.getModel() + " уже присутня");
        }
        return carDao.update(carMetadata, oldCarId);
    }

    @Override
    public List<Car> findCars(String model) {
        return carDao.findCars(model).stream().map(carEntity -> findEngine(carEntity.getEngineId())
                .map(engine -> getCarFromFactory(carEntity, engine)))
                .filter(Optional::isPresent)
                .map(Optional::get).collect(Collectors.toUnmodifiableList());
    }

    private int findOrSaveEngine(Engine engine) {
        return engineServise.findEngineId(engine).orElseGet(() -> engineServise.save(engine));
    }

    private Car getCarFromFactory(CarEntity carEntity, Engine engine) {
        return carFactoryMap.get(carEntity.getMark()).convertToCar(carEntity, engine);
    }

    private Optional<Engine> findEngine(int id) {
        return engineServise.findEngine(id);
    }

    private boolean isExist(Car car) {
        return carDao.isExist(car.getMark(), car.getModel(), car.getPrice(), car.getColor());
    }

    private boolean isExist(CarMetadata carMetadata) {
        return carDao.isExist(carMetadata.getMark(), carMetadata.getModel(), carMetadata.getPrice(), carMetadata.getColor());
    }
}
