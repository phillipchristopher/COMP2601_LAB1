import org.junit.Test;
import static org.junit.Assert.*;

public class IPhoneTest {

    @Test
    public void testGetMinutesRemaining() {
        IPhone iPhone = new IPhone(100, "AT&T");
        assertEquals(100, iPhone.getMinutesRemaining(), 0);
    }

    @Test
    public void testSetMinutesRemaining() {
        IPhone iPhone = new IPhone(100, "AT&T");
        iPhone.setMinutesRemaining(50);
        assertEquals(50, iPhone.getMinutesRemaining(), 0);
    }

    @Test
    public void testGetCarrier() {
        IPhone iPhone = new IPhone(100, "AT&T");
        assertEquals("AT&T", iPhone.getCarrier());
    }

    @Test
    public void testSetCarrier() {
        IPhone iPhone = new IPhone(100, "AT&T");
        iPhone.setCarrier("Verizon");
        assertEquals("Verizon", iPhone.getCarrier());
    }

    @Test
    public void testToString() {
        IPhone iPhone = new IPhone(100, "AT&T");
        assertEquals("Purpose: talking, Minutes Remaining: 100.0, Carrier: AT&T", iPhone.toString());
    }

    @Test
    public void testEquals() {
        IPhone iPhone1 = new IPhone(100, "AT&T");
        IPhone iPhone2 = new IPhone(100, "Verizon");
        IPhone iPhone3 = new IPhone(50, "AT&T");

        assertTrue(iPhone1.equals(iPhone2));
        assertFalse(iPhone1.equals(iPhone3));
    }

    @Test
    public void testHashCode() {
        IPhone iPhone = new IPhone(100, "AT&T");
        assertEquals(Double.hashCode(100), iPhone.hashCode());
    }
}
