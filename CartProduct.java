/**
 * Class CartProduct to handle Product Details
 *
 * @author Nikhita Kataria
 * @version 1.0
 */
public class CartProduct {
	// Price of the Product
	private double price;

	// Description of the Product
	private String description;

	// Weight of the Product
	private double weight;
	
	// Product Quantity
	private int quantity;

	/**
        * Constructor for CartProduct to initialize defaults
        */
	public CartProduct() {
		price = 0.00;
		description = "none";
		weight = 0.00;
		quantity = 0;
	}

	/**
        * Constructor for CartProduct to initialize product details
	* @param priceIn Price of the Product
	* @param desc Description of the Product
	* @param weightIn Weight of the Product
	* @param quantityIn Quantity of the product
        */
	public CartProduct(double priceIn, String desc, double weightIn, int quantityIn) {
		this.price = priceIn;
		this.description = new String(desc);
		this.weight = weightIn;
		this.quantity = quantityIn;
	}

        /**
        * Copy Constructor for CartProduct to Instantiate name and number
        * @param c CartProduct Object To Be Copied
        */
	public CartProduct(CartProduct c) {
		this.price = c.price;
		this.description = new String(c.description);
		this.weight = c.weight;
		this.quantity = c.quantity;
	}

        /**
        * Method to Set Price for the Product
        * @param price Price for the Product
        */ 
	public void setPrice(double price) throws InvalidPriceException {
		if (price < 0) {
			throw new InvalidPriceException("Price cannot be less than zero");
		}
		this.price = new Double(price);
	}

        /**
        * Method to Get Price for the Product
        * @return double Price for the Product
        */ 
	public double getPrice() {
		return this.price;
	}

        /**
        * Method to Set Weight for the Product
        * @param weight Weight for the Product
        */ 
	public void setWeight(double weight) throws InvalidWeightException {
		if (weight < 0) {
			throw new InvalidWeightException("Weight cannot be less than zero");
		}
		this.weight = new Double(weight);
	}

        /**
        * Method to Get Weight for the Product
        * @return double Weight for the Product
        */ 
	public double getWeight() {
		return this.weight;
	}

        /**
        * Method to Set Quantity for the Product
        * @param quantity Quantity for the Product
        */ 
	public void setQuantity(int quantity) throws InvalidQuantityException {
		if (quantity < 0) {
			throw new InvalidQuantityException("Quantity cannot be negative");
		}
		this.quantity = quantity;
	}

        /**
        * Method to Get Quantity for the Product
        * @return int Quantity for the Product
        */ 
	public int getQuantity() {
		return this.quantity;
	}

        /**
        * Method to Set Description for the Product
        * @param desc Description for the Product
        */ 
	public void setDescription(String desc) {
		this.description = new String(desc);
	}

        /**
        * Method to Get Description for the Product
        * @return String Description for the Product
        */ 
	public String getDescription() {
		return this.description;
	}

	/**
        * Method to find if two instance of CartProduct Class are equal
        * @return boolean If Instances are equal return true else false
        */
        public boolean equals(CartProduct product)
        {
                if (product.price == price && description.equals(product.description) && product.weight == weight) {
                        return true;
                } else {
                        return false;
                }
        }

        /**
        * Method to return CartProduct details in String format
        * @return String CartProduct details in String format
        */
        public String toString()
        {
		return this.description + ": Price: " + this.price + " Weight: " + this.weight + " Quantity: " + this.quantity;
        }
}
