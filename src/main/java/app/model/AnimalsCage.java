package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {
    @Autowired
    @Qualifier("dog")
    private Animal animal;
//    public void setAnimal(@Qualifier("dog") Animal animal) {
//        this.animal = animal;
//    }


    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(new Timer().getTime());
        System.out.println("________________________");
    }
    @Autowired
    @Qualifier("timer")
    public Timer getTimer() {
        return new Timer();
    }
}
