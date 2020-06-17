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

        Parallelepiped par2 = AbstractFactoryParallelepiped.create(6,5,5);
        System.out.println(par2);

        // Student
        Student student = new Student("Moskaliuk",
                "Ivanna",
                "Yurivna",
                22,
                "bachelor",
                "Male",
                false,
                380_934_342_024L,
                "Semudybu",
                "KNUTE",
                "FIT",
                Speciality.DIGITAL_ECONOMY,
                5,
                1,
                85,
                false,
                "Kurachenko",
                "Anna",
                "Ukrainian",
                MaritalStatus.UNMARRIED,
                true,
                "anime, Marvel",
                "Andrii",
                "Roskladka",
                "Analysis of the introductory campaign");
        System.out.println(student);


    }
}
