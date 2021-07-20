package Entity;

import com.company.car.BMW;
import com.company.car.Car;
import com.company.engine.Engine;

public class CarGenerator extends Generator {

    public static Car getCar(Engine engine) {
        return new BMW(getRandString(), random.nextInt(),
                getRandString(), engine);
    }

}
