package za.co.bootcamp.demo.service;

import za.co.bootcamp.demo.model.Zoo;
import za.co.bootcamp.demo.repo.ZooRepo;

public class ZooService {
    private final ZooRepo zooRepo;

    public ZooService(ZooRepo zooRepo) {
        this.zooRepo = zooRepo;
    }

    public Zoo findZooByName(String name) {
        return zooRepo.findByName(name);
    }


}
