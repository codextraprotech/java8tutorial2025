package oopsconcepts.abstraction;

public abstract class Calculations {
    public int add(int a, int b){
        return a+b;
    }

    public int subtract(int a, int b){
        return a-b;
    }

    public int multiply(int a, int b){
        return a*b;
    }

    public abstract double power(double a, double b);
    public abstract double divide(double a, double b);
}
