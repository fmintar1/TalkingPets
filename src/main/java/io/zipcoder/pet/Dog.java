package io.zipcoder.pet;

public class Dog extends Pet {

    public Dog() {

    }

    public String speak() {
        return "I am a dog!";
    }

    public String getName() {
        return super.getName();
    }

    public void setName(String name) {
        super.name = name;
    }
}
