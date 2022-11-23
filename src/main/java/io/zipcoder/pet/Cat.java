package io.zipcoder.pet;

public class Cat extends Pet {

    public Cat() {

    }

    public String speak() {
        return "I am a cat!";
    }

    public String getName() {
        return super.getName();
    }

    public void setName(String name) {
        super.setName(name);

    }
}
