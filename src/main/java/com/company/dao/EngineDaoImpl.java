package com.company.dao;

import com.company.car.Car;
import com.company.engine.Engine;
import org.jooq.DSLContext;
import org.jooq.Field;
import org.jooq.Table;
import static org.jooq.generatedDB.tables.Engine.ENGINE;

public class EngineDaoImpl implements EngineDao {

    private final DSLContext dslContext;

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
}
