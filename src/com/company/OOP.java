package com.company;

import java.awt.Color;

public class OOP {
    // Variables and methods - start with small letter camelCasing e.g timerSettings
    // Classes and Objects - start with Capital letter camelCasing e.g TimerSettings
    // OOP - Object Oriented Programming.
    // An Object is an item that exists and has properties and behaviours that can be perceived.
    // A class ia blueprint for creating an object.
    // A constructor's job is to create or INSTANTIATE your object. (i.e creating an instance of a class/object)
    // A FIELD is used to represent the PROPERTIES of an object.
    // A METHOD is used to represent the BEHAVIOUR of an object.


    public static void main(String[] args) {
        Car mercedes = new Car("MERCEDES", "BLUE", 4);
        mercedes.setColor("BLACK");


        Car bmw = new Car("BMW", "RED", 2);
//        bmw.setColor(Color.BLACK.toString());


        Car tesla = new Car("TESLA", "RED", 4);
//        tesla.setColor(Color.BLACK.toString());

        System.out.println(mercedes.getColor());
        System.out.println(bmw.getColor());
        System.out.println(tesla.getColor());

        System.out.println(Car.airbagPressure);

    }
}
