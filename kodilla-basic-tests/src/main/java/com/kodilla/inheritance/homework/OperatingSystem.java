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

    public static class Windows extends OperatingSystem {


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

    public static class Linux extends OperatingSystem{

        public Linux (int manufactureYear){
            super(manufactureYear);

        }
        @Override
        public void turnOff(){
            System.out.println("Turn off the Linux system");
        }

    }
}


