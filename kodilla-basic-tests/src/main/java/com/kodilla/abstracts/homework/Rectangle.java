package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {

    public Rectangle(int side, int height) {
        super(side, height);
    }

    @Override
    public int getPerimeter() {
        return side*2 + height*2;
    }

    @Override
    public int getArea() {
        return side*height;
    }
}
