package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class ShippingCenterTestSuite {

    @Autowired
    private ShippingCenter center = new ShippingCenter();
    @MockBean
    private DeliveryService deliveryService;
    @MockBean
    private NotificationService notificationService;


    @Test
    public void shouldDeliverPackage(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection");
        DeliveryService bean = context.getBean(DeliveryService.class);
        Assertions.assertTrue(bean.deliverPackage( 25.0));
    }

    @Test
    public void shouldNotDeliverPackage(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection");
        DeliveryService bean = context.getBean(DeliveryService.class);
        Assertions.assertFalse(bean.deliverPackage(  88.0));
    }

    @Test
    public void shouldSendCorrectMessageWhenTheDeliverySucceed(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection");
        NotificationService bean = context.getBean(NotificationService.class);
        String resultMessage = bean.success("140-0015 Tokyo, Shinagawa City, Nishioi, 2-chome−19−11");
        Assertions.assertEquals("Package delivered to: 140-0015 Tokyo, Shinagawa City, Nishioi, 2-chome−19−11", resultMessage);
    }

    @Test
    public void shouldSendCorrectMessageWhenTheDeliveryFailed(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection");
        NotificationService bean = context.getBean(NotificationService.class);
        String resultMessage = bean.fail("140-0015 Tokyo, Shinagawa City, Nishioi, 2-chome−19−11");
        Assertions.assertEquals("Package not delivered to: 140-0015 Tokyo, Shinagawa City, Nishioi, 2-chome−19−11", resultMessage);

    }

    @Test
    public void shouldNotSendSuccessMessageWhenTheDeliveryFailed(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection");
        NotificationService bean = context.getBean(NotificationService.class);
        String resultMessage = bean.fail("140-0015 Tokyo, Shinagawa City, Nishioi, 2-chome−19−11");
        Assertions.assertNotEquals("Package delivered to: 140-0015 Tokyo, Shinagawa City, Nishioi, 2-chome−19−11", resultMessage);

    }

    @Test
    public void shouldNotSendFailMessageWhenTheDeliverySucceed(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection");
        NotificationService bean = context.getBean(NotificationService.class);
        String resultMessage = bean.success("140-0015 Tokyo, Shinagawa City, Nishioi, 2-chome−19−11");
        Assertions.assertNotEquals("Package not delivered to: 140-0015 Tokyo, Shinagawa City, Nishioi, 2-chome−19−11", resultMessage);

    }

    @Test
    public void shouldDeliverPackageAndSendSuccessMessageWhenCorrectWeight(){
        center.sendPackage("Warszawa, al. Jerozolimskie", 25.0);
        Mockito.verify(deliveryService, Mockito.times(1)).deliverPackage(25.0);
        Mockito.verify(notificationService, Mockito.times(1)).success("Warszawa, al. Jerozolimskie");
    }

    @Test
    public void shouldNotDeliverPackageAndSendFailMessageWhenIncorrectWeight(){
        center.sendPackage("Warszawa, al. Jerozolimskie", 95.0);
        Mockito.verify(deliveryService, Mockito.never()).deliverPackage(95.0);
        Mockito.verify(notificationService, Mockito.times(1)).fail("Warszawa, al. Jerozolimskie");
    }









}
