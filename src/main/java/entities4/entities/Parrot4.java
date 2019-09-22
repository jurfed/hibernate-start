package entities4.entities;

import org.springframework.stereotype.Component;

@Component("parrot-kesha")
public class Parrot4 {

    private String name = "Kesha";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
