package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CarFactoryTestSuite {

    @Test
    public void shouldChooseTheCar(){
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Car carBean = (Car) context.getBean("chooseCar");
        //when
        String carType = carBean.getCarType();
        //then
        assertEquals("SUV", carType);
    }

    @Test
    public void shouldCheckWhetherHeadLightsAreTurnedOn(){
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Car carBean = (Car) context.getBean("chooseCar");
        //when
        boolean carLightsTurnedOn = carBean.hasHeadlightsTurnedOn();
        LocalTime now = LocalTime.now();
        //then
        if(now.isAfter(LocalTime.of(19,59)) || now.isBefore(LocalTime.of(6,0))){
           assertTrue(carLightsTurnedOn);

        } else {
            assertFalse(carLightsTurnedOn);
        }

    }


}
