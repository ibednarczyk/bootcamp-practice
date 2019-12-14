package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Mark", new Teacher("Thomson")));
        students.add(new Student("Julia", null));
        students.add(new Student("Pablo", new Teacher("Alex")));
        students.add(new Student("Kate", null));

        for(Student student : students){
            Teacher teacher = student.getTeacher();
            Optional<Teacher> optionalTeacher= Optional.ofNullable(teacher);
            String teacherName = optionalTeacher.orElse(new Teacher("<undefined>")).getName();
            String studentName = student.getName();
            System.out.println("Student: "+ studentName + ", teacher: " + teacherName);

        }





    }
}
