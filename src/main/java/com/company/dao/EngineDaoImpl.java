package com.company.dao;

import com.company.engine.Engine;
import com.company.engine.EngineEntity;
import org.jooq.DSLContext;

import java.util.List;
import java.util.Optional;

import static org.jooq.generatedDB.tables.Engine.ENGINE;

public class EngineDaoImpl implements EngineDao {

    private final DSLContext dslContext;


    public EngineDaoImpl(DSLContext dslContext) {
        this.dslContext = dslContext;
    }

    @Override
    public int save(Engine engine) {
        return dslContext.insertInto(ENGINE, ENGINE.MARK, ENGINE.CAPASITY)
                .values(engine.getMark().name(), engine.getCapasity()).
                        returningResult(ENGINE.ID).fetchOne().into(int.class);
    }

    @Override
    public int delete(int id) {
        return dslContext.deleteFrom(ENGINE).where(ENGINE.ID.eq(id)).execute();
    }

    @Override
    public int update(Engine engine, int id) {
        return dslContext.update(ENGINE).set(ENGINE.CAPASITY, engine.getCapasity())
                .set(ENGINE.MARK, engine.getMark().name()).where(ENGINE.ID.eq(id))
                .returningResult(ENGINE.ID).fetchOne().into(int.class);
    }

    @Override
    public Optional<EngineEntity> findEngine(int id) {
        return dslContext.select(ENGINE.MARK, ENGINE.CAPASITY, ENGINE.ID).from(ENGINE).where(ENGINE.ID.eq(id))
                .fetchOptionalInto(EngineEntity.class);
    }

    @Override
    public List<EngineEntity> getAll() {
        return dslContext.select(ENGINE.MARK, ENGINE.CAPASITY, ENGINE.ID)
                .from(ENGINE).fetchInto(EngineEntity.class);
    }

    @Override
    public Optional<Integer> findEngineId(Engine engine) {
        return dslContext.select(ENGINE.ID).from(ENGINE).where(ENGINE.MARK.eq(engine.getMark().name()).and(ENGINE.CAPASITY.eq(engine.getCapasity())))
                .fetchOptionalInto(int.class);
    }

    @Override
    public boolean isExist(Engine engine) {
        return dslContext.fetchExists(ENGINE, ENGINE.MARK.eq(engine.getMark().name()), ENGINE.CAPASITY.eq(engine.getCapasity()));
    }
}
