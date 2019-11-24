package com.kodilla.abstracts.homework;

public class Application {

    public static void main(String[] args) {

        Square square = new Square(6, 6);
        square.getPerimeter();
        square.getArea();
        System.out.println("Obwód kwadratu wynosi: " + square.getPerimeter());
        System.out.println("Pole kwadratu wynosi: " + square.getArea());


        Triangle triangle = new Triangle(3,5);
        triangle.getPerimeter();
        triangle.getArea();
        System.out.println("Obwód trójkąta równobocznego wynosi: " + triangle.getPerimeter());
        System.out.println("Pole trójkąta równobocznego wynosi: " + triangle.getArea());

        Rectangle rectangle = new Rectangle(4, 7);
        rectangle.getPerimeter();
        rectangle.getPerimeter();
        System.out.println("Obwód prostokąta wynosi: " + rectangle.getPerimeter());
        System.out.println("Pole prostokąta wynosi: " + rectangle.getArea());




    }
}
