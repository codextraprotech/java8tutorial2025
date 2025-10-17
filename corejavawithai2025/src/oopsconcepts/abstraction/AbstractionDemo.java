package oopsconcepts.abstraction;

public class AbstractionDemo {
    public static void main(String[] args) {
        // Partial Abstraction with abstract class
        Calculations calculations = new CalculationsImpl();
        System.out.println(calculations.add(2,3));
        System.out.println(calculations.subtract(7,3));
        System.out.println(calculations.multiply(3,8));
        System.out.println(calculations.divide(5,2));
        System.out.println(calculations.power(3,2));

        //Complete/Absolute abstraction using interfaces
        Animal animal1 = new Lion();
        System.out.println("Animal: "+animal1.name());
        System.out.println(animal1.eatingHabit());
        System.out.println(animal1.category("forest"));

        Animal animal2 = new Elephant();
        System.out.println("Animal: "+animal2.name());
        System.out.println(animal2.eatingHabit());
        System.out.println(animal2.category("circus"));
    }
}
