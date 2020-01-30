package za.co.bootcamp.demo.animal;

import org.springframework.stereotype.Component;

@Component
public class AnimalService {
    private final AnimalRepo animalRepo;

    public AnimalService(AnimalRepo animalRepo) {
        this.animalRepo = animalRepo;
    }

    public Animal findAnimalByName(String name) {
        return animalRepo.findByName(name);
    }
}
