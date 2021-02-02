package za.co.bootcamp.demo.service;

import za.co.bootcamp.demo.model.Animal;
import za.co.bootcamp.demo.repo.AnimalRepo;

public class AnimalService {
    private final AnimalRepo animalRepo;

    public AnimalService(AnimalRepo animalRepo) {
        this.animalRepo = animalRepo;
    }

    public Animal findAnimalByName(String name) {
        return animalRepo.findByName(name);
    }
}
