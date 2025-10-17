package oopsconcepts.abstraction;

public class Lion implements Animal{
    @Override
    public String name() {
        return "Lion";
    }

    @Override
    public String eatingHabit() {
        return "Non Vegetarian";
    }

    @Override
    public String category(String livingEnvironment) {
        return livingEnvironment.equalsIgnoreCase("forest") ? "Wild" : "Zoo";
    }
}
