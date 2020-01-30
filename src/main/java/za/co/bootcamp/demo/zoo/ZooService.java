package za.co.bootcamp.demo.zoo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ZooService {
    private final ZooRepo zooRepo;

    @Autowired
    public ZooService(ZooRepo zooRepo) {
        this.zooRepo = zooRepo;
    }

    public Zoo findZooByName(String name) {
        return zooRepo.findByName(name);
    }


}
