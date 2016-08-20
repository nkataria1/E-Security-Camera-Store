/**
 * Class Customer to handle Customer Data and Operations
 *
 * @author Nikhita Kataria
 * @version 1.0
 */
public class Customer extends User {
	// Customer's Cart
	Cart cart;

	public Customer () {
		cart = new Cart();
	}

	/**
	 * Constructor for Customer to set values
	 * @param name Name of the User
	 * @param pass Password of the User
	 * @param email Email of the User
	 * @param state State of the User
	 * @param city City of the User
	 * @param number Phone Number of the User
	 */
	public Customer(String name, String pass, String email, String state, String city, String number) {
		super(name, pass, email, state, city, number);
		cart = new Cart();
	}

	/**
	 * Method to register Customer with the System
	 * @param c Customer Instance to register
	 */
	public void register(Customer c) {
		User.customers.add(c);
	}	

	/**
	 * Method to delete profile from the System
	 * @param c Customer Instance to register
	 */
	public void deleteProfile(Customer c) {
		for (Customer u : User.customers) {
			if (c.getName().equals(u.getName())) {
				User.customers.remove(c);
			}
		}
	}	

	/**
	 * Method to add a product in the Customer's Cart
	 * @param p CartProduct instance to be added
	 */
	public void addProduct(CartProduct p) throws InsufficientQuantityException {
		for (CartProduct product : Admin.products) {
			if (product.getDescription().equals(p.getDescription()) && (product.getQuantity() >= 1)) {
				cart.addToCart(p);
				break;
			} else {
				throw new InsufficientQuantityException("Out of Stock");
			}
		}
	}

	/**
	 * Method to delete a product from the Customer's Cart
	 * @param p CartProduct instance to be deleted
	 */
	public void deleteProduct(CartProduct p) {
		cart.deleteFromCart(p);
	}

	/**
	 * Method for the Customer to checkout
	 */
	public void checkout() {
		// checkout and reset the quantity in global product list
		for (CartProduct product : Admin.products) {
			try {
				for (CartProduct cartProduct : cart.getProducts()) {
					if (product.getDescription().equals(cartProduct.getDescription())) {
						if(product.getQuantity() >= 1) {
							product.setQuantity(product.getQuantity() - 1); 
						}
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		cart.deleteCart();
	}

	/**
	 * Method to display Customer's Cart
	 */
	public void displayCart() {
		System.out.println(cart.toString());
	}
}
