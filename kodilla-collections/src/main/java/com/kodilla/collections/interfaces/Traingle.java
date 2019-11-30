package com.kodilla.collections.interfaces;

public class Traingle implements Shape {
    double width;
    double height;
    double hypotenuse;

    public Traingle(double width, double height, double hypotenuse){
        this.height = height;
        this.width = width;
        this.hypotenuse = hypotenuse;
    }
    @Override
    public double getArea() {
        return width*height/2;
    }

    @Override
    public double getPerimeter() {
        return width+height+hypotenuse;
    }
}
