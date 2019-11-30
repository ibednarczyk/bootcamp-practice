package com.kodilla.collections.interfaces;

public class InterfacesDemo {

    public static void main(String[] args) {

        Square square = new Square(10.0);
        showShapeDetails(square);

        Circle circle = new Circle(7.0);
        showShapeDetails(circle);

        Traingle traingle = new Traingle(6.0, 4.0, 7.211);
        showShapeDetails(traingle);


    }

    private static void showShapeDetails(Shape shape){
        System.out.println(shape.getPerimeter());
        System.out.println(shape.getArea());
    }

    private static void showCircleDetails(Circle circle) {
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());

    }

    private static void showTriangleDetails(Traingle traingle){
        System.out.println(traingle.getArea());
        System.out.println(traingle.getPerimeter());
    }



}

