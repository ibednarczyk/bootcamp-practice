package com.kodilla.parametrized_tests.homework;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class GamblingMachineTestSuite {
    private GamblingMachine machine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = {"/gamblingMachineData.csv"})
    public void shouldThrowExceptionWhenAmountOfPassingNumbersIsDifferentThanSix(int one, int two, int three, int four, int five) {
        Set<Integer> input = new HashSet<>();
        input.add(one);
        input.add(two);
        input.add(three);
        input.add(four);
        input.add(five);
        assertThrows(InvalidNumbersException.class, () -> {
            machine.howManyWins(input);
        });
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/gamblingMachineData2.csv"})
    public void shouldThrowExceptionWhenPassingDuplicateNumbers(int one, int two, int three, int four, int five, int six) {
        Set<Integer> input = new HashSet<>();
        input.add(one);
        input.add(two);
        input.add(three);
        input.add(four);
        input.add(five);
        input.add(six);
        assertThrows(InvalidNumbersException.class, () -> {
            machine.howManyWins(input);
        });
    }
    @ParameterizedTest
    @CsvFileSource(resources = {"/gamblingMachineData3.csv"})
    public void shouldThrowExceptionWhenPassingNegativeNumbers(int one, int two, int three, int four, int five, int six) {
        Set<Integer> input = new HashSet<>();
        input.add(one);
        input.add(two);
        input.add(three);
        input.add(four);
        input.add(five);
        input.add(six);
        assertThrows(InvalidNumbersException.class, () -> {
            machine.howManyWins(input);
        });
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/gamblingMachineData4.csv"})
    public void shouldThrowExceptionWhenPassingZero(int one, int two, int three, int four, int five, int six) {
        Set<Integer> input = new HashSet<>();
        input.add(one);
        input.add(two);
        input.add(three);
        input.add(four);
        input.add(five);
        input.add(six);
        assertThrows(InvalidNumbersException.class, () -> {
            machine.howManyWins(input);
        });
    }
}


