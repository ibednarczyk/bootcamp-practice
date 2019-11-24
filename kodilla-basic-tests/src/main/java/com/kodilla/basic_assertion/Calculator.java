package com.kodilla.basic_assertion;

public class Calculator {
    int a;
    int b;

    public Calculator(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int addNumbers(int a, int b){
        return a + b;

    }

    public int subtractNumbers(int a, int b){
        return  a-b;

    }
    public int squareNumbers (int a){
        return a*a;

    }
}
