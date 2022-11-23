package io.zipcoder.pet;

public class GenericPets <T extends Pet>{

    String name;
    String speak;

    public GenericPets(String name, String speak) {
        this.name = name;
        this.speak = speak;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setSpeak(String speak) {
        this.speak = speak;
    }

    public String getSpeak() {
        return this.speak;
    }

}
