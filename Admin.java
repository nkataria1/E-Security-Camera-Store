import java.util.*;

public class Admin extends User { 
	static ArrayList<CartProduct> products;
	protected int privileges;

	public Admin() {
		products = new ArrayList<CartProduct>();
		privileges = 777;
	}

	/**
	 * Constructor for Admin to set values
	 * @param name Name of the User
	 * @param pass Password of the User
	 * @param email Email of the User
	 * @param state State of the User
	 * @param city City of the User
	 * @param number Phone Number of the User
	 */
	public Admin(String name, String pass, String email, String state, String city, String number) {
		super(name, pass, email, state, city, number);
		products = new ArrayList<CartProduct>();
		privileges = 777;
	}

	/**
	 * Method to add a Product in the Global List of Products
	 * @param p Instance of a CartProduct
	 */
	public static void addProduct(CartProduct p) {
		products.add(p);
	}

	/**
	 * Method to delete a Product from the Global List of Products
	 * @param p Instance of a CartProduct
	 */
	public static void deleteProduct(CartProduct p) {
		for (CartProduct cp : products) {
			if (cp.getDescription().equals(p.getDescription())) {
				products.remove(cp);
			} else {
				System.out.println("No such product");
			}
		}
	}

	/**
	 * Method to delete a Product from the Global List of Products using its description
	 * @param desc Description of the Product
	 */
	public static void deleteProduct(String desc) {
		for (CartProduct cp : products) {
			if (cp.getDescription().equals(desc)) {
				products.remove(cp);
			} else {
				System.out.println("No such product");
			}
		}
	}

	/**
	 * Method to update a Products
	 * @param p Instance of Cart Product
	 * @param priceIn Price of the Product
	 * @param desc Description of the Product
	 * @param weightIn Weight of the Product
	 * @param quantityIn Quantity of the product
	 */
	public void updateProduct(CartProduct p, double priceIn, String desc, double weightIn, int quantityIn) {
		try {
			p.setPrice(priceIn);
			p.setDescription(desc);
			p.setWeight(weightIn);
			p.setQuantity(quantityIn);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Method to get a Product from the Global List of Products using its description
	 * @param desc Description of the Product
	 */
	public static CartProduct getProductFromDesc(String desc) { 
		for (CartProduct cp : products) {
			if(desc.equals(cp.getDescription())) {
				return cp;
			}
		}
		return null;
	}

	/**
	 * Method to update Customer Info
	 * @param c Instance of Customer Class
         * @param name Name of the User
         * @param pass Password of the User
         * @param email Email of the User
         * @param state State of the User
         * @param city City of the User
         * @param number Phone Number of the User
	 */
	public void updateCustomer(Customer c, String name, String pass, String email, String state, String city, String number) {
		c.setName(new String(name));
		c.setPassword(new String(pass));
		c.setState(new String(state));
		c.setNumber(new String(number));
		c.setCity(new String(city));
		c.setEmail(new String(email));
	}

	/**
	 * Method to register an Admin with the System
	 * @param a Admin Instance to register
	 */
	public void register(Admin a) {
		User.admins.add(a);
	}

	/**
	 * Method to delete profile from the System
	 * @param c Customer Instance to register
	 */
	public void deleteCustomer(Customer c) {
		c.deleteProfile(c);
	}

	/**
	 * Method to display all products available in the System
	 */
	public static void displayAllProducts() {
		for (CartProduct cp : products) {
			System.out.println(cp.toString());
		}
	}
}
