/**
 * Class IPSurveillance to handle iIPSurveillance Camera Details
 *
 * @author Nikhita Kataria
 * @version 1.0
 */
public class IPSurveillance extends SecurityCamera {

	// IP Addres
	protected String ipAddress;

	/**
	 * Constructor for IPSurveillance to initialize defaults
	 */
	public IPSurveillance() {
		ipAddress = new String();
	}

	/**
	 * Constructor for IPSurveillance to initialze the Ip Address
	 * @param ipaddr IP Address for the Camera
	 */
	public IPSurveillance(String ipaddr, double res, String conn, double mp, double priceIn, String desc, double weightIn, int quantityIn) {
                super(res, conn, mp, priceIn, desc, weightIn, quantityIn);
		this.ipAddress = new String(ipaddr);
	}

	/**
	 * Copy Constructor for IPSurveillance
	 * @param s IPSurveillance Object To Be Copied
	 */
	public IPSurveillance(IPSurveillance s) {
		this.ipAddress = new String(s.ipAddress);
	}

	/** 
	 * Method to set ip address
	 * @param ipaddr IP Address for the Camera
	 */
	public void setIpAddress (String ipaddr) {
		this.ipAddress = ipaddr;
	}

	/** 
	 * Method to get ip addres
	 * @return String IP Address for the Camera 
	 */
	public String getIpAddress() {
		return this.ipAddress;
	}

	/**
	 * Method to find if two instance of IPSurveillance Class are equal
	 * @return boolean If Instances are equal return true else false
	 */
	public boolean equals(IPSurveillance s)
	{
		if (this.ipAddress == s.ipAddress && super.equals(s)) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Method to return IPSurveillance details in String format
	 * @return String IPSurveillance details in String format
	 */
	public String toString()
	{
		return super.toString() + " Ip Address: " + ipAddress;
	}
}
