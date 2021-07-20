package ServiceTest;

import Entity.CarEntityGenerator;
import Entity.CarGenerator;
import Entity.CarMetaDataGenerator;
import Entity.EngineGenerator;
import com.company.car.*;
import com.company.dao.CarDao;
import com.company.engine.Engine;
import com.company.service.EngineServise;
import com.company.service.Impl.CarServiseImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;
import java.util.Optional;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CarServiceTest {

    private static final int ENGINE_ID = 0;
    private static final int CAR_ID = 0;
    private static final int AFFECTED_ROWS = 1;


    @InjectMocks
    private CarServiseImpl carServise;
    @Mock
    private CarDao carDao;
    @Mock
    private EngineServise engineServise;


    @Test
    public void testSave() {
        Engine engine = EngineGenerator.getEngine();
        Car car = CarGenerator.getCar(engine);

        when(engineServise.findEngineId(engine)).thenReturn(Optional.of(ENGINE_ID));
        when(carDao.save(car, ENGINE_ID)).thenReturn(AFFECTED_ROWS);

        assertThat(carServise.save(car), is(AFFECTED_ROWS));
    }

    @Test
    public void testSaveIfCarExists() {
        Engine engine = EngineGenerator.getEngine();
        Car car = CarGenerator.getCar(engine);

        when(carDao.isExist(car.getMark(), car.getModel(), car.getPrice(), car.getColor())).thenReturn(true);

        assertThrows(IllegalArgumentException.class, () -> carServise.save(car));
    }

    @Test
    public void testFindCars() {
        int price = 0;
        CarEntity carEntity = new CarEntity(CAR_ID, Mark.BMW, "Test", price, "Test", ENGINE_ID);
        Engine engine = EngineGenerator.getEngine();
        Car car = new BMW("Test", price, "Test", engine);

        when(carDao.findCars(car.getModel())).thenReturn(List.of(carEntity));
        when(engineServise.findEngine(carEntity.getEngineId())).thenReturn(Optional.of(engine));

        assertThat(carServise.findCars(car.getModel()), containsInAnyOrder(car));
    }

    @Test
    public void testUpdate() {
        Engine engine = EngineGenerator.getEngine();
        Car car = CarGenerator.getCar(engine);

        when(engineServise.findEngineId(engine)).thenReturn(Optional.of(ENGINE_ID));
        when(carDao.update(car, CAR_ID, ENGINE_ID)).thenReturn(AFFECTED_ROWS);

        assertThat(carServise.update(car, CAR_ID), is(AFFECTED_ROWS));
    }

    @Test
    public void testUpdateIfCarExists() {
        Engine engine = EngineGenerator.getEngine();
        Car car = CarGenerator.getCar(engine);

        when(carDao.isExist(car.getMark(), car.getModel(), car.getPrice(), car.getColor())).thenReturn(true);

        assertThrows(IllegalArgumentException.class, () -> carServise.update(car, CAR_ID));
    }

    @Test
    public void testUpdateMeta() {
        CarMetadata carMetadata = CarMetaDataGenerator.getCarMetadata();

        when(carDao.update(carMetadata, CAR_ID)).thenReturn(AFFECTED_ROWS);

        assertThat(carServise.update(carMetadata, CAR_ID), is(AFFECTED_ROWS));
    }

    @Test
    public void testUpdateMetaIfCarExists() {
        CarMetadata carMetadata = CarMetaDataGenerator.getCarMetadata();

        when(carDao.isExist(carMetadata.getMark(), carMetadata.getModel(),
                carMetadata.getPrice(), carMetadata.getColor())).thenReturn(true);

        assertThrows(IllegalArgumentException.class, () -> carServise.update(carMetadata, CAR_ID));
    }

    @Test
    public void testCarServiceDelete() {
        CarEntity carEntity = CarEntityGenerator.getCarEntity();

        when(carDao.delete(carEntity.getId())).thenReturn(AFFECTED_ROWS);

        assertThat(carServise.delete(carEntity.getId()), is(AFFECTED_ROWS));
    }

}
