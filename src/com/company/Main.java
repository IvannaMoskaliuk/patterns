/*
 * Classname Main
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

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello, patterns!");

        // Parallelepiped Factory

        Parallelepiped par1 = ParallelepipedFactory.create(4, 7, 5);
        System.out.println(par1);

        //Abstract Parallelepiped Factory

        Parallelepiped par2 = AbstractFactoryParallelepiped.create(5,5,5);
        System.out.println(par2);

        // Student


    }
}
