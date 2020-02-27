package com.kodilla.abstracts;

import com.kodilla.abstracts.homework.Rectangle;
import com.kodilla.abstracts.homework.Shape;
import com.kodilla.abstracts.homework.Square;
import com.kodilla.abstracts.homework.Triangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShapesTestSuite {


    @Test
    public void shouldCalculateArea(){
        Shape shape = new Square(7, 7);
        Shape shape1 = new Rectangle(8, 7);
        Shape shape2 = new Triangle(5, 10);
        Assertions.assertEquals(49, shape.getArea());
        Assertions.assertEquals(56, shape1.getArea());
        Assertions.assertEquals(25, shape2.getArea());


    }
}
