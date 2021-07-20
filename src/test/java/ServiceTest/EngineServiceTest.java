package ServiceTest;

import Entity.EngineGenerator;
import com.company.car.Mark;
import com.company.dao.EngineDao;
import com.company.engine.BMWEngine;
import com.company.engine.Engine;
import com.company.engine.EngineEntity;
import com.company.service.Impl.EngineServiseImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Optional;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class EngineServiceTest {

    private static final int CAPASITY = 0;
    private static final int ENGINE_ID = 0;
    private static final int AFFECTED_ROWS = 1;


    @InjectMocks
    private EngineServiseImpl engineServise;

    @Mock
    private EngineDao engineDao;


    @Test
    public void testSave() {
        Engine engine = EngineGenerator.getEngine();

        when(engineDao.save(engine)).thenReturn(AFFECTED_ROWS);

        assertThat(engineServise.save(engine), is(AFFECTED_ROWS));
    }

    @Test
    public void testSaveIfEngineExist() {
        Engine engine = EngineGenerator.getEngine();

        when(engineDao.isExist(engine)).thenReturn(true);

        assertThrows(IllegalArgumentException.class, () -> engineServise.save(engine));
    }

    @Test
    public void testFindEngine() {
        EngineEntity engineEntity = new EngineEntity(Mark.BMW, CAPASITY, ENGINE_ID);
        Engine engine = new BMWEngine(CAPASITY);

        when(engineDao.findEngine(ENGINE_ID)).thenReturn(Optional.of(engineEntity));

        Optional<Engine> engineOptional = engineServise.findEngine(ENGINE_ID);

        assertThat(engineOptional.isPresent(), is(true));
        assertThat(engineOptional.get(), is(engine));
    }

    @Test
    public void testFindEngineId() {

        EngineEntity engineEntity = new EngineEntity(Mark.BMW, CAPASITY, ENGINE_ID);
        Engine engine = new BMWEngine(engineEntity.getCapasity());

        when(engineDao.findEngineId(engine)).thenReturn(Optional.of(engineEntity.getId()));

        Optional<Integer> optionalInteger = engineServise.findEngineId(engine);

        assertThat(optionalInteger.isPresent(), is(true));
        assertThat(optionalInteger.get(), is(engineEntity.getId()));
    }

    @Test
    public void testUpdate() {
        Engine engine = EngineGenerator.getEngine();

        when(engineDao.update(engine, ENGINE_ID)).thenReturn(AFFECTED_ROWS);

        assertThat(engineServise.update(engine, ENGINE_ID), is(AFFECTED_ROWS));
    }

    @Test
    public void testUpdateIfEngineExist() {
        Engine engine = EngineGenerator.getEngine();

        when(engineDao.isExist(engine)).thenReturn(true);

        assertThrows(IllegalArgumentException.class, () -> engineServise.update(engine, ENGINE_ID));
    }

    @Test
    public void testDelete() {

        when(engineDao.delete(ENGINE_ID)).thenReturn(AFFECTED_ROWS);

        assertThat(engineServise.delete(ENGINE_ID), is(AFFECTED_ROWS));
    }
}
