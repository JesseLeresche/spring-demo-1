package za.co.bootcamp.demo.animal;


import org.apache.derby.client.BasicClientDataSource;
import za.co.bootcamp.demo.zoo.Zoo;

public class AnimalRepo {
    private final BasicClientDataSource dataSource;

    public AnimalRepo() {
        // TODO: Inject this dependency rather
        dataSource = new BasicClientDataSource();
        dataSource.setDatabaseName("MyDatabase");
        dataSource.setUser("me");
        dataSource.setPassword("password");
    }

    public Animal findByName(String name) {
        System.out.println(String.format("Connecting to db with:\nDB name=%s\nuser=%s\npassword=%s",
                dataSource.getDatabaseName(), dataSource.getUser(), dataSource.getPassword()));
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
