import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class IPodTest {

    @Test
    public void testConstructorAndGetters() {
        IPod iPod = new IPod(1000, 85.0);
        assertEquals(1000, iPod.getNumSongs());
        assertEquals(85.0, iPod.getMaxVolumeDbs(), 0.001);
        assertEquals("music", iPod.getPurpose());
    }

    @Test
    public void testSetters() {
        IPod iPod = new IPod(1000, 85.0);
        iPod.setNumberOfSongs(2000);
        iPod.setMaxVolume(90.0);
        assertEquals(2000, iPod.getNumSongs());
        assertEquals(90.0, iPod.getMaxVolumeDbs(), 0.001);
    }

    @Test
    public void testToString() {
        IPod iPod = new IPod(1000, 85.0);
        String expected = "Purpose: music, Number of Songs: 1000, Max Volume: 85.0";
        assertEquals(expected, iPod.toString());
    }

    @Test
    public void testEquals() {
        IPod iPod1 = new IPod(1000, 85.0);
        IPod iPod2 = new IPod(1000, 90.0);
        IPod iPod3 = new IPod(2000, 85.0);

        assertEquals(iPod1, iPod2);
        assertNotEquals(iPod1, iPod3);
    }

    @Test
    public void testHashCode() {
        IPod iPod1 = new IPod(1000, 85.0);
        IPod iPod2 = new IPod(1000, 90.0);
        IPod iPod3 = new IPod(2000, 85.0);

        assertEquals(iPod1.hashCode(), iPod2.hashCode());
        assertNotEquals(iPod1.hashCode(), iPod3.hashCode());
    }

    @Test
    public void testPrintDetails() {
        IPod iPod = new IPod(1000, 85.0);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        iPod.printDetails();

        String expectedOutput = "Purpose: music, Number of Songs: 1000, Max Volume: 85.0";
        assertEquals(expectedOutput, outContent.toString().trim());

        System.setOut(System.out); // Reset System.out to its original
    }
}
