package mivlgy.pin120;

import org.springframework.stereotype.Component;

@Component
public class Ensemble {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;}
}
