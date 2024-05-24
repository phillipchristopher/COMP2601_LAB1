/**
 * Class for IDevices as an abstract parent class for different device subtypes
 * @author Chris Helmhold, Emma Lee
 * @version 1.0
 */
public abstract class IDevice{
    private final String purpose;

    /**
     * Constructor for the IDevice class.
     * @param purpose The purpose of the IDevice.
     */
    IDevice(final String purpose){
        if(purpose == null || purpose.isBlank()){
            throw new IllegalArgumentException("invalid purpose: " + purpose);
        }
        this.purpose = purpose;
    }

    /**
     * Getter for the IDevice's purpose.
     * @return the IDevice purpose.
     */
    public String getPurpose() {
        return purpose;
    }

    /**
     * Method to print the device details (for use with subclasses of IDevice)
     */
    public abstract void printDetails();

    /**
     * To String method for the IDevice object.
     * @return the properties of the IDevice as a String.
     */
    @Override
    public String toString()
    {
        return "Purpose: " + purpose;
    }

    /**
     * Method to indicate if another object is equal to this object.
     * Must be implemented by a subclass of IDevice
     *
     * @param o the reference to compare
     * @return true if the object is equal to the object argument passed in, false otherwise.
     */
    @Override
    public abstract boolean equals(final Object o);

    /**
     * Return a hashcode for the object, to be implemented by subclasses of IDevice
     * @return a hashcode for this object.
     */
    @Override
    public abstract int hashCode();
}
