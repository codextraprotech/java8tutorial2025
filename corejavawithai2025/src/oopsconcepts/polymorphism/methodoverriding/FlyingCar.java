package oopsconcepts.polymorphism.methodoverriding;

public class FlyingCar extends Car{

    @Override
    public String brandName(String brandName){
        return "Flying Car Brand Name: "+brandName;
    }
}
