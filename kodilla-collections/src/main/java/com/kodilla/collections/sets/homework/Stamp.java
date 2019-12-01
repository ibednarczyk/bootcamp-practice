package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String stampName;
    private double length;
    private double width;
    private boolean stamped;

    public Stamp(String stampName, double length, double width, boolean stamped) {
        this.stampName = stampName;
        this.length = length;
        this.width = width;
        this.stamped = stamped;
    }

    public String getStampName() {
        return stampName;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public boolean isStamped() {
        return stamped;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(stamp.length, length) == 0 &&
                Double.compare(stamp.width, width) == 0 &&
                stamped == stamp.stamped &&
                Objects.equals(stampName, stamp.stampName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stampName, length, width, stamped);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampName='" + stampName + '\'' +
                ", length=" + length +
                ", width=" + width +
                ", stamped=" + stamped +
                '}';
    }
}



