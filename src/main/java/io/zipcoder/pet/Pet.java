package io.zipcoder.pet;

public abstract class Pet {
    String name;

    public abstract String speak();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
