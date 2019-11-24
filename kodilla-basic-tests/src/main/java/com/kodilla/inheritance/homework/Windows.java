package com.kodilla.inheritance.homework;

public class Windows extends OperatingSystem {

    public Windows(int manufactureYear) {
        super(manufactureYear);
        System.out.println(manufactureYear);
    }
    public void showWindow(){
        System.out.println("Show window on the screen");

    }
    @Override
    public void turnOn(){
        System.out.println("Turn on the Windows system");

    }

}
