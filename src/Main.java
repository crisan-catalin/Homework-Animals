import models.AnimalModel;
import models.Cat;
import models.Dog;
import models.Snake;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    private static final String DOG = "DOG";
    private static final String CAT = "CAT";
    private static final String SNAKE = "SNAKE";
    private static final String DOG_SOUND = "Ruff";
    private static final String CAT_SOUND = "Meow";
    private static final String SNAKE_SOUND = "Sss";

    public static void main(String[] args) {
        List<AnimalModel> animals = generateAnimals();
        for (AnimalModel animal : animals) {
            System.out.println(animal.toString());
        }
    }

    private static List<AnimalModel> generateAnimals() {
        List<AnimalModel> animalsList = new ArrayList<>();

        Dog chihuahua = new Dog(DOG, DOG_SOUND);
        Dog labrador = new Dog(DOG, DOG_SOUND);
        Dog husky = new Dog(DOG, DOG_SOUND);
        Cat british = new Cat(CAT, CAT_SOUND);
        Cat sfinx = new Cat(CAT, CAT_SOUND);
        Cat cornish = new Cat(CAT, CAT_SOUND);
        Snake anaconda = new Snake(SNAKE, SNAKE_SOUND);
        Snake python = new Snake(SNAKE, SNAKE_SOUND);

        animalsList.add(chihuahua);
        animalsList.add(labrador);
        animalsList.add(husky);
        animalsList.add(british);
        animalsList.add(sfinx);
        animalsList.add(cornish);
        animalsList.add(anaconda);
        animalsList.add(python);

        Collections.shuffle(animalsList);

        return animalsList;
    }
}
