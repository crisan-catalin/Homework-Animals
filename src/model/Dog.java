package model;

public class Dog extends Animal {
    private static final String SOUND = "RUPH";

    public Dog(String animalName) {
        super(animalName);
    }

    @Override
    public String callSound() {
        return SOUND;
    }
}
