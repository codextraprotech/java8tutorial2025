package oopsconcepts.classandobjects;

// CarOwner class to test Car class
public class CarOwner {
    public static void main(String[] args) {
        // Creating objects (instances) of Car using the class blueprint
        Car car1 = new Car("Toyota", "Red", 2022); // car1 is a unique object
        Car car2 = new Car("Honda", "Blue", 2020); // car2 is another unique object

        // Calling methods on the objects
        car1.displayDetails();
        car2.displayDetails();
    }
}
