/**
 * IPhone class to model an iPhone device with specific properties, which is a subclass of IDevice.
 *
 * @author Chris Helmhold, Emma Lee
 * @version 1.0
 */
public class IPhone extends IDevice {
    private double minsRemaining;
    private String carrier;

    private static final String IPHONE_PURPOSE              = "talking";
    private static final int    MINIMUM_MINUTES_REMAINING   = 0;

    /**
     * Constructor for an IPhone object.
     * @param minsRemaining the Minutes of talk time remaining on the phone plan.
     * @param carrier the company provider for the phone's service connection plan.
     */
    public IPhone(final double minsRemaining,
                  final String carrier) {
        super(IPHONE_PURPOSE);
        this.minsRemaining      = minsRemaining;
        this.carrier            = carrier;
    }

    /**
     * Returns the number of minutes remaining on the phone's plan.
     *
     * @return the number of minutes remaining on the phone's plan
     */
    public double getMinutesRemaining()
    {
        return minsRemaining;
    }

    /**
     * Sets the number of minutes remaining on the phone's plan.
     *
     * @param minutesRemaining the number of minutes to set for the phone's plan
     */
    public void setMinutesRemaining(final double minutesRemaining)
    {
        this.minsRemaining = minutesRemaining;
    }

    /**
     * Returns the carrier of the phone.
     *
     * @return the carrier of the phone
     */
    public String getCarrier()
    {
        return carrier;
    }

    /**
     * Sets the carrier company for the phone's plan.
     *
     * @param carrier the carrier to set
     */
    public void setCarrier(final String carrier)
    {
        this.carrier = carrier;
    }

    /**
     * Prints the details of the IPhone object.
     */
    @Override
    public void printDetails()
    {
        System.out.println(this.toString());
    }

    /**
     * Returns a String representation of the IPhone object with its properties.
     *
     * @return a String representation of the IPhone object
     */
    @Override
    public String toString() {
        return super.toString() + ", Minutes Remaining: " + minsRemaining + ", Carrier: " + carrier;
    }

    /**
     * Shows if an object is equal to this object.
     * Note: IPhone objects that have the same number of minutes remaining on their respective phone plans.
     *
     * @param o the reference to compare
     * @return true if the object is equal to the object argument passed in, false otherwise.
     */
    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final IPhone iPhone = (IPhone) o;

        return Double.compare(iPhone.minsRemaining, minsRemaining) == MINIMUM_MINUTES_REMAINING;
    }

    /**
     * Returns a hash code value for the object.
     *
     * @return a hash code value for this object
     */
    @Override
    public int hashCode()
    {
        return Double.hashCode(minsRemaining);
    }
}
