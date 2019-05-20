package models;

public abstract class AnimalModel {

    private String animalName;
    private String animalSound;

    public AnimalModel(String animalName, String animalSound) {
        this.animalName = animalName;
        this.animalSound = animalSound;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalSound() {
        return animalSound;
    }

    public void setAnimalSound(String animalSound) {
        this.animalSound = animalSound;
    }

    @Override
    public String toString() {
        return animalName + " makes " + animalName;
    }
}
