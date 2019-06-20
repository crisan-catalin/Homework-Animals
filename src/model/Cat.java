package model;

public class Cat extends Animal {
    private static final String SOUND = "MEOW";

    public Cat(String animalName) {
        super(animalName);
    }

    @Override
    public String callSound() {
        return SOUND;
    }
}
