/**
 * Class Digital DigitalDvr to handle digital DVR Details
 *
 * @author Nikhita Kataria
 * @version 1.0
 */
public class DigitalDvr extends Dvr {

	// DVR Zoom strength
	private int zoom;

	// Sensor Type
	private String sensorType;

	/**
	 * Constructor for DigitalDvr to initialize defaults
	 */
	public DigitalDvr() {
		zoom = 0;
		sensorType = new String("default");
	}

	/**
	 * Constructor for DigitalDvr to initialize user defined parameters
	 * @param zoom Zoom value for the DVR
	 * @param sensorType Sensor Type of DVR
	 * @param res Resolution for the DVR
	 * @param type Type of DVR 
	 * @param priceIn Price of the Product
	 * @param desc Description of the Product
	 * @param weightIn Weight of the Product
	 * @param quantityIn Quantity of the product
	 */
	public DigitalDvr(int zoom, String sensorType, double res, String type, double priceIn, String desc, double weightIn, int quantityIn) {
		super(res, type, priceIn, desc, weightIn, quantityIn);
		this.zoom = zoom;
		this.sensorType = new String(sensorType);
	}

	/**
	 * Copy Constructor for DigitalDvr
	 * @param d DigitalDvr instance to be copied
	 */
	public DigitalDvr(DigitalDvr d) {
		super(d);
		this.zoom = d.zoom;
		this.sensorType = new String(d.sensorType);
	}

	/**
	 * Method to set zoom 
	 * @param zoom Zoom for the DVR
	 */
	public void setZoom(int zoom) {
		this.zoom = zoom;
	}

	/**
	 * Method to get zoom 
	 * @return int Zoom for the DVR
	 */
	public int getZoom() {
		return this.zoom;
	}

	/**
	 * Method to set sensorType
	 * @param type Type of DVR
	 */
	public void setSensorType(String type) {
		this.sensorType = new String(type);
	}

	/**
	 * Method to get sensorType
	 * @return String DVR Sensor Type
	 */
	public String getSensorType() {
		return this.sensorType;
	}

	/**
	 * Method to find if two instance of DigitalDvr Class are equal
	 * @return boolean If Instances are equal return true else false
	 */
	public boolean equals(DigitalDvr d)
	{
		if (d.zoom == zoom && d.sensorType.equals(sensorType)) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Method to return DigitalDvr details in String format
	 * @return String DigitalDvr details in String format
	 */
	public String toString()
	{
		return super.toString() + " Zoom: " + this.zoom + " Sensor: " + this.sensorType;
	}
}
