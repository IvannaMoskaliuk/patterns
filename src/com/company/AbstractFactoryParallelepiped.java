/*
 * Classname AbstractFactoryParallelepiped
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

public class AbstractFactoryParallelepiped {

    /*
     * AbstractFactoryParallelepiped with parameters
     * @param lengthA int, set the Parallelepiped length A
     * @param widthB int, set the Parallelepiped width B
     * @param heigthC int, set the Parallelepiped heigth C
     */

    public static Parallelepiped create(int lengthA, int widthB, int heigthC){
        if ( lengthA == widthB && lengthA == heigthC && widthB == heigthC){
            return new Cube(lengthA);
        } else return new Parallelepiped(lengthA, widthB, heigthC);
    }
}
