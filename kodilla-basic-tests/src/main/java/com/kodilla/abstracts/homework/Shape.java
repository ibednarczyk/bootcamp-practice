package com.kodilla.abstracts.homework;

public abstract class Shape {
    int side;
    int height;


    public Shape (int side, int height){
        this.side = side;
        this.height = height;

    }

    public abstract int getPerimeter();

    public abstract int getArea();

}



