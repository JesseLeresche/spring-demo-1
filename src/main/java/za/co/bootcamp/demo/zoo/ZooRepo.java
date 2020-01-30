package za.co.bootcamp.demo.zoo;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import org.springframework.stereotype.Component;

@Component
public class ZooRepo {
    private final SQLServerDataSource dataSource;

    public ZooRepo(SQLServerDataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Zoo findByName(String name) {
        System.out.println(String.format("Connecting to db with:\nDB name=%s\nuser=%s",
                dataSource.getDatabaseName(), dataSource.getUser()));
        System.out.println("Getting zoo with name = " + name);

        // Does a bunch of stuff we don't really care about right now.
        // We're hard-coding for now, but imagine we're fetching it from a DB.
        Zoo zoo = new Zoo();
        zoo.setAddress("1st Street, Joburg");
        zoo.setName(name);
        zoo.setWebSiteAddress("joburgzoo.co.za");
        return zoo;
    }
}
