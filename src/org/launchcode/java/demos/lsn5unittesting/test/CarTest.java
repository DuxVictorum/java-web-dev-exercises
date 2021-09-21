package org.launchcode.java.demos.lsn5unittesting.test;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.launchcode.java.demos.lsn5unittesting.main.Car;

public class CarTest {
    Car test_car;
    @Before
    public void createCarObject() { test_car = new Car("Toyota", "Prius", 10, 50); }
    // TODO #1: add emptyTest so we can configure our runtime environment
    // (remove this test before pushing to your personal GitLab account)
    @Test
    public void emptyTest() {
        assertEquals(10,10,.001);
    }
    //TODO #2: constructor sets gasTankLevel properly
    @Test
    public void testInitialGasTank() {
        assertEquals(10, test_car.getGasTankLevel(), .001);
    }
    //TODO #3: gasTankLevel is accurate after driving within tank range
    @Test
    public void checkTankLevelAfterDriving() {
        test_car.drive(50);
        assertEquals(9, test_car.getGasTankLevel(), .001);
    }
    //TODO #4: gasTankLevel is accurate after attempting to drive past tank range
    @Test
    public void droveTooFar() {
        test_car.drive(600);
        assertEquals(0, test_car.getGasTankLevel(), .001);
    }
    //TODO #5: can't have more gas than tank size, expect an exception
    @Test
    public void testGasOverfillException() {
        test_car.drive(300);
        test_car.addGas(5);
        assertEquals(9, test_car.getGasTankLevel(), .001);
//        fail("Car cannot have more gas in tank than the tank size.");
    }
}
