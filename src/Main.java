import model.Animal;
import model.Cat;
import model.Dog;
import model.Snake;
import service.AnimalService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        final AnimalService animalService = new AnimalService();
        animalService.generateAnimals();
        animalService.displayAnimalsDetails();
    }


}
