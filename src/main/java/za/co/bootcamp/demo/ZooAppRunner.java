package za.co.bootcamp.demo;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import za.co.bootcamp.demo.animal.Animal;
import za.co.bootcamp.demo.animal.AnimalService;
import za.co.bootcamp.demo.zoo.Zoo;
import za.co.bootcamp.demo.zoo.ZooService;

@Component
public class ZooAppRunner implements ApplicationRunner {

    private final ZooService zooService;
    private final AnimalService animalService;

    public ZooAppRunner() {
        // TODO: Inject this dependency rather
        this.zooService = new ZooService();
        this.animalService = new AnimalService();
    }

    @Override
    public void run(ApplicationArguments args) {
        Zoo myZoo = zooService.findZooByName("Joburg Zoo");
        System.out.println(myZoo);
        Animal animal = animalService.findAnimalByName("Simba");
        System.out.println(animal);
    }
}
