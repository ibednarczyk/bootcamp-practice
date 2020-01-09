package com.kodilla.spring.basic.dependency_injection.homework;

public class DPDDeliveryService implements DeliveryService {
    @Override
    public boolean deliverPackage(String address, double weight) {
        if (weight > 50) {
            System.out.println("Package too heavy");
            return false;
        }
        System.out.println("Delivering in progress...");
        return true;

    }
}
