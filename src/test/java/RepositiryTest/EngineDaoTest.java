package RepositiryTest;

import Entity.EngineGenerator;
import com.company.dao.EngineDao;
import com.company.dao.Impl.EngineDaoImpl;
import com.company.engine.Engine;
import com.company.engine.EngineEntity;
import org.jooq.DSLContext;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Optional;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.jooq.generatedDB.Tables.ENGINE;

public class EngineDaoTest {

    private static final DSLContext dslContext = TestDataBaseHandler.getDbDSLContext();
    private final EngineDao engineDao = new EngineDaoImpl(TestDataBaseHandler.getDbDSLContext());


    @BeforeClass
    public static void doBeforeTest() {
        if (!engineTableIsEmpty()) {
            clearEngineTable();
        }
    }


    @Test
    public void testSave() {
        Engine engine = EngineGenerator.getEngine();

        engineDao.save(engine);

        assertThat(engineDao.isExist(engine), is(true));
    }

    @Test
    public void testFindEngineId() {
        Engine engine = EngineGenerator.getEngine();
        int engineId = engineDao.save(engine);
        Optional<Integer> foundId = engineDao.findEngineId(engine);

        assertThat(foundId.isPresent(), is(true));
        assertThat(foundId.get(), is(engineId));
    }

    @Test
    public void testFindEngine() {
        Engine engine = EngineGenerator.getEngine();
        int id = engineDao.save(engine);
        EngineEntity engineEntity = new EngineEntity(engine.getMark(), engine.getCapasity(), id);

        assertThat(engineDao.findEngine(id).isPresent(), is(true));
        assertThat(engineDao.findEngine(id).get(), is(engineEntity));
    }

    @Test
    public void testUpdate() {
        Engine engineOld = EngineGenerator.getEngine();
        Engine engineNew = EngineGenerator.getEngine();
        int id = engineDao.save(engineOld);

        engineDao.update(engineNew, id);

        assertThat(engineDao.isExist(engineOld), is(false));
        assertThat(engineDao.isExist(engineNew), is(true));
    }

    @Test
    public void testIsExist() {
        Engine engine = EngineGenerator.getEngine();
        engineDao.save(engine);

        assertThat(engineDao.isExist(engine), is(true));

    }

    @Test
    public void testDelete() {
        Engine engine = EngineGenerator.getEngine();
        int id = engineDao.save(engine);

        engineDao.delete(id);

        assertThat(engineDao.isExist(engine), is(false));
    }

    @AfterClass
    public static void doAfterTest() {
        clearEngineTable();
    }

    /*Methods used for testing*/
    private static boolean engineTableIsEmpty() {
        return dslContext.selectCount().from(ENGINE).fetchSingleInto(boolean.class);
    }

    private static void clearEngineTable() {
        dslContext.truncate(ENGINE).cascade().execute();
    }
}
