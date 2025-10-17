package oopsconcepts.polymorphism.methodoverloading;

public class OverloadingTest {
    public static void main(String[] args) {
        Addition addition = new Addition();
        System.out.println(addition.add(3,5));
        System.out.println(addition.add(6,9, 7));
        System.out.println(addition.add(5.4, 2.9));
    }
}
