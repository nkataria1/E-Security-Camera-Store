/**
 * Class AnalogDvr to handle analog Dvr details
 *
 * @author Nikhita Kataria
 * @version 1.0
 */
public class AnalogDvr extends Dvr {

	// DVR channel strength
	private double channel;

	// Compression Value
	private double compression;

	/**
	 * Constructor for AnalogDvr to initialize defaults
	 */
	public AnalogDvr() {
		channel = 0.00;
		compression = 0.00;
	}

	/**
	 * Constructor for AnalogDvr to initialize user defined parameters
	 * @param channel channel value for the DVR
	 * @param compression compression value for the DVR
	 * @param res Resolution for the DVR
	 * @param type Type of DVR 
	 * @param priceIn Price of the Product
	 * @param desc Description of the Product
	 * @param weightIn Weight of the Product
	 * @param quantityIn Quantity of the product
	 */
	public AnalogDvr(double channel, double compression, double res, String type, double priceIn, String desc, double weightIn, int quantityIn) {
		super(res, type, priceIn, desc, weightIn, quantityIn);
		this.channel = channel;
		this.compression = compression;
	}

	/**
	 * Copy Constructor for AnalogDvr
	 * @param d AnalogDvr instance to be copied
	 */
	public AnalogDvr(AnalogDvr d) {
		super(d);
		this.channel = d.channel;
		this.compression = d.compression;
	}

	/**
	 * Method to set channel 
	 * @param channel channel for the DVR
	 */
	public void setchannel(double channel) {
		this.channel = channel;
	}

	/**
	 * Method to get channel 
	 * @return int channel for the DVR
	 */
	public double getchannel() {
		return this.channel;
	}

	/**
	 * Method to set compression
	 * @param compression Compression for the DVR
	 */
	public void setCompression(double compression) {
		this.compression = compression;
	}

	/**
	 * Method to get compression
	 * @return String DVR Sensor Type
	 */
	public double getCompression() {
		return this.compression;
	}

	/**
	 * Method to find if two instance of AnalogDvr Class are equal
	 * @return boolean If Instances are equal return true else false
	 */
	public boolean equals(AnalogDvr d)
	{
		if (d.channel == channel && d.compression == compression) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Method to return AnalogDvr details in String format
	 * @return String AnalogDvr details in String format
	 */
	public String toString()
	{
		return super.toString() + " Channel: " +this.channel + " Compression: " + this.compression;
	}
}
