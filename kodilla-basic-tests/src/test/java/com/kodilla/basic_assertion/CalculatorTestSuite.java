package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Test
    public void shouldAddNumbers() {
        Calculator calculator = new Calculator();
        int result = calculator.addNumbers(5, 8);
        assertEquals(13, result );
    }

    @Test
    public void shouldSubtractNumbers(){
        Calculator calculator = new Calculator();
        int result = calculator.subtractNumbers(5, 8);
        assertEquals(-3, result);
    }

    @Test
    public void shouldSquareNumbers(){
        Calculator calculator = new Calculator();
        int result = calculator.squareNumbers(5);
        assertEquals(25, result);
    }



}
