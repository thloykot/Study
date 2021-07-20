package Entity;


import com.company.car.Mark;

import java.util.Random;
import java.util.UUID;

public abstract class Generator {
    protected final static Random random = new Random();


    protected static String getRandString() {
        return UUID.randomUUID().toString();
    }

    protected static Mark getRandMark() {
        return Mark.values()[random.nextInt(Mark.values().length)];
    }
}
