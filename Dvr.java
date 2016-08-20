/**
 * Class Dvr to handle DVR Details
 *
 * @author Nikhita Kataria
 * @version 1.0
 */
public class Dvr extends CartProduct {
	
	// Type of DVR
	private String dvrType;

	// Resolution for DVR
	private double resolution;
	
	/**
        * Constructor for Dvr to initialize defaults
        */
        public Dvr() {
                resolution = 0.00;
                dvrType = new String("default");
        }

	/**
        * Constructor for Dvr to initialize user defined parameters
	* @param res Resolution for the DVR
	* @param type Type of DVR
        * @param priceIn Price of the Product
        * @param desc Description of the Product
        * @param weightIn Weight of the Product
        * @param quantityIn Quantity of the product
        */
        public Dvr(double res, String type, double priceIn, String desc, double weightIn, int quantityIn) {
		super(priceIn, desc, weightIn, quantityIn);
                this.resolution = res;
                this.dvrType = new String(type);
        }

	/**
        * Copy Constructor for Dvr
	* @param d Dvr instance to be copied
        */
        public Dvr(Dvr d) {
		super(d);
                this.resolution = d.resolution;
                this.dvrType = new String(d.dvrType);
        }

	/**
	* Method to set resolution 
	* @param res Resolution for the DVR
	*/
	public void setResolution(double res) {
		this.resolution = resolution;
	}

	/**
	* Method to get resolution 
	* @return double Resolution for the DVR
	*/
	public double getResolution() {
		return this.resolution;
	}

	/**
	* Method to set dvrType
	* @param type Type of DVR
	*/
	public void setDvrType(String type) {
                this.dvrType = new String(type);
	}

	/**
	* Method to get dvrType
	* @return String DVR Type
	*/
	public String getDvrType() {
                return this.dvrType;
	}

	/**
        * Method to find if two instance of Dvr Class are equal
        * @return boolean If Instances are equal return true else false
        */
        public boolean equals(Dvr d)
        {
                if (d.resolution == resolution && d.dvrType.equals(dvrType)) {
                        return true;
                } else {
                        return false;
                }
        }

        /**
        * Method to return Dvr details in String format
        * @return String Dvr details in String format
        */
        public String toString()
        {
                return super.toString() + " Resolution: " + this.resolution + " Type: " + this.dvrType;
        }
}
