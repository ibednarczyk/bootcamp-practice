package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FlightFinderTestSuite {


    @Test
    public void testFindingFlightsFrom(){
        //given
        FlightFinder testDepartureFinder = new FlightFinder();
        //when
        List<Flight> resultDepartureList = testDepartureFinder.findFlightsFrom("Warsaw");
        //then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Warsaw", "Barcelona"));
        assertEquals(expectedList, resultDepartureList);

    }

    @Test
    public void testFindingFlightsTo(){
        //given
        FlightFinder testArrivalFinder = new FlightFinder();
        //when
        List<Flight> resultArrivalList = testArrivalFinder.findFlightsTo("Tokyo");
        //then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Berlin", "Tokyo"));
        assertEquals(expectedList,resultArrivalList);


    }

}