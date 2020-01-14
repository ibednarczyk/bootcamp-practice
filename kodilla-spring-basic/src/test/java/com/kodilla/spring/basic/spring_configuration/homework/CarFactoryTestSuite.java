package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

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
        //then
        assertFalse(carLightsTurnedOn);


    }


}
