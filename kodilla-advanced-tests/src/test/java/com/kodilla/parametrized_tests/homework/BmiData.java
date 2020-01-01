package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class BmiData {

    static Stream<Arguments> providedDataForTestingBmi(){
        return Stream.of(
                Arguments.of(1.75, 43.0, "Very severely underweight"),
                Arguments.of(1.75, 47.0, "Severely underweight"),
                Arguments.of(1.75,56.5, "Underweight"),
                Arguments.of(1.75,68.0, "Normal (healthy weight)"),
                Arguments.of(1.75,81.0, "Overweight"),
                Arguments.of(1.75, 100.0, "Obese Class I (Moderately obese)"),
                Arguments.of(1.55, 93.6, "Obese Class II (Severely obese)"),
                Arguments.of(1.60, 110.3, "Obese Class III (Very severely obese)"),
                Arguments.of(1.60, 125.0, "Obese Class IV (Morbidly Obese)"),
                Arguments.of(1.55, 140.0, "Obese Class V (Super Obese)"),
                Arguments.of(1.55, 155.0, "Obese Class VI (Hyper Obese)")
        );
    }
}
