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

    public static String[] getStringArrayDataFromUser() {
        System.out.print("How many strings do you want to enter?: ");
        int numOfNums = scanner.nextInt(); //

        String[] words = new String[numOfNums]; // Use the number to create an array

        for (int i = 0; i < words.length; i++) {
            System.out.print("Enter a string: ");
            words[i] = scanner.next();
        }

        return words;
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

    // 30 mins break
    // Create a method to find the smallest number from a series of numbers entered by a user without using
    // any min methods defined by Default in Java.

    public static int getSmallest() {
        int[] numbers = getArrayDataFromUser(); // retrieve data from the user

        int smallest = numbers[0]; // initialize it to the first element to use as the basis for comparison.

        for(int i = 0; i < numbers.length; i++) {
            if (smallest > numbers[i]) { // if the current value is bigger than our current smallest
                smallest = numbers[i]; // set that value as the new smallest
            }
        }

        return smallest;
    }

    // 30 min
    // Create a method to count the number of vowels in a String entered by the user and returns that number

    public static int getVowelCount() {
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine(); // Get input from user

        //Initialize Vowel counter to 0
        int vowelCount = 0;

        // Break the user string into characters
        char[] userStringArr = userInput.toLowerCase().toCharArray(); // convert the letters to lower case first before
        // you break it into an array.

        for(int i = 0; i < userStringArr.length; i++) {
            char currentChar = userStringArr[i];

            // Check if the current char is a vowel, if so increment the vowel counter
            switch (currentChar) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vowelCount++;
                    break;
            }
        }

        return vowelCount;
    }

    // 40 mins
    // Write 2 methods:
    // - that accepts a series of strings from the user and returns it as a string array
    // - Returns the average length from an array of strings passed into it.

    public static float getAverageLength() {
        String[] words = getStringArrayDataFromUser();

        // initialize a sum variable
        float sum = 0;

        for(String word : words) {
            sum += word.length(); // repeatedly add each string's length to the array
        }

        return sum / words.length; // return the average
    }

    // 30 mins
    // Write a method to search through a series of strings entered by the user
    // and return true or a similar output if the string 'pancake' is found in the array.

    public static boolean getPancake() {
        String[] words = getStringArrayDataFromUser(); // retrieve data from user

        for (String word : words) { // loop through users data
            if (word.equalsIgnoreCase("pancake")) {
                // check if the word equals 'pancake'
                return true;
            }
        }

        // if it gets here then the word wasn't found.
        return false;
    }
}
