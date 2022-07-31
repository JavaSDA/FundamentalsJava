package com.company;

public class Car {
    // Define properties
    private String brand;
    private String color;
    private int numOfSeats;

    public static int airbagPressure = 12000;

    // Define your constructor
    // Default constructor
    public Car() {

    }

    public Car(String brand, String color, int numOfSeats) {
        // Default constructor
        this.brand = brand;
        this.color = color;
        this.numOfSeats = numOfSeats;

    }

    // getters and setters
    public String getBrand() {
        return brand;
    }

//    public void setBrand(String brand) {
//        this.brand = brand;
//    }
      // getters and setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumOfSeats() {
        return numOfSeats;
    }

//    public void setNumOfSeats(int numOfSeats) {
//        this.numOfSeats = numOfSeats;
//    }
}
