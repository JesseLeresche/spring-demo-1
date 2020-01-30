package za.co.bootcamp.demo.zoo;


import org.apache.derby.client.BasicClientDataSource;

public class ZooRepo {
    private final BasicClientDataSource dataSource;

    public ZooRepo() {
        // TODO: Inject this dependency rather
        dataSource = new BasicClientDataSource();
        dataSource.setDatabaseName("MyDatabase");
        dataSource.setUser("me");
        dataSource.setPassword("password");
    }

    public Zoo findByName(String name) {
        System.out.println(String.format("Connecting to db with:\nDB name=%s\nuser=%s\npassword=%s",
                dataSource.getDatabaseName(), dataSource.getUser(), dataSource.getPassword()));
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
