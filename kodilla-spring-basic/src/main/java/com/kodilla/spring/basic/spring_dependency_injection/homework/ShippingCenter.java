package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.beans.factory.annotation.Autowired;

public class ShippingCenter {

    @Autowired
    private DeliveryService deliveryService;
    @Autowired
    private NotificationService notificationService;


    public void sendPackage(String address, double weight) {
        if (deliveryService.deliverPackage(address, weight)) {
            notificationService.success(address);
        } else {
            notificationService.fail(address);
        }
    }


}
