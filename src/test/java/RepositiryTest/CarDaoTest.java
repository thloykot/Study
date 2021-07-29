package RepositiryTest;

import Entity.CarGenerator;
import Entity.CarMetaDataGenerator;
import Entity.EngineGenerator;
import com.company.car.Car;
import com.company.car.CarEntity;
import com.company.car.CarMetadata;
import com.company.dao.CarDao;
import com.company.dao.Impl.CarDaoImpl;
import com.company.engine.Engine;
import org.jooq.DSLContext;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.core.Is.is;
import static org.jooq.generatedDB.tables.Car.CAR;
import static org.jooq.generatedDB.tables.Engine.ENGINE;

@RunWith(JUnit4.class)
public class CarDaoTest {
    private static final DSLContext dslContext = TestDataBaseHandler.getDbDSLContext();
    private final CarDao carDao = new CarDaoImpl(TestDataBaseHandler.getDbDSLContext());


    @BeforeClass
    public static void doBeforeTest() {
        if (!carTableIsEmpty()) {
            clearCarTable();
        }
    }

    @Test
    public void testSave() {
        Car testCar = CarGenerator.getCar(EngineGenerator.getEngine());
        int engineId1 = saveEngineForCar(EngineGenerator.getEngine());

        carDao.save(testCar, engineId1);

        assertThat(hasCar(testCar, engineId1), is(true));
    }

    @Test
    public void testCarExist() {
        Car testCar = CarGenerator.getCar(EngineGenerator.getEngine());
        int engineId1 = saveEngineForCar(EngineGenerator.getEngine());

        carDao.save(testCar, engineId1);

        assertThat(carDao.isExist(testCar.getMark(), testCar.getModel(),
                testCar.getPrice(), testCar.getColor()), is(true));
    }

    @Test
    public void testFindCars() {
        Car testedCar = CarGenerator.getCar(EngineGenerator.getEngine());
        int engineId1 = saveEngineForCar(EngineGenerator.getEngine());
        int id = carDao.save(testedCar, engineId1);
        CarEntity testedEntity = new CarEntity(id, testedCar.getMark(), testedCar.getModel(),
                testedCar.getPrice(), testedCar.getColor(), engineId1);

        assertThat(carDao.findCars(testedCar.getModel()), containsInAnyOrder(testedEntity));
    }

    @Test
    public void testUpdate() {

        Car testCarOld = CarGenerator.getCar(EngineGenerator.getEngine());
        Car testCarNew = CarGenerator.getCar(EngineGenerator.getEngine());
        int engineId1 = saveEngineForCar(EngineGenerator.getEngine());
        int engineId2 = saveEngineForCar(EngineGenerator.getEngine());
        int oldCarId = carDao.save(testCarOld, engineId1);

        carDao.update(testCarNew, oldCarId, engineId2);

        assertThat(hasCar(testCarOld, engineId1), is(false));
        assertThat(hasCar(testCarNew, engineId2), is(true));
    }

    @Test
    public void testUpdateMeta() {
        Car testCar = CarGenerator.getCar(EngineGenerator.getEngine());
        CarMetadata carMetadata = CarMetaDataGenerator.getCarMetadata();
        int engineId1 = saveEngineForCar(EngineGenerator.getEngine());
        int oldCarId = carDao.save(testCar, engineId1);

        carDao.update(carMetadata, oldCarId);

        assertThat(hasCar(testCar, engineId1), is(false));
        assertThat(hasCar(carMetadata), is(true));
    }

    @Test
    public void testDelete() {
        Car testCar = CarGenerator.getCar(EngineGenerator.getEngine());
        int engineId1 = saveEngineForCar(EngineGenerator.getEngine());
        int carId = carDao.save(testCar, engineId1);

        carDao.delete(carId);

        assertThat(hasCar(testCar, engineId1), is(false));
    }

    @AfterClass
    public static void doAfterTest() {
        clearCarTable();
        clearEngineTable();
    }

    /*Methods used for testing*/
    private boolean hasCar(Car car, int engineId) {
        return dslContext.fetchExists(CAR, CAR.MARK.eq(car.getMark().name()),
                CAR.MODEL.eq(car.getModel()), CAR.COLOR.eq(car.getColor()),
                CAR.PRICE.eq(car.getPrice()), CAR.ENGINE_ID.eq(engineId));
    }

    private boolean hasCar(CarMetadata car) {
        return dslContext.fetchExists(CAR, CAR.MARK.eq(car.getMark().name()),
                CAR.MODEL.eq(car.getModel()),
                CAR.COLOR.eq(car.getColor()),
                CAR.PRICE.eq(car.getPrice()));
    }

    private int saveEngineForCar(Engine engine) {
        return dslContext.insertInto(ENGINE, ENGINE.MARK, ENGINE.CAPASITY)
                .values(engine.getMark().name(), engine.getCapasity()).
                        returningResult(ENGINE.ID).fetchOne().into(int.class);
    }

    private static boolean carTableIsEmpty() {
        return dslContext.selectCount().from(CAR).fetchSingleInto(boolean.class);
    }

    private static void clearCarTable() {
        dslContext.truncate(CAR).execute();
    }

    private static void clearEngineTable() {
        dslContext.truncate(ENGINE).cascade().execute();
    }
}
