import java.util.*;
import java.io.*;

/**
 * Class User to handle User Data
 * 
 * @author Nikhita Kataria
 * @version 1.0
 */
public class User {

	// Variable to store User Name
	private String name;

	// Variable to store User Number
	private String password;

	// Variable to store User's Email ID 
	private String email;

	// Variable to store User's City
	private String city;

	// Variable to store User's State
	private String state;

	// Variable to store User's Number
	private String number;

	static protected ArrayList<Customer> customers;
	static protected ArrayList<Admin> admins;

	/**
	 * Constructor for User to initialize defaults
	 */
	public User() {
		name=new String();
		password=new String();
		email=new String();
		state=new String();
		number=new String();
		city=new String();
		customers = new ArrayList<Customer>();
		admins = new ArrayList<Admin>();
	}

	/**
	 * Constructor for User to set user defined values
	 * @param nameIn Name of the User
	 * @param passIn Password of the User
	 * @param emailIn Email of the User
	 * @param stateIn State of the User
	 * @param cityIn City of the User
	 * @param numberIn Phone Number of the User
	 */
	public User(String nameIn, String passIn, String emailIn, String stateIn, String cityIn, String numberIn) {
		name=new String(nameIn);
		password=new String(passIn);
		email=new String(emailIn);
		state=new String(stateIn);
		number=new String(numberIn);
		city=new String(cityIn);
		customers = new ArrayList<Customer>();
		admins = new ArrayList<Admin>();
	}

	/**
	 * Copy Constructor for User 
	 * @param e User Object To Be Copied
	 */
	public User(User e) {
		name=new String(e.name);
		password=new String(e.password);
		state=new String(e.state);
		number=new String(e.number);
		city=new String(e.city);
		email=new String(e.email);
	}

	/**
	 * Method to Set User's Name
	 * @param s Name of the User
	 */
	public void setName(String s) {
		name = new String(s);
	}

	/**
	 * Method to Set User's Password
	 * @param p Password of the User
	 */
	public void setPassword(String p) {
		password = new String(p);
	}

	/**
	 * Method to Set User's Email
	 * @param e Email of the User
	 */
	public void setEmail(String e) {
		email = new String(e);
	}

	/**
	 * Method to Set User's City
	 * @param c City of the User
	 */
	public void setCity(String c) {
		city = new String(c);
	}

	/**
	 * Method to Set User's State
	 * @param s State of the User
	 */
	public void setState(String s) {
		state = new String(s);
	}

	/**
	 * Method to Set User's Number
	 * @param n Number of the User
	 */
	public void setNumber(String n) {
		number = new String(n);
	}

	/**
	 * Method to Get User's Password
	 * @return String Password of the User
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Method to Get User's Email
	 * @return String Email of the User
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Method to get User's Name
	 * @return String User Name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Method to get User's Number
	 * @return String User Number
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * Method to get User's State
	 * @return String User State
	 */
	public String getState() {
		return state;
	}

	/**
	 * Method to get User's City
	 * @return String User City
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Method to find if two instance of User Class are equal
	 * @return boolean If Instances are equal return true else false
	 */
	public boolean equals(User s)
	{
		if (name == s.name && s.password == password && s.email == email && s.city == city && s.state == state && s.number == number) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Method to return User details in String format
	 * @return String User details in String format
	 */
	public String toString()
	{
		return name + " " + email + " " + city + " " + state + " " + number;
	}

	/**
	 * Method for the Customer to login in the system
	 * @param username Customer's registered username
	 * @param password Customer's registered password 
	 * @return Customer Customer Instance if login is successful
	 */
	public static Customer login(String username, String password) {
		for (Customer u : User.customers) {
			if (username.equals(u.getName())) {
				if (password.equals(u.getPassword())) {
					return u;	
				}
			}
		}
		return null;
	}

	/**
	 * Method for the Admin to login in the system
	 * @param username Admin's registered username
	 * @param password Admin's registered password 
	 * @return Admin Admin Instance if login is successful
	 */
	public static Admin loginAdmin(String username, String password) {
		for (Admin u : User.admins) {
			if (username.equals(u.getName())) {
				if (password.equals(u.getPassword())) {
					return u;	
				}
			}
		}
		return null;
	}
}
