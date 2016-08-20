/**
 * Class AnalogSecurity to handle Analog Security Camera Details
 *
 * @author Nikhita Kataria
 * @version 1.0
 */
public class AnalogSecurity extends SecurityCamera {

	// Signal Strength 
	protected double signalStrength;

	/**
	 * Constructor for AnalogSecurity to initialize defaults
	 */
	public AnalogSecurity() {
		signalStrength = 0.00;
	}
	/**
	 * Constructor for AnalogSecurity to initialze the strength
	 * @param strength Strength for the Product
	 */
	public AnalogSecurity(double strength, double res, String conn, double mp, double priceIn, String desc, double weightIn, int quantityIn) {
		super(res, conn, mp, priceIn, desc, weightIn, quantityIn);
		this.signalStrength = strength;
	}

	/**
	 * Copy Constructor for AnalogSecurity
	 * @param s AnalogSecurity Object To Be Copied
	 */
	public AnalogSecurity(AnalogSecurity s) {
		this.signalStrength = s.signalStrength;
	}

	/** 
	 * Method to set signal strength
	 * @param strength Signal Strength for the Camera
	 */
	public void setSignalStrength (double strength) {
		this.signalStrength = strength;
	}

	/** 
	 * Method to get signal strength
	 * @return double Signal Strength for the Camera
	 */
	public double getSignalStrength () {
		return signalStrength;
	}

	/**
	 * Method to find if two instance of AnalogSecurity Class are equal
	 * @return boolean If Instances are equal return true else false
	 */
	public boolean equals(AnalogSecurity s)
	{
		if (this.signalStrength == s.signalStrength) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Method to return AnalogSecurity details in String format
	 * @return String AnalogSecurity details in String format
	 */
	public String toString() {
		return super.toString() + " Signal:  " + this.signalStrength;
	}
}
