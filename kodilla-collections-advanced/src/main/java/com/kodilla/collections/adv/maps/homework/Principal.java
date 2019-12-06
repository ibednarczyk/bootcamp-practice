package com.kodilla.collections.adv.maps.homework;

import java.util.Objects;

public class Principal {
    private String name;
    private String school;

    public Principal(String name, String school) {
        this.name = name;
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public String getSchool() {
        return school;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Principal principal = (Principal) o;
        return Objects.equals(name, principal.name) &&
                Objects.equals(school, principal.school);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, school);
    }

    @Override
    public String toString() {
        return "Principal{" +
                "name='" + name + '\'' +
                ", school='" + school + '\'' +
                '}';
    }
}
