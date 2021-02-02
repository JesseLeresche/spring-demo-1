package za.co.bootcamp.demo.animal;

import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
public class AnimalRepo {
    private final DataSource dataSource;

    public AnimalRepo(DataSource dataSource) {
        this.dataSource = dataSource;
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
