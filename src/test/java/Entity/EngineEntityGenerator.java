package Entity;

import com.company.engine.EngineEntity;

public class EngineEntityGenerator extends Generator {

    public static EngineEntity getEngineEntity() {
        return new EngineEntity(getRandMark(), random.nextInt(), random.nextInt());

    }
}
