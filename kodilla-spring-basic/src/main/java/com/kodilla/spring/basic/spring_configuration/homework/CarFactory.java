package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.MonthDay;

@Configuration
public class CarFactory {

    private MonthDay winter = MonthDay.now();
    private MonthDay spring = MonthDay.now();
    private MonthDay autumn = MonthDay.now();

    @Bean
    public Car chooseCar() {
        Car car;
        if (((spring.isAfter(MonthDay.of(3,20))
                && spring.isBefore(MonthDay.of(6, 22)))
                || autumn.isAfter(MonthDay.of(9,22))
                && autumn.isBefore(MonthDay.of(12, 22)))) {
            car = new Sedan();
        } else if(winter.isAfter(MonthDay.of(12, 21))
                || winter.isBefore(MonthDay.of(3, 21))){
            car = new SUV();
        } else {
            car = new Cabrio();
        }
        return car;

    }




}

