package com.kodilla.spring.basic.spring_scopes.homework;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
class ClockTestSuite {


    @Test
    public void shouldGiveDifferentTime(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Clock firstBean = context.getBean(Clock.class);
        Clock secondBean = context.getBean(Clock.class);
        Clock thirdBean = context.getBean(Clock.class);
        LocalTime firstHour = firstBean.currentTime();
        LocalTime secondHour = secondBean.currentTime();
        LocalTime thirdHour = thirdBean.currentTime();
        assertNotEquals(firstHour, secondHour);
        assertNotEquals(firstHour, thirdHour);
        assertNotEquals(secondHour, thirdHour);




    }



}