package za.co.bootcamp.demo.repo;

import za.co.bootcamp.demo.model.Animal;

public class AnimalRepo {

    public AnimalRepo() {

    }

    public Animal findByName(String name) {
        System.out.println("Getting animal with name = " + name);

        // Does a bunch of stuff we don't really care about right now.
        // We're hard-coding for now, but imagine we're fetching it from a DB.
        Animal animal = new Animal();
        animal.setName(name);
        animal.setFamily("Feline");
        animal.setSpecies("Lion");
        return animal;
    }
}
