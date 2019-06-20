package service;

import model.Animal;
import model.Cat;
import model.Dog;
import model.Snake;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AnimalService {
    private List<Animal> animals;

    public AnimalService() {
        animals = new ArrayList<>();
    }

    public void generateAnimals() {
        Dog chihuahua = new Dog("Snoop");
        Dog labrador = new Dog("Rex");
        Dog husky = new Dog("Nino");
        Cat british = new Cat("Felix");
        Cat sfinx = new Cat("Queen");
        Cat cornish = new Cat("John");
        Snake anaconda = new Snake("Angy");

        animals.add(chihuahua);
        animals.add(labrador);
        animals.add(husky);
        animals.add(british);
        animals.add(sfinx);
        animals.add(cornish);
        animals.add(anaconda);

        Collections.shuffle(animals);
    }

    public void displayAnimalsDetails() {
        for (Animal animal : animals) {
            System.out.println(animal.getName() + " is " + animal.getClass().getSimpleName().toUpperCase() + " and makes " + animal.callSound());
        }
    }
}
