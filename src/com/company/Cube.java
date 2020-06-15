/*
 * Classname Cube
 *
 * @version 15/06/2020
 *
 * @author Moskaliuk Ivanna KNUTE
 *
 * Module 2 task 4
 *
 * Programming patterns. Factory, Builder.
    Develop for your class
    1. Factory.
    2. Abstract factory.
    3. Create a class Student  - 25 fields.
    4.  Create a builder for the class Student/
 */
package com.company;

public class Cube extends Parallelepiped {

    private int side;

    // Constructors

    public Cube(int side) {
        this.side = side;
    }

    public Cube(int lengthA, int widthB, int heightC, int side) {
        super(lengthA, widthB, heightC);
        this.side = side;
    }

    // Getters and Setters

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    // Method isCube

    public boolean isCube(){
        return ( this.getSide() == super.getLengthA() &&
                        this.getSide() == super.getWidthB() &&
                        this.getSide() == super.getHeightC() ? true : false);
    }

    // Override toString() method
    @Override
    public String toString() {
        return "Cube{" +
                "lengthA=" + super.getLengthA() +
                ", widthB=" + super.getWidthB() +
                ", heightC=" + super.getHeightC() +
                ", side=" + this.getSide() +
                '}';
    }
}
