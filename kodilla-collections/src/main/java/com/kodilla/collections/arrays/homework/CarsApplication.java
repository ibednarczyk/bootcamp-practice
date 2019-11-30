package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Mercedes;
import com.kodilla.collections.interfaces.homework.Porsche;
import com.kodilla.collections.interfaces.homework.Volvo;

import java.util.Random;

public class CarsApplication {

    public static void main(String[] args) {
        Random random = new Random();
        Car[] cars = new Car[random.nextInt(16)];
        for (int i=0; i<cars.length; i++){
            cars[i] = drawCar();
        }
        for (Car car: cars)
            CarUtils.describeCar(car);
    }


    public static Car drawCar() {

        Random random = new Random();
        int choseCarBrand = random.nextInt(3);
        int speed = random.nextInt(250);
        if (choseCarBrand == 0)
            return new Porsche(speed);
        else if (choseCarBrand == 1)
            return new Volvo(speed);
        else
            return new Mercedes(speed);

    }
}
