package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult =calculator.addNumbers(a,b);
        boolean correct = ResultChecker.assertEquals(13, sumResult);
        if (correct){
            System.out.println("Metoda addNumbers działa poprawnie dla liczb " + a + " i " +b);
        } else {
            System.out.println("Metoda addNumbers nie działa poprawnie dla liczb: " + a + " i "+b);
        }

        int subtractResult = calculator.subtractNumbers(a,b);
        boolean correctSubtract = ResultChecker.assertEquals(-3, subtractResult);
        if (correctSubtract){
            System.out.println("Metoda subtractNumbers działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda subtractNumbers nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int squareResult = calculator.squareNumbers(a);
        boolean correctSquare = ResultChecker.assertEquals(25, squareResult);
        if (correctSquare){
            System.out.println("Metoda squareNumbers działa poprawnie dla liczby " + a);
        } else  {
            System.out.println("Metoda squareNumbers nie działa poprawnie dla liczby " + a);
        }



    }
}
