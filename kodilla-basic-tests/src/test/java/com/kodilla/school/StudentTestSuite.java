package com.kodilla.school;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTestSuite {

    @Test
    public void shouldCalculateCorrectAverage(){
        Student student = new Student("Tom");
        student.addPhysicsGrade(1);
        student.addPhysicsGrade(4);
        student.addPhysicsGrade(7);
        student.addMathGrade(2);
        student.addMathGrade(50);
        student.addMathGrade(6);
        student.addHistoryGrade(3);
        student.addHistoryGrade(199);
        student.addHistoryGrade(3);
        student.addGeographyGrade(4);
        student.addGeographyGrade(0);
        student.addGeographyGrade(3);
        assertEquals(2.5, student.getPhysicsAverage(), 0.1);
        assertEquals(4, student.getMathsAverage(), 0.01);
        assertEquals(3, student.getHistoryAverage(), 0.01);
        assertEquals(3.5, student.getGeographyAverage(), 0.01);

    }
}
