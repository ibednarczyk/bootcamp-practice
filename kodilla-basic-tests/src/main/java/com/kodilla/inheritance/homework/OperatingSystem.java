package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int manufactureYear;

    public OperatingSystem(int manufactureYear){
        this.manufactureYear = manufactureYear;

    }

    public void turnOn(){
        System.out.println("Turn on the system");

    }

    public void turnOff(){
        System.out.println("Turn off the system");
    }

    public int getManufactureYear() {
        return manufactureYear;
    }
    public void displayManufactureYear(){
        System.out.println("Rok wydania systemu operacyjnego: "+ manufactureYear);
    }
}


