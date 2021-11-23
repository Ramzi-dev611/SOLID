package com.directi.training.isp.exercice_refactored;

import java.util.Random;

public class Sensor {
    public void register(SensorDoor door)
    {
        while (true) {
            if (isPersonClose()) {
                door.proximityCallback();
                break;
            }
        }
    }

    private boolean isPersonClose()
    {
        return new Random().nextBoolean();
    }
}
