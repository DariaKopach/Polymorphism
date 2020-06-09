/*
 *
 * Classname Parallelogram
 *
 * Version from 08.06.2020
 *
 * Copyright Kopach Daria KNTEU
 *
 */

package com.company;

import java.util.Objects;

public class Parallelogram implements IGeometry, IPackaging {

    private int smallSide;
    private int bigSide;
    private double angle;

    // 1. Constructor:
    // a) generate an empty constructor

    public Parallelogram() {
    }

    // b) generate the constructor

    public Parallelogram(int smallSide, int bigSide, double angle) {
        this.smallSide = smallSide;
        this.bigSide = bigSide;
        angle = angle;
    }

    // 2. Generate getters and setters

    public int getSmallSide() {
        return smallSide;
    }

    public void setSmallSide(int smallSide) {
        this.smallSide = smallSide;
    }

    public int getBigSide() {
        return bigSide;
    }

    public void setBigSide(int bigSide) {
        this.bigSide = bigSide;
    }

    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        angle = angle;
    }

    // Override toString() method

    @Override
    public String toString() {
        return "Parallelogram { " +
                "smallSide = " + this.getSmallSide() +
                ", bigSide = " + this.getBigSide() +
                ", Angle = " + this.getAngle() +
                ", Linear Length = " + this.getLinearLength() +
                ", Area = " + this.getArea() +
                '}';
    }

    //  Implement toJSON() method in Parallelogram class

    @Override
    public String toJSON() {
        String json = "Parallelogram {"
                + "\""  + "bigSide\": " + this.getBigSide()
                + ", "
                + "\""  + "smallSide\": " + this.getSmallSide()
                + ", "
                + "\""  + "angle\": " + this.getAngle()
                + ", "
                + "\""  + "linearLength\": " + this.getLinearLength()
                + ", "
                + "\""  + "area\": " + this.getArea()
                + "}";
        return json;
    }

    //  Implement toXML() method in Parallelogram class

    @Override
    public String toXML() {
        String xml = "<Parallelogram>"
                + "<bigSide>" + this.getBigSide() + "</bigSide>"
                + "<smallSide>" + this.getSmallSide() + "</smallSide>"
                + "<angle>" + this.getAngle() + "</angle>"
                + "<linearLength>" + this.getLinearLength() + "</linearLength>"
                + "<area>" + this.getArea() + "</area>"
                +  "</Parallelogram>";
        return xml;
    }

    // Implement toConsole() method in Parallelogram class

    @Override
    public String toConsole() {
        return "Parallelogram {" + "\n" +
                "Big Side = " + this.getBigSide() + "," + "\n" +
                "Small Side = " + this.getSmallSide() + "," + "\n" +
                "Angle = " + this.getAngle() + "," + "\n" +
                "Linear Length = " + this.getLinearLength() + "," + "\n" +
                "Area = " + this.getArea() +
                '}';
    }

    // 5. Override hash() and equals() methods.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parallelogram that = (Parallelogram) o;
        return smallSide == that.smallSide &&
                bigSide == that.bigSide &&
                Double.compare(that.angle, angle) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(smallSide, bigSide, angle);
    }

    @Override
    public double getLinearLength() {
        return 2 * (this.getSmallSide() + this.getBigSide());
    }

    @Override
    public double getArea() {
        return this.getSmallSide() * this.getBigSide() * Math.sin(this.getAngle());
    }
}
