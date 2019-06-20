package model;

public class Snake extends Animal {
    private static final String SOUND = "SSS";

    public Snake(String animalName) {
        super(animalName);
    }

    @Override
    public String callSound() {
        return SOUND;
    }
}
