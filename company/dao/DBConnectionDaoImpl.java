package com.company.dao;

import org.jooq.DSLContext;

public class DBConnectionDaoImpl implements DBConnectionDao {
    private final DSLContext dslContext;

    public DBConnectionDaoImpl(DSLContext dslContext) {
        this.dslContext = dslContext;
    }

    @Override
    public boolean isConnected() {
        return dslContext.selectOne().fetchSingleInto(Boolean.TYPE);
    }
}
