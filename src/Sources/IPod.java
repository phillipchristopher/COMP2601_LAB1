/**
 * IPod class to model an iPod device with specific properties, which is a subclass of IDevice.
 *
 * @author Chris Helmhold, Emma Lee
 * @version 1.0
 */
public class IPod extends IDevice {
    private int    numSongs;
    private double maxVolumeDbs;

    private static final String IPOD_PURPOSE = "music";

    /**
     * Constructs an IPod with the specified parameters.
     *
     * @param numSongs  the number of songs stored on the iPod
     * @param maxVolumeDbs the maximum volume of the iPod in decibels
     */
    public IPod(final int       numSongs,
                final double    maxVolumeDbs) {
        super(IPOD_PURPOSE);
        this.numSongs       = numSongs;
        this.maxVolumeDbs   = maxVolumeDbs;
    }

    /**
     * Getter for the number of songs on the iPod.
     *
     * @return the number of songs on the iPod
     */
    public int getNumSongs() {
        return numSongs;
    }

    /**
     * Setter for the number of songs on the iPod.
     *
     * @param numberOfSongs the number of songs on the iPod.
     */
    public void setNumberOfSongs(final int numberOfSongs) {
        this.numSongs = numberOfSongs;
    }

    /**
     * Getter for the iPod's maximum volume in decibels.
     *
     * @return the maximum volume of the iPod in decibels
     */
    public double getMaxVolumeDbs() {
        return maxVolumeDbs;
    }

    /**
     * Setter for the maximum volume of the iPod in decibels.
     *
     * @param maxVolume the maximum volume to set in decibels
     */
    public void setMaxVolume(final double maxVolume) {
        this.maxVolumeDbs = maxVolume;
    }

    /**
     * Prints the details of the IPod object.
     */
    @Override
    public void printDetails() {
        System.out.println(this.toString());
    }

    /**
     * Returns a String representation of the IPOd object with its properties.
     *
     * @return a String representation of the IPod object
     */
    @Override
    public String toString() {
        return super.toString() +
                ", Number of Songs: " +
                numSongs +
                ", Max Volume: " +
                maxVolumeDbs;
    }

    /**
     * Shows if an object is equal to this object.
     * Two IPod  objects are considered equal if they have the same number of songs stored.
     *
     * @param o the reference to compare
     * @return true if the object is equal to the object argument passed in, false otherwise.
     */
    @Override
    public boolean equals(final Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        final IPod iPod = (IPod) o;

        return numSongs == iPod.numSongs;
    }

    /**
     * Returns a hash code value for the object.
     * The hash code is computed based on the number of songs stored.
     *
     * @return a hash code value for this object
     */
    @Override
    public int hashCode() {
        return Integer.hashCode(numSongs);
    }
}
