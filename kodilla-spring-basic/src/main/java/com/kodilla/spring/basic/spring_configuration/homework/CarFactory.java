package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.MonthDay;

@Configuration
public class CarFactory {

    @Bean
    public Car chooseCar() {
        Car car;
        if ((MonthDay.now().isAfter(MonthDay.of(3,20))
                && MonthDay.now().isBefore(MonthDay.of(6, 22)))
                || (MonthDay.now().isAfter(MonthDay.of(9,22))
                && MonthDay.now().isBefore(MonthDay.of(12, 22)))) {
            car = new Sedan();
        } else if (MonthDay.now().isAfter(MonthDay.of(12, 21))
                || MonthDay.now().isBefore(MonthDay.of(3, 21))){
            car = new SUV();
        } else {
            car = new Cabrio();
        }
        return car;

    }




}

