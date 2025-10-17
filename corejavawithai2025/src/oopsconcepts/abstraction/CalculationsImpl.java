package oopsconcepts.abstraction;

public class CalculationsImpl extends Calculations {
    @Override
    public double power(double a, double b) {
        return Math.pow(a, b);
    }

    @Override
    public double divide(double a, double b) {
        return a/b;
    }
}
