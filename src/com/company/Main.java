package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    // A class is a blueprint for creating objects
    // The object itself is created at the point where you instantiate the
    // class -> Bird bird = new Bird(); -> Bird Object

    // public and private are examples of access modifiers

    // loops
    // for loop - best suited for situations where I have a definite number of times it should run
    // while loop - best suited for situations where I don't have a definite number of times it should run

    // Break vs Continue
    // Break stops the execution entirely or in other words terminates
    // the loop while Continue skips an iteration

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

    // A ternary operator is a conditional operator that's typically a single-liner.
    // 5 == 6 ? "true" : false
    // The use cases for a ternary operator are:
    // - when you're returning something
    // - you're saving a value to a variable based on a condition.

    // - one-line comment - cmd + / (mac), ctrl + / (windows)
    /* multi-line comment - cmd + options + / (mac), ctrl + shift + / (windows)*/


    /**
     * Documentation comment
     * @param args
     */
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

//        for (int i = 1; i < 10; i++) {
//            if (i == 5) {
//                continue;
//            }
//            System.out.println(i);
//        }

        /* Exercies Execution */

//        System.out.println(Exercises.getNumberOfEven());
//        System.out.println("The smallest number is: " + Exercises.getSmallest());

//        System.out.println("The number of vowels is: " + Exercises.getVowelCount());
//        System.out.println("The average length of the words is: " + Exercises.getAverageLength());
//        System.out.println(Exercises.getPancake() ? "Pancake found" : "Pancake not found");

//        System.out.println("The perimeter of the rectangle is: " + Exercises.getRectanglePerimeter());
//        System.out.println("The reverse of the string is: " + Exercises.getReverse());

        Exercises exercises = new Exercises();
        exercises.getAverageLength();


        Exercises exercises1 = new Exercises();


//        System.out.println("The percentage of Odd numbers is: " + Exercises.getPercentageOdd() + "%");

//        System.out.println("The difference is: " + Exercises.getDifference());
    }

}
