package com.kodilla.abstracts.homework;

public class Doctor extends Job {

    public Doctor(String responsibilities, int salary) {
        super(responsibilities, salary);
    }

    @Override
    public void displayResponsibilities() {
        System.out.println("Do obowiązków lekarza należy: dbanie o chorych i przeprowadzanie operacji.");


    }
}
