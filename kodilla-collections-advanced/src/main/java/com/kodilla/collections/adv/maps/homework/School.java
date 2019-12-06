package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {

    List<Integer> students = new ArrayList<>();

    public School(int... students){
        for (int student: students)
            this.students.add(student);

    }

    public int getSumOfStudents(){
        int sum =0;
        for (int student:students) {
            sum +=student;

        } return sum;
    }
    
}
