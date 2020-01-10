package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

    private Display display;

    public Calculator(Display display) {
        this.display = display;
    }

    public double add(double a, double b){
        double sumValue = a+b;
        this.display.display(sumValue);

        return sumValue;
    }

    public double subtract(double a, double b){
        double subtractionValue = a-b;
        this.display.display(subtractionValue);

        return subtractionValue;
    }

    public double multiply(double a, double b){
        double multipliedValue = a*b;
        this.display.display(multipliedValue);

        return multipliedValue;
    }

    public double divide(double a, double b){
        double dividedValue = a/b;
        this.display.display(dividedValue);

        return dividedValue;
    }


}
