package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {

        Map<Principal, School> education = new HashMap<>();
        Principal ernest = new Principal("Ernest Weisser", "Technical school");
        Principal amanda = new Principal("Amanda Black", "Central school");
        Principal chester = new Principal("Chester Charlie", "School of fine Arts");
        Principal vanessa = new Principal("Vanessa Green", "University of sociology");

        School technicalSchoolStudents = new School(1,1,1,1,1,1,1);
        School centralSchoolStudents = new School(1,1,1,1,1,1,1,1,1);
        School schoolOfFineArtsStudents = new School(1,1,1);
        School universityOfSociologyStudents = new School(1,1,1,1,1,1,1,1,1,1,1);

        education.put(ernest, technicalSchoolStudents);
        education.put(amanda, centralSchoolStudents);
        education.put(chester, schoolOfFineArtsStudents);
        education.put(vanessa, universityOfSociologyStudents);


        for (Map.Entry<Principal, School> educationEntry: education.entrySet()) {
            System.out.println(educationEntry.getKey().getName() + " is a principal of "  + educationEntry.getKey().getSchool() + " which has " + educationEntry.getValue().getSumOfStudents() + " students.");


        }


    }
}

