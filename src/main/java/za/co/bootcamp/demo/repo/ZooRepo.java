package za.co.bootcamp.demo.repo;

import za.co.bootcamp.demo.model.Zoo;

public class ZooRepo {

    public ZooRepo() {
    }

    public Zoo findByName(String name) {
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
