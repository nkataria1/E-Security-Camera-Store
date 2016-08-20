/**
 * Class Accessories to handle details of different accessories 
 *
 * @author Nikhita Kataria
 * @version 1.0
 */

public class Accessories extends CartProduct{

	// Type of Accessory
	public String type;

	/**
	 * Constructor for Accessories to initialize defaults
	 */
	public Accessories() {
		type = new String();
	}

	/**
	 * Constructor for Accessories to initialize the type
	 * @param type Type for the Camera
	 */
	public Accessories(String type, double priceIn, String desc, double weightIn, int quantityIn) {
		super(priceIn, desc, weightIn, quantityIn);
		this.type = new String(type);
	}

	/**
	 * Copy Constructor for Accessories
	 * @param s Accessories Object To Be Copied
	 */
	public Accessories(Accessories s) {
		super(s);
		type = new String(s.type);
	}

	/**
	 * Method to set the type of accessory
	 * @param type Type of accessory
	 */
	public void setType(String type) {
		this.type = new String(type);
	}

	/**
	 * Method to return the type of accessory
	 * @return String Type of accessory
	 */
	public String getType() {
		return this.type;
	}

	/**
	 * Method to find if two instance of Accessories Class are equal
	 * @return boolean If Instances are equal return true else false
	 */
	public boolean equals(Accessories s)
	{
		if (this.type == s.type && super.equals(s)) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Method to return Accessories details in String format
	 * @return String Accessories details in String format
	 */
	public String toString()
	{
		return super.toString() + " Type: " + this.type;
	}		

}	
