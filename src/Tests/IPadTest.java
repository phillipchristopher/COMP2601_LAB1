import org.junit.Test;
import static org.junit.Assert.*;

public class IPadTest {

    @Test
    public void testUsesCase() {
        IPad iPad = new IPad(true, "iOS 15");
        assertTrue(iPad.usesCase());
    }

    @Test
    public void testSetHasCase() {
        IPad iPad = new IPad(true, "iOS 15");
        iPad.setHasCase(false);
        assertFalse(iPad.usesCase());
    }

    @Test
    public void testGetOsVersion() {
        IPad iPad = new IPad(true, "iOS 15");
        assertEquals("iOS 15", iPad.getOsVersion());
    }

    @Test
    public void testSetOsVersion() {
        IPad iPad = new IPad(true, "iOS 15");
        iPad.setOsVersion("iPadOS 15");
        assertEquals("iPadOS 15", iPad.getOsVersion());
    }

    @Test
    public void testToString() {
        IPad iPad = new IPad(true, "iOS 15");
        assertEquals("Purpose: learning, Has Case: true, OS Version: iOS 15", iPad.toString());
    }

    @Test
    public void testEquals() {
        IPad iPad1 = new IPad(true, "iOS 15");
        IPad iPad2 = new IPad(true, "iOS 15");
        IPad iPad3 = new IPad(false, "iOS 14");

        assertTrue(iPad1.equals(iPad2));
        assertFalse(iPad1.equals(iPad3));
    }

    @Test
    public void testHashCode() {
        IPad iPad = new IPad(true, "iOS 15");
        assertEquals("iOS 15".hashCode(), iPad.hashCode());
    }
}
