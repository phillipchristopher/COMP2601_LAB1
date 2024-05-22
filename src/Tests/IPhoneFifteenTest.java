import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class IPhoneFifteenTest {

    @Test
    public void testConstructorAndGetters() {
        IPhoneFifteen iPhone = new IPhoneFifteen(500.0, "Verizon", true, 128);
        assertEquals(500.0, iPhone.getMinutesRemaining(), 0.001);
        assertEquals("Verizon", iPhone.getCarrier());
        assertTrue(iPhone.hasHighResCamera());
        assertEquals(128, iPhone.getMemoryGb());
    }

    @Test
    public void testSetters() {
        IPhoneFifteen iPhone = new IPhoneFifteen(500.0, "Verizon", true, 128);
        iPhone.setHighResCamera(false);
        iPhone.setMemoryGb(256);
        assertFalse(iPhone.hasHighResCamera());
        assertEquals(256, iPhone.getMemoryGb());
    }

    @Test
    public void testToString() {
        IPhoneFifteen iPhone = new IPhoneFifteen(500.0, "Verizon", true, 128);
        String expected = "Purpose: talking, Minutes Remaining: 500.0, Carrier: Verizon, High-Resolution Camera: true, Memory: 128GB";
        assertEquals(expected, iPhone.toString());
    }

    @Test
    public void testEquals() {
        IPhoneFifteen iPhone1 = new IPhoneFifteen(500.0, "Verizon", true, 128);
        IPhoneFifteen iPhone2 = new IPhoneFifteen(500.0, "Verizon", true, 256);
        IPhoneFifteen iPhone3 = new IPhoneFifteen(500.0, "Verizon", false, 128);
        IPhoneFifteen iPhone4 = new IPhoneFifteen(600.0, "Verizon", true, 128);

        assertEquals(iPhone1, iPhone2);
        assertNotEquals(iPhone1, iPhone3);
        assertNotEquals(iPhone1, iPhone4);
    }

    @Test
    public void testHashCode() {
        IPhoneFifteen iPhone1 = new IPhoneFifteen(500.0, "Verizon", true, 128);
        IPhoneFifteen iPhone2 = new IPhoneFifteen(500.0, "Verizon", true, 256);
        IPhoneFifteen iPhone3 = new IPhoneFifteen(500.0, "Verizon", false, 128);

        assertEquals(iPhone1.hashCode(), iPhone2.hashCode());
        assertNotEquals(iPhone1.hashCode(), iPhone3.hashCode());
    }

    @Test
    public void testPrintDetails() {
        IPhoneFifteen iPhone = new IPhoneFifteen(500.0, "Verizon", true, 128);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        iPhone.printDetails();

        String expectedOutput = "Purpose: talking, Minutes Remaining: 500.0, Carrier: Verizon, High-Resolution Camera: true, Memory: 128GB";
        assertEquals(expectedOutput, outContent.toString().trim());

        System.setOut(System.out); // Reset System.out to its original
    }
}
