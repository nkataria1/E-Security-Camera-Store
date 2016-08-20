/**
 * Class Digital HybridDvr to handle digital DVR Details
 *
 * @author Nikhita Kataria
 * @version 1.0
 */
public class HybridDvr extends Dvr {

	// DVR Category 
	private String category;

	// Sensor Type
	private String signalType;

	/**
	 * Constructor for HybridDvr to initialize defaults
	 */
	public HybridDvr() {
		category = new String("default");
		signalType = new String("default");
	}

	/**
	 * Constructor for HybridDvr to initialize user defined parameters
	 * @param category Category for the Analog DVR
	 * @param signalType Signal for the Analog DVR
	 * @param res Resolution for the DVR
	 * @param type Type of DVR 
	 * @param priceIn Price of the Product
	 * @param desc Description of the Product
	 * @param weightIn Weight of the Product
	 * @param quantityIn Quantity of the product
	 */
	public HybridDvr(String category, String signalType, double res, String type, double priceIn, String desc, double weightIn, int quantityIn) {
		super(res, type, priceIn, desc, weightIn, quantityIn);
		this.category = new String(category);
		this.signalType = new String(signalType);
	}

	/**
	 * Copy Constructor for HybridDvr
	 * @param d HybridDvr instance to be copied
	 */
	public HybridDvr(HybridDvr d) {
		super(d);
		this.category = new String(d.category);
		this.signalType = new String(d.signalType);
	}

	/**
	 * Method to set cateogry
	 * @param category Category for the Dvr
	 */
	public void setCategory(String category) {
		this.category = new String(category);
	}

	/**
	 * Method to get category
	 * @return String Category for the DVR
	 */
	public String getCategory() {
		return this.category;
	}

	/**
	 * Method to set signalType
	 * @param type Signal Type of DVR
	 */
	public void setSignalType(String type) {
		this.signalType = new String(type);
	}

	/**
	 * Method to get signalType
	 * @return String DVR Signal Type
	 */
	public String getSignalType() {
		return this.signalType;
	}

	/**
	 * Method to find if two instance of HybridDvr Class are equal
	 * @return boolean If Instances are equal return true else false
	 */
	public boolean equals(HybridDvr d)
	{
		if (d.signalType.equals(signalType) && d.category.equals(category)) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Method to return HybridDvr details in String format
	 * @return String HybridDvr details in String format
	 */
	public String toString()
	{
		return super.toString() + " Category: " + this.category + " Signal Type " + this.signalType;
	}
}
