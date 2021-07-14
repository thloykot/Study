package Entity;

import com.company.engine.BMWEngine;
import com.company.engine.Engine;

public class EngineGenerator extends Generator {

    public static Engine getEngine() {
        return new BMWEngine(random.nextInt());
    }

}