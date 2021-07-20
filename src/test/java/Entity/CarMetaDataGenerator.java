package Entity;

import com.company.car.CarMetadata;

public class CarMetaDataGenerator extends Generator {

    public static CarMetadata getCarMetadata() {
        return new CarMetadata(getRandMark(), getRandString(),
                random.nextInt(), getRandString());

    }
}