package io.zipcoder.pet;

import junit.framework.TestCase;
import org.junit.Test;

public class CatTest extends TestCase {

    @Test
    public void testSpeak() {
        Cat cat = new Cat();
        assertEquals("I am a cat!", cat.speak());
    }

    public void testGetName() {
        Cat cat = new Cat();
        cat.setName("Pussy");
        assertEquals("Pussy", cat.getName());
    }

    public void testSetName() {
        Cat cat = new Cat();
        cat.setName("Tom");
        assertEquals("Tom", cat.getName());
    }
}