package com.kodilla.abstracts.homework;

public class Actor extends Job {
    public Actor(String responsibilities, int salary) {
        super(responsibilities, salary);
    }

    @Override
    public void displayResponsibilities() {
        System.out.println("Do obowiązków aktora należy odgrywanie ról w teatrze oraz uczestnictwo w próbach.");


    }
}
