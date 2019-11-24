package com.kodilla.abstracts.homework;

public class Square extends Shape {

    public Square(int side, int height) {
        super(side, height);
    }

    @Override
    public int getPerimeter() {
        return side*4;
    }

    @Override
    public int getArea() {
        return side*side;
    }
}

