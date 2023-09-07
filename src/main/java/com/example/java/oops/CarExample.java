package com.example.java.oops;

/**
 * @author Piyush Rai
 * @date 08/09/23
 * @time 1:11 am
 */
// Change the class name to 'CarExample' to match the file name
public class CarExample {
    public static void main(String[] args) {
        // Create two instances (objects) of the Car class
        Car car1 = new Car("Toyota", "Camry");
        Car car2 = new Car("Honda", "Civic");

        // Access and display information about the cars
        car1.displayInfo();
        car2.displayInfo();
    }
}

