package RepositiryTest;

import com.company.dao.CarDao;
import com.company.dao.Impl.CarDaoImpl;
import org.junit.Test;

public class CarDaoTest {

    private static final CarDao CAR_DAO = new CarDaoImpl(TestDataBaseHandler.getDbDSLContext());

    @Test
    public void test(){

    }
}
