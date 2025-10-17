package oopsconcepts.polymorphism.methodoverloading;

public class Addition {
    public int add(int a, int b){
        System.out.println("2 args, datatype int:");
        return a+b;
    }

    public int add(int a, int b, int c){
        System.out.println("3 args, datatype int:");
        return a+b+c;
    }

    public double add (double a, double b){
        System.out.println("2 args, datatype double:");
        return a+b;
    }
}
