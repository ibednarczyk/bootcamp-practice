package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void shouldAddValues(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double result = bean.add(14.5, 222.0);
        assertEquals(Optional.of(236.5), Optional.of(result));

    }

   @Test
    public void shouldSubtractValues(){
       ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
       Calculator bean = context.getBean(Calculator.class);
       double result = bean.subtract(-435.8, 64.2);
       assertEquals(Optional.of(-500.0), Optional.of(result));

   }
    @Test
    public void shouldMultiplyValues(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double result = bean.multiply(12.5, 10.0);
        assertEquals(Optional.of(125.0), Optional.of(result));

    }
    @Test
    public void shouldDivideValues(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double result = bean.divide(144.0, -12.0);
        assertEquals(Optional.of(-12.0), Optional.of(result));

    }
}
