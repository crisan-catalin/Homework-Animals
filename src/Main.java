import models.AnimalModel;
import models.Cat;
import models.Dog;
import models.Snake;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<AnimalModel> animals = generateAnimals();
        for (AnimalModel animal : animals) {
            System.out.println(animal.toString());
        }
    }

    private static List<AnimalModel> generateAnimals() {
        List<AnimalModel> animalsList = new ArrayList<>();

        Dog chihuahua = new Dog("Snoop", "Whatzuup");
        Dog labrador = new Dog("Rex", "Ruff ruff");
        Dog husky = new Dog("Nino", "Awooo");
        Cat british = new Cat("Felix", "Meow");
        Cat sfinx = new Cat("Queen", "Purrrr");
        Cat cornish = new Cat("John", "MEOW!");
        Snake anaconda = new Snake("Angy", "Sssss");

        animalsList.add(chihuahua);
        animalsList.add(labrador);
        animalsList.add(husky);
        animalsList.add(british);
        animalsList.add(sfinx);
        animalsList.add(cornish);
        animalsList.add(anaconda);

        Collections.shuffle(animalsList);

        return animalsList;
    }
}
