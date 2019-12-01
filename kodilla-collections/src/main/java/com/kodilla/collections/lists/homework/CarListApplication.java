package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Mercedes;

import java.util.ArrayList;
import java.util.List;

import static com.kodilla.collections.arrays.homework.CarUtils.describeCar;

public class CarListApplication {
    public static void main(String[] args) {
        List<Mercedes> cars = new ArrayList<>();
        cars.add(new Mercedes(150));
        cars.add(new Mercedes(200));
        cars.add(new Mercedes(50));
        cars.add(new Mercedes(80));

        cars.remove(2);
        cars.remove(new Mercedes(150));

        for (Mercedes mercedes : cars) {
            CarUtils.describeCar(mercedes);
        }
        System.out.println("Cars' collection size: " + cars.size());
    }


}
