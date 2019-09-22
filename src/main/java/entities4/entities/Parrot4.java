package entities4.entities;

import org.springframework.stereotype.Component;

@Component("parrot-kesha4")
public class Parrot4 {

    private String name = "Kesha4";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
