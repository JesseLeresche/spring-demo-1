package za.co.bootcamp.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import za.co.bootcamp.demo.model.Animal;
import za.co.bootcamp.demo.repo.AnimalRepo;
import za.co.bootcamp.demo.service.AnimalService;
import za.co.bootcamp.demo.model.Zoo;
import za.co.bootcamp.demo.repo.ZooRepo;
import za.co.bootcamp.demo.service.ZooService;

@Component
public class ZooAppRunner implements CommandLineRunner {

    Logger logger = LoggerFactory.getLogger(ZooAppRunner.class);

    private final ZooService zooService;
    private final AnimalService animalService;
    private String datasourceUrl;
    private String username;
    private String password;

    public ZooAppRunner() {
        ZooRepo zooRepo = new ZooRepo();
        this.zooService = new ZooService(zooRepo);
        AnimalRepo animalRepo = new AnimalRepo();
        this.animalService = new AnimalService(animalRepo);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("Connecting to database {}, username {}, password {}", datasourceUrl, username, password);
        Zoo myZoo = zooService.findZooByName("Joburg Zoo");
        logger.info("Found zoo {}", myZoo);
        Animal animal = animalService.findAnimalByName("Simba");
        logger.info("Found animal {}", animal);
    }
}
