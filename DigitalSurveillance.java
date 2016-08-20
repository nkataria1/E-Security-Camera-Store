/**
 * Class DigitalSurveillance to handle DigitalSurveillance Camera Details
 *
 * @author Nikhita Kataria
 * @version 1.0
 */
public class DigitalSurveillance extends SecurityCamera{

	// Media Format
	protected String mediaFormat;

        /**
        * Constructor for DigitalSurveillanc to initialize defaults
        */
        public DigitalSurveillance() {
		mediaFormat = new String();
        }

        /**
        * Constructor for DigitalSurveillance to initialze the media format
        * @param format Media Format for the Camera
        */
        public DigitalSurveillance(String format, double res, String conn, double mp, double priceIn, String desc, double weightIn, int quantityIn) {
                super(res, conn, mp, priceIn, desc, weightIn, quantityIn);
                this.mediaFormat = format;
        }

        /**
        * Copy Constructor for DigitalSurveillance 
        * @param s DigitalSurveillance Object To Be Copied
        */
        public DigitalSurveillance(DigitalSurveillance s) {
		this.mediaFormat = new String(s.mediaFormat);
        }

	/** 
	* Method to set Media Format
	* @param format Media Format for the Camera
	*/
	public void setMediaFormat (String format) {
                this.mediaFormat = new String(format);
	}

	/** 
	* Method to get Media Format
	* @return String Media Format for the Camera 
	*/
	public String getMediaFormat() {
		return this.mediaFormat;
	}

        /**
        * Method to find if two instance of DigitalSurveillance Class are equal
        * @return boolean If Instances are equal return true else false
        */
        public boolean equals(DigitalSurveillance s)
        {
                if (this.mediaFormat == s.mediaFormat && super.equals(s)) {
                        return true;
                } else {
                        return false;
                }
        }

        /**
        * Method to return DigitalSurveillance details in String format
        * @return String DigitalSurveillance details in String format
        */
        public String toString()
        {
                return super.toString() + " Format " + mediaFormat;
        }
}
