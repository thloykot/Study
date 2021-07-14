package Entity;

import com.company.car.CarEntity;

public class CarEntityGenerator extends Generator {

    public static CarEntity getCarEntity() {
        return new CarEntity(random.nextInt(), getRandMark(), getRandString(),
                random.nextInt(), getRandString(), random.nextInt());
    }

}
