package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Mercedes;
import com.kodilla.collections.interfaces.homework.Porsche;
import com.kodilla.collections.interfaces.homework.Volvo;

public class CarUtils {

    public static void describeCar(Car car){
        System.out.println("Car brand: " + getCarBrand(car));
        System.out.println("Car speed: " + car.getSpeed());
        System.out.println("......................");
    }

    public static String getCarBrand (Car car){
        if (car instanceof Porsche)
            return "Porsche";
        else if (car instanceof Volvo)
            return "Volvo";
        else if (car instanceof Mercedes)
            return  "Mercedes";
        else
            return "Unknown car brand.";
    }


}
