package com.company;

import com.company.helpertest.Test;
import java.util.Scanner;

public class Main {

    // A class is a blueprint for creating objects
    // The object itself is created at the point where you instantiate the
    // class -> Bird bird = new Bird(); -> Bird Object

    // public and private are examples of access modifiers

    // instance vs static
    // For your instance methods or fields, you can only interact with them if you're working
    // with an object instantiated using the class

    // But if the method or field is static, that means that only one instance of that method or field
    // exists and it is attached directly to the Object class.

    // You can't refer to a non-static method or field from a static context.

    // Package
    // A package is a unique way of identifying the exact class being spoken about.

    public static void main(String[] args) {
	// write your code here
/*        Scanner scanner = new Scanner(System.in);

        // Prompt the user for data
        System.out.print("Enter your name: ");
        String name = scanner.next();

        System.out.println(name);*/

        System.out.println("The number of even numbers is: " + Exercises.getNumberOfEven());
    }

    public void getNothing() {
        Test testObject = new Test();
        testObject.getSomething(); // instance method in use


        Test.getSomethingElse(); // static method in use.


    }
}
