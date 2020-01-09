package com.kodilla.spring.basic.dependency_injection.homework;

public class SMSNotificationService implements NotificationService {
    @Override
    public void success(String address) {
        System.out.println("Sending a text message: Package delivered to: " + address);

    }

    @Override
    public void fail(String address) {
        System.out.println("Sending a text message: Package not delivered to: " + address);

    }
}
