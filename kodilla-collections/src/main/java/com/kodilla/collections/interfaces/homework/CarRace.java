package com.kodilla.collections.interfaces.homework;

public class CarRace {


    public static void main(String[] args) {

        Mercedes mercedes = new Mercedes(100);
        doRace(mercedes);

        Porsche porsche = new Porsche(100);
        doRace(porsche);

        Volvo volvo = new Volvo(100);
        doRace(volvo);
    }

    private static void doRace(Car car){

        for (int i = 0; i<3; i++){
            car.increaseSpeed();

        }
        for (int i =0; i<2; i++){
            car.decreaseSpeed();
        }
        System.out.println(car.getSpeed());
    }




}
