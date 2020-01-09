package com.kodilla.spring.basic.dependency_injection.homework;

public class EmailNotificationService implements NotificationService {
    @Override
    public void success(String address) {
        System.out.println("Sending an e-mail: Package delivered to: " + address);

    }

    @Override
    public void fail(String address) {
        System.out.println("Sending an e-mail: Package not delivered to: " + address);

    }
}
