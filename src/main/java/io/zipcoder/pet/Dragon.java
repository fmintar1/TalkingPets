package io.zipcoder.pet;

public class Dragon extends Pet {

    public Dragon() {

    }

    public String speak() {
        return "I am a dragon! Fear me!";
    }

    public String getName() {
        return super.getName();
    }

    public void setName(String name) {
        super.setName(name);
    }
}
