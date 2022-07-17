package com.company;

import java.util.Arrays;
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

    // Main method is the primary entry point to a java program.

    // A method is simply a behavioural description of a class.

    // Post and pre incrementation and decrementation
    // i++/i-- - post - equal to i = i + 1
    // ++i/--i - pre - same as post

    // Method overloading is a way to write multiple methods to do the same or similar things
    // using the same name but a different method signature.


    public static void main(String[] args) {
	// write your code here
/*        Scanner scanner = new Scanner(System.in);

        // Prompt the user for data
        System.out.print("Enter your name: ");
        String name = scanner.next();

        System.out.println(name);*/

        /*int[] nums = {4, 3, 8, 9};
        int[] result = new int[nums.length];




        for(int i = 0; i < nums.length; i++) {
            nums[i] = ++nums[i];
        }
        System.out.println(Arrays.toString(nums));*/

        /* Exercies Execution */

//        System.out.println(Exercises.getNumberOfEven());
//        System.out.println("The smallest number is: " + Exercises.getSmallest());

//        System.out.println("The number of vowels is: " + Exercises.getVowelCount());
        System.out.println("The average length of the words is: " + Exercises.getAverageLength());
    }

}
