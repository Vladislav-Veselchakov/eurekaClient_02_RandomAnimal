package VLRnd.controllers;

import VLRnd.model.Animal;
import VLRnd.AnimalDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RandomAnimalController {

    private final AnimalDao animalDao;

    @Autowired
    public RandomAnimalController(AnimalDao animalDao){
        this.animalDao=animalDao;
    }

    @GetMapping("/random")
    public Animal randomAnimal(){
        return animalDao.random();
    }
}