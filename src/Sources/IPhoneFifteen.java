/**
 * IPhoneFifteen class to model an iPhone 15 device with specific properties, which is a subclass of IPhone.
 *
 * @author Chris Helmhold, Emma Lee
 * @version 1.0
 */
public class IPhoneFifteen extends IPhone {
    private final boolean highResCamera;
    private final int     memoryGb;

    private static final int HASHCODE_INTEGER = 97;

    /**
     * Constructor for an IPhoneFifteen object.
     *
     * @param minsRemaining Minutes remaining in phone plan
     * @param carrier       Phone carrier company
     * @param highResCamera Whether the IPhoneFifteen has a High Resolution Camera or not.
     * @param memoryGb      Gigabytes of memory.
     */
    public IPhoneFifteen(final double   minsRemaining,
                         final String   carrier,
                         final boolean  highResCamera,
                         final int      memoryGb) {
        super(minsRemaining, carrier);
        this.highResCamera = highResCamera;
        this.memoryGb      = memoryGb;
    }

    /**
     * Getter for if the IPhoneFifteen has a high resolution camera.
     *
     * @return true if the phone has a high-resolution camera, false otherwise
     */
    public boolean hasHighResCamera() {
        return highResCamera;
    }

    /**
     * Returns the memory size of the phone in gigabytes.
     *
     * @return the memory size of the phone in gigabytes
     */
    public int getMemoryGb() {
        return memoryGb;
    }

    /**
     * Prints the details of the IPhoneFifteen object.
     */
    @Override
    public void printDetails() {
        System.out.println(this.toString());
    }

    /**
     * Returns a string representation of the IPhoneFifteen object, including its specific properties.
     *
     * @return a string representation of the object
     */
    @Override
    public String toString() {
        return super.toString() +
                ", High-Resolution Camera: " +
                highResCamera +
                ", Memory: " +
                memoryGb + "GB";
    }

    /**
     * Shows if an object is equal to this object.
     * Note: IPhone objects that have the same number of minutes remaining on their respective phone plans and
     *       if they both have the high resolution camera.
     *
     * @param o the reference object with which to compare
     * @return true if this object is the same as the obj argument; false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        if(!super.equals(o)) return false;
        final IPhoneFifteen that = (IPhoneFifteen) o;
        return highResCamera == that.highResCamera;
    }

    /**
     * Returns a hash code value for the object.
     * The hash code is computed based on the hash code of the parent class and the high-resolution camera property.
     *
     * @return a hash code value for this object
     */
    @Override
    public int hashCode() {
        return HASHCODE_INTEGER * super.hashCode() + Boolean.hashCode(highResCamera);
    }
}
