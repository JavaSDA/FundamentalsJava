package com.company;

import java.util.Scanner;

public class Exercises {


    // 20 mins
    // Create a method that takes a series of input from the user and
    // returns the number of even numbers that were entered by the user.

    private static Scanner scanner = new Scanner(System.in); // Field

    public static int[] getArrayDataFromUser() {
        // Prompt the user for input
//        System.out.print("How many numbers do you want to enter?: ");
//        int numOfNums = scanner.nextInt(); // number of integers / length of the array

        int[] numbers = new int[3]; // Use the number to create an array

        // Use a loop to populate the array with the user's input
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter three numbers: ");
            numbers[i] = scanner.nextInt();
        }

        // return the array
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

    public float getAverageLength() {
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



    // Write a method to return the percentage of odd numbers present in a dataset
    // entered by the user.

    // Get Input from the user - Scanner
    // Store the numbers somewhere - Array
    // I need to count the number of odd integers(numbers) - for Loop
    // Find out percentage of odd numbers
    // return the value

    public static float getPercentageOdd() {

        // Retrieve data from the user
        int[] numbers = getArrayDataFromUser();

        float oddCount = 0; // Initialize oddCount to 0 to sum up the number of oddNumbers

        for (int number : numbers) {
            if (number % 2 != 0) { // Check for odd numbers
                oddCount++; // Increase odd count by 1
            }
        }

        // (value / total) * 100 - Percentage
        float percent = (oddCount / numbers.length) * 100;

        // return the value
        return percent;

    }

    // 35 mins
    // Write a method that takes the length and width of a rectangle
    // from the user and finds and returns the perimeter

    // Get the values of the length and width from the user
    // find the perimeter of the rectangle, formula = 2(l+w)
    // return the perimeter

    public static int getRectanglePerimeter() {
        // Get the values of the length and width from the user

        // Prompt the user for length
        System.out.print("Enter the length of the rectangle: ");
        int length = scanner.nextInt();

        // Prompt the user for breadth/width
        System.out.print("Enter the width of the rectangle: ");
        int breadth = scanner.nextInt();

        // find the perimeter of the rectangle, formula = 2(l+w)
        int perimeter = 2 * (length + breadth);

        // return the perimeter
        return perimeter;
    }


    // 35 mins
    // Write a program that takes a word or a string from the user
    // and returns its reverse

    public static String getReverse() {
        // get Input from the user

        //Prompt the user
        System.out.print("Enter a string: ");
        String word = scanner.next();

        // Initialize string to hold reverse
        String reverse = "";

        // Break string down into an array of characters
        char[] wordArray = word.toCharArray();

        for (int i = wordArray.length - 1; i > -1; i--) {
            // append the characters to the reverse string in reverse order
            reverse += wordArray[i];
        }

        return reverse;
    }

    // 35 mins.
    // Write a method to return 3rd smallest numb
    // er from a set of 5 numbers entered
    // by the user. N.B: Do not use Arrays.sort()

    // Get data from the user
    // Store in an array
    // sort the array
    // Get the third item in the array
    // return it.

    // [9, 4, 9, 5]
    public static int getThirdSmallest() {
        int[] numbers =  getArrayDataFromUser();

        int temp;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        return numbers[2];
    }

    // 35 mins
    // Write a method to find the area of a circle with the radius received from a user.

    // 35 mins
    // Write a method that takes a set of 3 numbers from the user and returns true if
    // the addition of all three numbers is less than 100, else it returns false.

    public static boolean isSmallerThanHundred() {
        // Get input from the user
        int[] numbers = getArrayDataFromUser();

        // Find the sum
        // Initialize sum variable to 0
        int sum = 0;

        // loop through the array and find the sum of the numbers
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        if (sum > 100) return false;

        return true;
    }

}
