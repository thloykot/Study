package RepositiryTest;

import org.jooq.DSLContext;
import org.jooq.impl.DSL;

public class TestDataBaseHandler {

    private static final String USER = "postgres";
    private static final String PASS = System.getenv().get("StudyDBPass");
    private static final String CONNECTION_STR = "jdbc:postgresql://localHost:5432/testdb";


    public static DSLContext getDbDSLContext() {
        if (PASS != null) {
            return DSL.using(CONNECTION_STR, USER, PASS);
        }
        throw new RuntimeException("Пароль відсутній");
    }

}

