package io.zipcoder.pet;

import junit.framework.TestCase;
import org.junit.Test;

public class DragonTest extends TestCase {

    @Test
    public void testSpeak() {
        Dragon dragon = new Dragon();
        assertEquals("I am a dragon! Fear me!", dragon.speak());
    }

    public void testGetName() {
        Dragon dragon = new Dragon();
        dragon.setName("Heart");
        assertEquals("Heart", dragon.getName());
    }

    public void testSetName() {
        Dragon dragon = new Dragon();
        dragon.setName("Long");
        assertEquals("Long", dragon.getName());
    }
}