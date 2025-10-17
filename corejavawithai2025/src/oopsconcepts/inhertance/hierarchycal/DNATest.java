package oopsconcepts.inhertance.hierarchycal;

public class DNATest {
    public static void main(String[] args) {
        Son son = new Son();
        son.gender();
        son.paternalDNA();

        Daughter daughter = new Daughter();
        daughter.gender();
        daughter.paternalDNA();

        Father father = new Father();
        father.paternalDNA();
    }
}
