package com.company.dao;

import com.company.car.Car;
import com.company.car.Mark;
import com.company.engine.Engine;
import com.company.entity.SingletonProvider;
import com.company.factory.EngineFactory;
import org.jooq.DSLContext;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Table;

import java.util.List;
import java.util.Optional;

import static org.jooq.generatedDB.tables.Engine.ENGINE;

public class EngineDaoImpl implements EngineDao {

    private final DSLContext dslContext;
    private final EngineFactory engineFactory = SingletonProvider.getEngineFactory();

    public EngineDaoImpl(DSLContext dslContext) {
        this.dslContext = dslContext;
    }

    @Override
    public void save(Engine engine) {
        dslContext.insertInto(ENGINE, ENGINE.CAPASITY).values(engine.getCapasity());
    }

    @Override
    public void delete(int capasity) {
        dslContext.deleteFrom(ENGINE).where(ENGINE.CAPASITY.eq(capasity)).execute();
    }

    @Override
    public void update(Engine engine, int capasity) {
        dslContext.update(ENGINE).set(ENGINE.CAPASITY, engine.getCapasity()).where(ENGINE.CAPASITY.eq(capasity));
    }


    @Override
    public Optional<Engine> get(String Mark) {
         Record1<String> engineMap = dslContext.select(ENGINE.MARK).fetchSingle();
        engineFactory.makeEngine(com.company.car.Mark.valueOf(engineMap.value1()));
        return Optional.empty();
    }

    @Override
    public List<Engine> getAll() {
        return null;
    }
}
