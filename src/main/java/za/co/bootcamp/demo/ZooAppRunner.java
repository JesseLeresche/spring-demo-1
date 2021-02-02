package za.co.bootcamp.demo;

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

    private final ZooService zooService;
    private final AnimalService animalService;

    public ZooAppRunner() {
        ZooRepo zooRepo = new ZooRepo();
        this.zooService = new ZooService(zooRepo);
        AnimalRepo animalRepo = new AnimalRepo();
        this.animalService = new AnimalService(animalRepo);
    }

    @Override
    public void run(String... args) throws Exception {
        Zoo myZoo = zooService.findZooByName("Joburg Zoo");
        System.out.println(myZoo);
        Animal animal = animalService.findAnimalByName("Simba");
        System.out.println(animal);
    }
}
