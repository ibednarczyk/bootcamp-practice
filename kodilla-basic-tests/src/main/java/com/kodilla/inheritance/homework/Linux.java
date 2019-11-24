package com.kodilla.inheritance.homework;

public class Linux extends OperatingSystem {
    public Linux(int manufactureYear) {
        super(manufactureYear);
        System.out.println(manufactureYear);

    }

    @Override
    public void turnOff(){
        System.out.println("Turn off the Linux system");
    }
}
