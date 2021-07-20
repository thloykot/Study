package FactoryTest;

import com.company.car.*;
import com.company.engine.BMWEngine;
import com.company.engine.Engine;
import com.company.engine.MercedesEngine;
import com.company.engine.VolkswagenEngine;
import com.company.factory.CarFactory;
import com.company.factory.CarFactoryImpl.BMWFactory;
import com.company.factory.CarFactoryImpl.MercedesFactory;
import com.company.factory.CarFactoryImpl.VolkswagenFactory;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class CarFactoryTest {

    private static final int ID = 0;
    private static final String MODEL = "Test";
    private static final int PRICE = 0;
    private static final String COLOR = "Test";
    private static final int ENGINE_ID = 0;
    private static final int CAPACITY = 0;


    @Test
    public void convertToBMWTest() {
        CarFactory bmwFactory = new BMWFactory();
        CarEntity carEntity = makeCarEntity(Mark.BMW);
        Engine engine = new BMWEngine(CAPACITY);
        Car expectedCar = new BMW(MODEL, PRICE, COLOR, engine);

        assertThat(bmwFactory.convertToCar(carEntity, engine), is(expectedCar));
    }

    @Test
    public void convertToVolkswagenTest() {
        CarFactory volkswagenFactory = new VolkswagenFactory();
        CarEntity carEntity = makeCarEntity(Mark.VOLKSWAGEN);
        Engine engine = new VolkswagenEngine(CAPACITY);
        Car expectedCar = new Volkswagen(MODEL, PRICE, COLOR, engine);

        assertThat(volkswagenFactory.convertToCar(carEntity, engine), is(expectedCar));
    }

    @Test
    public void convertToMercedesTest() {
        CarFactory mercedesFactory = new MercedesFactory();
        CarEntity carEntity = makeCarEntity(Mark.MERCEDES);
        Engine engine = new MercedesEngine(CAPACITY);
        Car expectedCar = new Mercedes(MODEL, PRICE, COLOR, engine);

        assertThat(mercedesFactory.convertToCar(carEntity, engine), is(expectedCar));
    }

    private CarEntity makeCarEntity(Mark mark) {
        return new CarEntity(ID, mark, MODEL, PRICE, COLOR, ENGINE_ID);
    }
}
