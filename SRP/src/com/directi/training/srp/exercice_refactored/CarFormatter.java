package com.directi.training.srp.exercice_refactored;

import java.util.List;

public class CarFormatter {

    public String getCarsNames(List<Car> cars)
    {
        StringBuilder sb = new StringBuilder();
        for (Car car : cars) {
            car.getName();
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }
}
