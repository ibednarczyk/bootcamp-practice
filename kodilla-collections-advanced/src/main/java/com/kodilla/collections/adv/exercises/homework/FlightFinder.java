package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightFinder {

    public List<Flight> findFlightsFrom(String departure){
        List<Flight> resultDeparture = new ArrayList<>();
        for(Flight flight : FlightRepository.getFlightsTable()){
            if (flight.getDeparture().equals(departure)) {
                resultDeparture.add(flight);
            }
        }
        return resultDeparture;
    }

    public List<Flight> findFlightsTo(String arrival){
        List<Flight> resultArrival = new ArrayList<>();
        for (Flight flight : FlightRepository.getFlightsTable()){
            if(flight.getArrival().equals(arrival)){
                resultArrival.add(flight);
            }
        }
        return resultArrival;
    }
}
