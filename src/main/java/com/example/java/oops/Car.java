package com.example.java.oops;

/**
 * @author Piyush Rai
 * @date 08/09/23
 * @time 1:09 am
 */
// Define a class called Car
class Car {
    String make;
    String model;

    // Constructor
    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    // Method to display car information
    public void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
    }
}


