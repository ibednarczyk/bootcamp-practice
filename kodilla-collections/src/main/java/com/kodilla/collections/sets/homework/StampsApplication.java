package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {


        Set<Stamp> stamps= new HashSet<>();
        stamps.add(new Stamp("Stamp1", 2.0, 2.0, true));
        stamps.add(new Stamp("Stamp2", 3.5, 2.5, false));
        stamps.add(new Stamp("Stamp2", 3.5, 2.5, false));
        stamps.add(new Stamp("Stamp3", 1.5, 1.5, false));
        stamps.add(new Stamp("Stamp4", 4.0, 3.0, true));

        System.out.println(stamps.size());
        for (Stamp stamp: stamps)
            System.out.println(stamp);

    }
}
