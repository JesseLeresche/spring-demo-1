package za.co.bootcamp.demo.animal;

import za.co.bootcamp.demo.zoo.Zoo;
import za.co.bootcamp.demo.zoo.ZooRepo;

public class AnimalService {
    private final AnimalRepo animalRepo;

    public AnimalService() {
        // TODO: Inject this dependency rather
        this.animalRepo = new AnimalRepo();
    }

    public Animal findAnimalByName(String name) {
        return animalRepo.findByName(name);
    }


}
