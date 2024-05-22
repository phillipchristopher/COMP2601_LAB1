/**
 * IPad class to model an iPad device with specific properties, which is a subclass of IDevice.
 *
 * @author Chris Helmhold, Emma Lee
 * @version 1.0
 */
public class IPad extends IDevice {
    private boolean hasCase;
    private String  osVersion;

    private static final String IPAD_PURPOSE = "learning";

    /**
     * Constructor for an iPad object.
     *
     * @param hasCase   Parameter to define whether the iPad has a case or not.
     * @param osVersion the operating system (OS) version of the iPad
     */
    public IPad(final boolean hasCase,
                final String osVersion) {
        super(IPAD_PURPOSE);
        this.hasCase   = hasCase;
        this.osVersion = osVersion;
    }

    /**
     * Returns whether the iPad has a case.
     *
     * @return true if the iPad has a case, false otherwise
     */
    public boolean usesCase() {
        return hasCase;
    }

    /**
     * Setter for if the iPad has a case or not.
     *
     * @param hasCase true if the iPad has a case, false otherwise
     */
    public void setHasCase(final boolean hasCase) {
        this.hasCase = hasCase;
    }

    /**
     * Getter for the operating system version of the iPad.
     *
     * @return the operating system (OS) version of the iPad
     */
    public String getOsVersion() {
        return osVersion;
    }

    /**
     * Setter for the operating system version of the iPad
     *
     * @param osVersion the operating system version to set
     */
    public void setOsVersion(final String osVersion) {
        this.osVersion = osVersion;
    }

    /**
     * Prints the details of the IPad object.
     */
    @Override
    public void printDetails() {
        System.out.println(this.toString());
    }

    /**
     * Returns a String representation of the IPad object with its properties.
     *
     * @return a String representation of the IPad object
     */
    @Override
    public String toString() {
        return super.toString() +
                ", Has Case: " +
                hasCase +
                ", OS Version: " +
                osVersion;
    }

    /**
     * Shows if an object is equal to this object.
     * Note: IPad objects that have the same OS version are equal.
     *
     * @param o the reference to compare
     * @return true if the object is equal to the object argument passed in, false otherwise.
     */
    @Override
    public boolean equals(final Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        final IPad iPad = (IPad) o;

        return osVersion.equals(iPad.osVersion);
    }

    /**
     * Returns a hash code value for the object.
     *
     * @return a hash code value for this object
     */
    @Override
    public int hashCode() {
        return osVersion.hashCode();
    }
}
