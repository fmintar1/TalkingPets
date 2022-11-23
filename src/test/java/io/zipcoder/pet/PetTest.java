package io.zipcoder.pet;

import junit.framework.TestCase;
import org.junit.Test;

public class PetTest extends TestCase {
    Pet pet = new Pet() {
        @Override
        public String speak() {
            return "What pet am I?";
        }
    };

    @Test
    public void testSpeak() {

        String expected = pet.speak();
        assertEquals("What pet am I?", pet.speak());
    }

    public void testGetName() {
        pet.setName("PEET");
        assertEquals("PEET", pet.getName());
    }

    public void testSetName() {
        pet.setName("TEEP");
        assertEquals("TEEP",pet.getName());
    }
}