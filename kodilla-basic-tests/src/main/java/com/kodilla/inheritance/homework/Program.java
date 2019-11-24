package com.kodilla.inheritance.homework;

public class Program {

    public static void main (String[] arg){

        OperatingSystem system = new OperatingSystem(1956);
        system.turnOn();

        Windows windows= new Windows(1985);
        windows.turnOff();
        System.out.println(windows.getManufactureYear());
        windows.displayManufactureYear();

        Linux linux = new Linux(1991);
        System.out.println(linux.getManufactureYear());
        linux.displayManufactureYear();




    }
}
