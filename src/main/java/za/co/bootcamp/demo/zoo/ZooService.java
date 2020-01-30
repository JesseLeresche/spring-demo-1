package za.co.bootcamp.demo.zoo;

public class ZooService {
    private final ZooRepo zooRepo;

    public ZooService() {
        // TODO: Inject this dependency rather
        this.zooRepo = new ZooRepo();
    }

    public Zoo findZooByName(String name) {
        return zooRepo.findByName(name);
    }


}
