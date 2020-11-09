package app.model;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component("dog")
public class Dog extends Animal {
    @Override
    public String toString() {
        return "Im а Dog";
    }
}
