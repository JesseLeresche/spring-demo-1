package za.co.bootcamp.demo.animal;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import org.springframework.stereotype.Component;

@Component
public class AnimalRepo {
    private final SQLServerDataSource dataSource;

    public AnimalRepo(SQLServerDataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Animal findByName(String name) {
        System.out.println(String.format("Connecting to db with:\nDB name=%s\nuser=%s",
                dataSource.getDatabaseName(), dataSource.getUser()));
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
