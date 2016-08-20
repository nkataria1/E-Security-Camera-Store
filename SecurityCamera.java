/**
 * Class SecurityCamera to handle Camera Details
 *
 * @author Nikhita Kataria
 * @version 1.0
 */
public class SecurityCamera extends CartProduct {

	// resolution for the camera
	private double resolution;

	// Resolution for the camera
	private String connectivity;

	// megaPixels for the Camer
	private double megaPixels;

	/**
	 * Constructor for SecurityCamera to initialize defaults
	 */
	public SecurityCamera() {
		resolution = 0.00;
		connectivity = new String("default");
		megaPixels = 0.00;
	}

	/**
	 * Constructor for SecurityCamera to initialize user defined parameters
	 * @param res Resolution for the Camera
	 * @param conn Connectivity for the Camera
	 * @param mp Mega Pixels for the Camera
	 */
	public SecurityCamera(double res, String conn, double mp, double priceIn, String desc, double weightIn, int quantityIn) {
		super(priceIn, desc, weightIn, quantityIn);
		this.resolution = res;
		this.connectivity = new String(conn);
		this.megaPixels = mp;
	}

	/**
	 * Copy Constructor for SecurityCamera
	 * @param c SecurityCamera instance to be copied
	 */
	public SecurityCamera(SecurityCamera c) {
		super(c);
		this.resolution = c.resolution;
		this.connectivity = new String(c.connectivity);
		this.megaPixels = c.megaPixels;
	}

	/**
	 * Method to set resolution 
	 * @param res Resolution for the Camera
	 */
	public void setResolution(double res) {
		this.resolution = resolution;
	}

	/**
	 * Method to get resolution 
	 * @return double Resolution for the Camera
	 */
	public double getResolution() {
		return this.resolution;
	}

	/**
	 * Method to set connectivity
	 * @param conn Connectivity for the Camera
	 */
	public void setConnectivity(String conn) {
		this.connectivity = new String(conn);
	}

	/**
	 * Method to get connectivity
	 * @return String Connectivity for the Camera
	 */
	public String getConnectivity() {
		return this.connectivity;
	}

	/**
	 * Method to set mega pixels
	 * @param mp Mega Pixels for the Camera
	 */
	public void setMegaPixels(double mp) {
		this.megaPixels = mp;
	}

	/**
	 * Method to get mega pixels
	 * @return double Mega Pixels for the Camera
	 */
	public double getMegaPixels() {
		return this.megaPixels;
	}

	/**
	 * Method to find if two instance of SecurityCamera Class are equal
	 * @return boolean If Instances are equal return true else false
	 */
	public boolean equals(SecurityCamera camera)
	{
		if (camera.resolution == resolution && camera.connectivity.equals(connectivity) && camera.megaPixels == megaPixels) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Method to return SecurityCamera details in String format
	 * @return String SecurityCamera details in String format
	 */
	public String toString()
	{
		return super.toString() + " Resolution: " + this.resolution + " Connectivity: " + this.connectivity + " MegaPixels: " + this.megaPixels;
	}
}
