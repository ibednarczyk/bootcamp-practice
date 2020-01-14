package com.kodilla.spring.basic.spring_scopes.homework;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ClockTestSuite {


    @Test
    public void shouldGiveDifferentTime(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Clock firstHour = context.getBean(Clock.class);
        Clock secondHour = context.getBean(Clock.class);
        Clock thirdHour = context.getBean(Clock.class);
        assertNotEquals(firstHour, secondHour);
        assertNotEquals(firstHour, thirdHour);
        assertNotEquals(secondHour, thirdHour);



    }



}