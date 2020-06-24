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
                "Female",
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
                "Marvel",
                "Andrii",
                "Roskladka",
                "Analysis of the introductory campaign");
        System.out.println(student);

        // new Student Builder

        Student Dmytriy = new Student.Builder()
                .setLastName("Oleynyk")
                .setFirstName("Dmitriy")
                .setPatronimic("Oleksandrovych")
                .setAge(21)
                .setEducation("bachelor")
                .setGender("Male")
                .setIsMilitary(false)
                .setPhoneNumber(380_938_666_645L)
                .setHomeAdress("Bila Tserkva")
                .setUniversity("KNUTE")
                .setFaculty("FIT")
                .setSpeciality(Speciality.DIGITAL_ECONOMY)
                .setCourse(5)
                .setGroup(5)
                .setAverageScore(75)
                .setIsScholarship(false)
                .setLastNameGroupCaptain("Kurachenko")
                .setFirstNameGroupCaptain("Anna")
                .setNationality("Ukrainian")
                .setMaritalStatus(MaritalStatus.UNMARRIED)
                .setIsDriver(true)
                .setHobby("anime")
                .setLastNameTeacher("Roskladka")
                .setFirstNameTeaсher("Andrii")
                .setDiplomaTopic("Analitics in firms")
                .build();

        System.out.println(Dmytriy);

        // new Student similar to Dmitriy

        Student Andrii = new Student.Builder()
                .setSimilarTo(Dmytriy)
                .setLastName("Veremienko")
                .setFirstName("Andrii")
                .setAverageScore(82)
                .setSpeciality(Speciality.COMPUTER_SCIENCE)
                .setHomeAdress("Kyiv")
                .build();

        System.out.println(Andrii);

    }
}
