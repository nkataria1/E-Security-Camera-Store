import java.util.*;

/**
 * Class Cart to handle Cart Details
 *
 * @author Nikhita Kataria
 * @version 1.0
 */
public class Cart {
	// Number of items in the cart
	private int numItems;

	// List of products in the cart
	ArrayList<CartProduct> products;

	/**
	 * Constructor for Cart to initialize defaults
	 */
	public Cart() {
		numItems = 0;
		products = new ArrayList<CartProduct>();
	}

	/**
	 * Copy Constructor for Cart
	 * @param c Cart instance to be copied
	 */
	public Cart(Cart c) {
		numItems = c.numItems;
		for (CartProduct cp : c.products) {
			products.add(cp);
		} 
	}

	/**
	 * Method to add product in the cart
	 * @param p Product to be added in the cart 
	 */
	public void addToCart(CartProduct p) {
		products.add(p);
		numItems++;
	}

	/**
	 * Method to delete product from the cart
	 * @param p Product to be deleted from the cart
	 */
	public void deleteFromCart(CartProduct p) {
		for (CartProduct cp : products) {
			if (cp.getDescription().equals(p.getDescription())) {
				products.remove(cp);
				numItems--;
				break;
			}
		}
	}

	/**
	 * Method to set number of items in the cart 
	 * @param numItems Number of items to be set
	 */
	public void setnumItems(int numItems) {
		this.numItems = numItems;
	}

	/**
	 * Method to get number of items in the cart 
	 * @return int numItems Number of items to be set
	 */
	public int getnumItems() {
		return numItems;
	}

	/**
	 * Method to remove all products from the cart
	 */
	public void deleteCart() {
		products.clear();
	}

	/**
	 * Method to return all products from the cart
	 */
	public ArrayList<CartProduct> getProducts() {
		return products;
	}

	/**
	 * Method to find if two instance of Cart Class are equal
	 * @return boolean If Instances are equal return true else false
	 */
	public boolean equals(Cart c)
	{
		if(c.numItems != numItems) {
			return false;
		}
		for (CartProduct cp : products) {
			if(!c.getProducts().contains(cp)) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Method to return Cart details in String format
	 * @return String Cart details in String format
	 */
	public String toString()
	{
		String res = new String(" ");
		for (CartProduct cp : products) {
			res = res + cp.toString() + "\n";
		}
		return res;
	}
}
