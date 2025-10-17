package oopsconcepts.abstraction;

public class Elephant implements Animal {
    @Override
    public String name() {
        return "Elephant";
    }

    @Override
    public String eatingHabit() {
        return "Vegetarian";
    }

    @Override
    public String category(String livingEnvironment) {
        String category = "";
        switch (livingEnvironment){
            case "forest":
                category = "Wild";
                break;
            case "circus":
                category = "Trained";
                break;
            case "urban":
                category = "Pet";
                break;
            default:
                category = "Undefined Category!";
        }
        return category;
    }
}
