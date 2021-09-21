package org.launchcode.java.demos.lsn6inheritance.test;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import org.launchcode.java.demos.lsn6inheritance.Cat;
import org.launchcode.java.demos.lsn6inheritance.HouseCat;

public class TestInheritance {

    HouseCat test_cat;

    @Before
    public void createTestCat() {
        test_cat = new HouseCat("Farfy", 11);
    }
    @Test
    public void testName() {
        assertEquals("Farfy", test_cat.getName());
    }
    @Test
    public void testWeightFromConstructor() {
        assertEquals(11, test_cat.getWeight(), .001);
    }
}
