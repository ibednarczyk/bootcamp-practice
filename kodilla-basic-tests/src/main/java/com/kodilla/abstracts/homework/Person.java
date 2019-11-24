package com.kodilla.abstracts.homework;

public class Person {
    private String firstName;
    private int age;
    private Job job;
    private Cashier cashier;

    public Person(String firstName, int age, Job job, Cashier cashier) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
        this.cashier = cashier;
    }

    public static void main(String[] args) {

        Cashier cashier = new Cashier("obsługa", 2000);
        cashier.displayResponsibilities();

    }
}
