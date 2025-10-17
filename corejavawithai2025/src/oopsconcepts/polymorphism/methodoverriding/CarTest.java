package oopsconcepts.polymorphism.methodoverriding;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.brandName("BMW"));

        FlyingCar flyingCar = new FlyingCar();
        System.out.println(flyingCar.brandName("SkyDrive Inc."));
    }
}
