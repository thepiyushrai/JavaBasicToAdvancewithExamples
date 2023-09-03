package com.example.java.methodoverloading;

/**
 * @author Piyush Rai
 * @date 03/09/23
 * @time 10:46 am
 */
public class ShapeCalculator {

    // Calculate the area of a circle
    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Calculate the area of a rectangle
    public double calculateArea(double length, double width) {
        return length * width;
    }

    // Calculate the area of a triangle
    public double calculateArea(double base, double height, String shape) {
        if ("triangle".equalsIgnoreCase(shape)) {
            return 0.5 * base * height;
        } else {
            throw new IllegalArgumentException("Unsupported shape: " + shape);
        }
    }

    // Calculate the perimeter of a rectangle
    public double calculatePerimeter(double length, double width) {
        return 2 * (length + width);
    }

    // Calculate the circumference of a circle
    public double calculatePerimeter(double radius, String shape) {
        if ("circle".equalsIgnoreCase(shape)) {
            return 2 * Math.PI * radius;
        } else {
            throw new IllegalArgumentException("Unsupported shape: " + shape);
        }
    }

    public static void main(String[] args) {
        ShapeCalculator calculator = new ShapeCalculator();

        // Calculate areas
        System.out.println("Area of a circle: " + calculator.calculateArea(3.0));
        System.out.println("Area of a rectangle: " + calculator.calculateArea(4.0, 5.0));
        System.out.println("Area of a triangle: " + calculator.calculateArea(4.0, 3.0, "triangle"));

        // Calculate perimeters
        System.out.println("Perimeter of a rectangle: " + calculator.calculatePerimeter(4.0, 5.0));
        System.out.println("Perimeter of a circle: " + calculator.calculatePerimeter(3.0, "circle"));
    }
}
