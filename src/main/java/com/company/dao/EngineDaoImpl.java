package com.company.dao;

import com.company.car.Mark;
import com.company.engine.Engine;
import com.company.engine.EngineBuilder;
import com.company.entity.SingletonProvider;
import com.company.factory.EngineFactory;
import org.jooq.DSLContext;
import org.jooq.Record1;

import java.util.List;
import java.util.Optional;

import static org.jooq.generatedDB.tables.Car.CAR;
import static org.jooq.generatedDB.tables.Engine.ENGINE;

public class EngineDaoImpl implements EngineDao {

    private final DSLContext dslContext;
    private final EngineFactory engineFactory = SingletonProvider.getEngineFactory();

    public EngineDaoImpl(DSLContext dslContext) {
        this.dslContext = dslContext;
    }

    @Override
    public void save(Engine engine) {
        dslContext.insertInto(ENGINE, ENGINE.MARK,ENGINE.CAPASITY).values(String.valueOf(Mark.BMW), engine.getCapasity()).execute();
    }

    @Override
    public void delete(int capasity) {
        dslContext.deleteFrom(ENGINE).where(ENGINE.CAPASITY.eq(capasity)).execute();
    }

    @Override
    public void update(Engine engine, int capasity) {
        dslContext.update(ENGINE).set(ENGINE.CAPASITY, engine.getCapasity()).where(ENGINE.CAPASITY.eq(capasity)).execute();
    }


    @Override
    public Optional<Engine> get(int capasity) {
        EngineBuilder engineBuilder = dslContext.select(ENGINE.MARK,ENGINE.CAPASITY).from(ENGINE).fetchAny().into(EngineBuilder.class);
        return engineBuilder.getEngine();
    }

    @Override
    public List<Engine> getAll() {
        return null;
    }
}
