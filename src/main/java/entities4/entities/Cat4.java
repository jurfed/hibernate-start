package entities4.entities;

import org.springframework.stereotype.Component;

@Component
public class Cat4 {
    private String name = "puppy4";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
