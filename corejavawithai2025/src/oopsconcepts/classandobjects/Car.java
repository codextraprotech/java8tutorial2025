package oopsconcepts.classandobjects;

// This is the class blueprint for Car
public class Car {
    // Data members (attributes of every Car object)
    String model; // Example: "Toyota"
    String color; // Example: "Red"
    int year;     // Example: 2022

    // Constructor: Used when creating a Car object, sets initial values
    Car(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    // Method: Behavior/action every Car object can perform
    void displayDetails() {
        System.out.println("Car Model: " + model);
        System.out.println("Car Color: " + color);
        System.out.println("Car Year: " + year);
    }
}

