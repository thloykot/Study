package com.company.diller;

import com.company.car.Car;
import com.company.car.CarBuilder;
import com.company.engine.EngineBuilder;
import com.company.entity.DBTablesGetter;
import com.company.entity.SingletonProvider;
import com.company.service.CarServise;
import com.company.service.EngineServise;
import org.jooq.DSLContext;

import java.util.List;

import static org.jooq.generatedDB.tables.Car.CAR;
import static org.jooq.generatedDB.tables.Engine.ENGINE;

public class Diller {
    private final DSLContext dslContext;

    public Diller(DSLContext dslContext) {
        this.dslContext = dslContext;
    }

    public void get(String model) {
        DBTablesGetter dbTablesGetter = dslContext.select(CAR.MARK, CAR.MODEL, CAR.PRICE, CAR.COLOR)
                .select(ENGINE.CAPASITY)
                .from(CAR)
                .join(ENGINE).on(CAR.ID.eq(ENGINE.ID))
                .where(CAR.MODEL.equal(model))
                .fetchSingle().into(DBTablesGetter.class);
        dbTablesGetter.giveInfo();
    }
}