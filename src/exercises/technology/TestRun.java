package exercises.technology;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class TestRun {

    SmartPhone testPhone;
    @Before
    public void createPhoneObject() {
        testPhone = new SmartPhone("Biffy Spiffy", 7.9, 160, "iOS");
    }

    @Test
    public void testCallLog() {
        testPhone.turnOn();
        boolean x = testPhone.getPhoneOn();
        assertEquals(true, x);
    }
    @Test
    public void testCallNum() {
        testPhone.turnOn();
        testPhone.makeCall("636-579-3938", "Yo, whazzup?");
        String msg = testPhone.getCallLog().get("636-579-3938");
        assertEquals("Yo, whazzup?", msg);
    }
    @Test
    public void testMaxStorage() {
        assertEquals(160, testPhone.getMaxStorageGB(), .001);
    }

}
