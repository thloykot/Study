package FactoryTest;

import com.company.engine.BMWEngine;
import com.company.engine.MercedesEngine;
import com.company.engine.VolkswagenEngine;
import com.company.factory.EngineFactory;
import com.company.factory.EngineFactoryImpl.BMWEngineFactory;
import com.company.factory.EngineFactoryImpl.MercedesEngineFactory;
import com.company.factory.EngineFactoryImpl.VolkswagenEngineFactory;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


public class EngineFactoryTest {

    private static final int CAPACITY = 0;


    @Test
    public void createBMWEngineTest() {

        EngineFactory engineFactory = new BMWEngineFactory();

        assertThat(engineFactory.createEngine(CAPACITY), is(new BMWEngine(CAPACITY)));
    }

    @Test
    public void createMercedesEngineTest() {

        MercedesEngineFactory mercedesEngineFactory = new MercedesEngineFactory();

        assertThat(mercedesEngineFactory.createEngine(CAPACITY), is(new MercedesEngine(CAPACITY)));
    }

    @Test
    public void createVolkswagenEngineTest() {

        VolkswagenEngineFactory volkswagenEngineFactory = new VolkswagenEngineFactory();

        assertThat(volkswagenEngineFactory.createEngine(CAPACITY), is(new VolkswagenEngine(CAPACITY)));
    }
}
