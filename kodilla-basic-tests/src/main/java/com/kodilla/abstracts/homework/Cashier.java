package com.kodilla.abstracts.homework;

public class Cashier extends Job {


    public Cashier(String responsibilities, int salary) {
        super(responsibilities, salary);
    }

    @Override
    public void displayResponsibilities() {
        System.out.println("Do obowiązków kasjera należy obsługa klientów oraz wykładanie towaru.");


    }
}
