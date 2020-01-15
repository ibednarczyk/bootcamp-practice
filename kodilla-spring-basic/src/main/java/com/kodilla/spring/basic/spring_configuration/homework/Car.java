package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public interface Car {

    default boolean hasHeadlightsTurnedOn(){
        if (LocalTime.now().isAfter(LocalTime.of(19, 59)) || LocalTime.now().isBefore(LocalTime.of(6, 0))) {
            return true;
        } else {
            return false;
        }
    }

    String getCarType();

}
