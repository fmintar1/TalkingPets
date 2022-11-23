package io.zipcoder.pet;

import junit.framework.TestCase;
import org.junit.Test;

public class DogTest extends TestCase {

    @Test
    public void testSpeak() {
        Dog dog = new Dog();
        assertEquals("I am a dog!", dog.speak());
    }

    public void testGetName() {
        Dog dog = new Dog();
        dog.setName("Hound");
        assertEquals("Hound", dog.getName());
    }

    public void testSetName() {
        Dog dog = new Dog();
        dog.setName("Hot");
        assertEquals("Hot", dog.getName());
    }
}