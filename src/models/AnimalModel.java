package models;

public abstract class AnimalModel {

    private String animalName;
    private String animalSound;

    public AnimalModel(String animalName, String animalSound) {
        this.animalName = animalName;
        this.animalSound = animalSound;
    }

    @Override
    public String toString() {
        return animalName + " makes " + animalSound + " and is a" + this.getClass().getSimpleName().toUpperCase();
    }
}
