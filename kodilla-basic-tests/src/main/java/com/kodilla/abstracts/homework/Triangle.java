package com.kodilla.abstracts.homework;

public class Triangle extends Shape {

    public Triangle(int side, int height) {
        super(side, height);
    }

    @Override
    public int getPerimeter() {
        return side*3;
    }

    @Override
    public int getArea() {
        return side*height/2;
    }
}
