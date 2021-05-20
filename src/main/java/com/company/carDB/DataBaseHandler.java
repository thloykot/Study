package com.company.carDB;

import org.jooq.*;
import org.jooq.impl.*;


public class DataBaseHandler {

    private static final String USER = "postgres";
    private static final String PASS = System.getenv().get("StudyDBPass");
    private static final String CONNECTION_STR = "jdbc:postgresql://localHost:5432/carsdb";


    public DSLContext getDbDSLContext() {
        if (PASS != null) {
            return DSL.using(CONNECTION_STR, USER, PASS);


        }
        throw new RuntimeException("Пароль відсутній");
    }

}
