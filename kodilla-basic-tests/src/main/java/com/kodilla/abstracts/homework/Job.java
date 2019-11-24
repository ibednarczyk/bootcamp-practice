package com.kodilla.abstracts.homework;

public abstract class Job {
    String responsibilities;
    int salary;

    public Job (String responsibilities, int salary) {
        this.responsibilities = responsibilities;
        this.salary = salary;

    }

    public abstract void displayResponsibilities();

}
