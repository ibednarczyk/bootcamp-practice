package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    public static List<Flight> getFlightsTable(){
        List<Flight> flightsRepository = new ArrayList<>();
        flightsRepository.add(new Flight("Warsaw", "Barcelona"));
        flightsRepository.add(new Flight("Vienna", "Lisbon"));
        flightsRepository.add(new Flight("Berlin", "Tokyo"));

        return flightsRepository;
    }








}
