package com.company;

import java.util.Scanner;

public class Exercises {


    // 20 mins
    // Create a method that takes a series of input from the user and
    // returns the number of even numbers that were entered by the user.

    private static Scanner scanner = new Scanner(System.in); // Field

    public static int[] getArrayDataFromUser() {
        System.out.print("How many numbers do you want to enter?: ");
        int numOfNums = scanner.nextInt(); //

        int[] numbers = new int[numOfNums]; // Use the number to create an array

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter a number: ");
            numbers[i] = scanner.nextInt();
        }

        return numbers;
    }

    public static int getNumberOfEven() {
        int[] numbers = getArrayDataFromUser(); // get data from the user
        int evenCounter = 0; // Initialize even counter

        for (int i = 0; i < numbers.length; i++) { // Loop through to filter the even numbers out.
            if (numbers[i] % 2 == 0) evenCounter++; // if the current number is divisible by 2, then increase
            // the evenCounter;
        }

        return evenCounter;
    }

//    public static int

    // 30 mins + 10 mins break
    // Create a method to find the smallest number from a series of numbers entered by a user without using
    // any min methods defined by Default in Java.

}
