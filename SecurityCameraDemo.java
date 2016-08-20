import java.io.*;
import java.lang.*;
import java.lang.reflect.*;


public class SecurityCameraDemo {
	public static void main(String[] args) {

		// Display Menu

		System.out.println("System coming up.....\n");
		System.out.println("Creating Admin Profile....Adding Products.\n");
		System.out.println("------------------------------------------\n");
		// Create an admin
		Admin a = new Admin("admin", "admin", "admin@gmail.com", "Illinois", "Chicago", "512-111-111");
		a.register(a);

		// Add products
		System.out.println("Admin is Adding Products in the System");
		System.out.println("------------------------------------\n");
		Accessories accessory = new Accessories("Brackets", 15.25, "Flash Bracket", 1.5, 1);

		SecurityCamera camera = new SecurityCamera(13.5, "hdmi", 55, 50.99, "CP Plus", 20, 2);
		DigitalSurveillance surCamera = new DigitalSurveillance("testformat" , 72, "hdmi", 50, 500.00, "Surveillance Camera", 1.5, 2);
		AnalogSecurity analogCamera = new AnalogSecurity(110, 50, "mp3", 90, 450.00, "Analog Security Camera", 1.5, 2);
		IPSurveillance ipCamera	= new IPSurveillance("192.168.1.1", 34, "rgb", 45, 300.00, "IP surveillance Camera", 2.5, 1);

		DigitalDvr digitalDvr = new DigitalDvr(120, "sense", 70.00, "digital", 240.56, "Digital Dvr", 3.5,2);
		AnalogDvr analogDvr = new AnalogDvr(10.00, 20.00, 70.00, "analog", 240.56, "Analog Dvr", 3.5,2);	
		HybridDvr hybridDvr = new HybridDvr("hybrid", "sense", 70.00, "hyrbid", 240.56, "Hybrid Dvr", 3.5,2);		

		a.addProduct(accessory);
		a.addProduct(camera);
		a.addProduct(surCamera);
		a.addProduct(analogCamera);
		a.addProduct(ipCamera);
		a.addProduct(digitalDvr);
		a.addProduct(analogDvr);
		a.addProduct(hybridDvr);

		System.out.println("Displaying Products Available in the System");
		System.out.println("-----------------------------------------\n");
		Admin.displayAllProducts();


		System.out.println("Creating a user with username userA");
		System.out.println("---------------------------------\n");
		Customer user = new Customer("UserA", "userA", "userA@gmail.com", "TestState", "TestCity", "512-113-123");


		System.out.println("Logging in with userA");
		System.out.println("---------------------------------\n");

		System.out.println("Login Successful..........\n");

		System.out.println("Adding products in the cart");
		System.out.println("---------------------------------\n");
		try {
			user.login("UserA", "userA");
			user.addProduct(accessory);
			user.addProduct(camera);
			user.addProduct(ipCamera);
			user.addProduct(hybridDvr);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Displaying Products in the Cart");
		System.out.println("---------------------------------\n");
		user.displayCart();

		System.out.println("Deleting two products from the Cart");
		System.out.println("---------------------------------\n");
		user.deleteProduct(ipCamera);
		user.deleteProduct(hybridDvr);

		System.out.println("Displaying Products after deletion");
		System.out.println("---------------------------------\n");
		user.displayCart();

		System.out.println("User is done... Checkout");
		System.out.println("---------------------------------\n");
		user.checkout();

		System.out.println("Displaying cart after checkout");
		System.out.println("---------------------------------\n");
		user.displayCart();

		System.out.println("Displaying Products Available in System after Checkout");
		System.out.println("-----------------------------------------------------\n");
		Admin.displayAllProducts();

		System.out.println("\nTry adding a product whose quantity is exhausted");
		System.out.println("-----------------------------------------------------\n");
		try {
			user.login("UserA", "userA");
			user.addProduct(accessory);
		} catch (Exception e) {
			e.printStackTrace();
		}


		// The CODE Below is a Menu Driven Program to Accomplish the Operations described Above
		/*
		System.out.println("Please Register a New User\n"); 
		BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));

		while(true) {	
			System.out.println("Please Select The Desired Role");
			System.out.println("Please enter 1 for Admin and 2 for Customer");

			String role = bufferRead.readLine();
			switch(role) {
				case "1": 
					System.out.println("Press 1 to Register a New Admin");
					System.out.println("Press 2 to login as Admin");
					role = bufferRead.readLine();
					System.out.println("Enter Username:");	
					String user = bufferRead.readLine();
					System.out.println("Enter Password:");	
					String pass = bufferRead.readLine();
					switch(role) {
						case "1":
							System.out.println("Enter Email");	
							String email = bufferRead.readLine();
							System.out.println("Enter State");	
							String state = bufferRead.readLine();
							System.out.println("Enter City");	
							String city = bufferRead.readLine();
							System.out.println("Enter Contact Number");	
							String number = bufferRead.readLine();
							Admin ad = new Admin(user, pass, email, state, city, number);
							ad.register(ad);
							System.out.println("An admin has been registered successfully");
						case "2":
							Admin admin = User.loginAdmin(user, pass);
							if (admin == null) {
								System.out.println("Invalid Password, Please try again");
							}
							System.out.println("Login Successful");
							System.out.println("Please select an operation to be performed");
							System.out.println("Enter 1 to Add a Product");
							System.out.println("Enter 2 to Delete a Product");
							System.out.println("Enter 3 to Update a Product");
							System.out.println("Enter 4 to Update a Customer's Information");
							String option = bufferRead.readLine();

							switch(option) {
								case "1": System.out.println("Press 1 for Entering Accessories");
									  System.out.println("Press 2 for Entering Security Camera");
									  System.out.println("Press 3 for Entering DVR");
									  String cameraType = bufferRead.readLine();
									  System.out.println("Enter the Description");
									  String desc = bufferRead.readLine();
									  System.out.println("Enter the Price");
									  String price = bufferRead.readLine();
									  System.out.println("Enter the Weight");
									  String weight = bufferRead.readLine();
									  System.out.println("Enter the Quantity");
									  String quantity = bufferRead.readLine();
									  System.out.println("Enter the Type");
									  switch(cameraType) {
										  case "1": 
											  String type = bufferRead.readLine();
											  Accessories acc = new Accessories(type, Double.parseDouble(price), desc, Double.parseDouble(weight), Integer.parseInt(quantity));
											  admin.addProduct(acc);
											  System.out.println("Added product successfully");
											  break;
										  case "2": 
											  System.out.println("Press 1 for Analog Security Camera");
											  System.out.println("Press 2 for IP Surveillance Camera");
											  System.out.println("Press 3 for Digital Surveillance Camera");
											  System.out.println("Added product successfully");
											  String securityCameraType = bufferRead.readLine();

											  System.out.println("Enter the Resolution");
											  String res = bufferRead.readLine();
											  System.out.println("Enter the Connectivity");
											  String conn = bufferRead.readLine();
											  System.out.println("Enter the Mega Pixels");
											  String mp = bufferRead.readLine();

											  switch(securityCameraType) {
												  case "1":
													  System.out.println("Enter the Signal Strength");
													  String strength = bufferRead.readLine();
													  AnalogSecurity as = new AnalogSecurity(Double.parseDouble(strength), Double.parseDouble(res), conn, Double.parseDouble(mp), Double.parseDouble(price), desc, Double.parseDouble(weight), Integer.parseInt(quantity));
													  admin.addProduct(as);
													  break;
												  case "2":
													  System.out.println("Enter the IP Address");
													  String addr = bufferRead.readLine();
													  IPSurveillance is = new IPSurveillance(addr, Double.parseDouble(res), conn, Double.parseDouble(mp), Double.parseDouble(price), desc, Double.parseDouble(weight), Integer.parseInt(quantity));
													  admin.addProduct(is);
													  break;
												  case "3":
													  System.out.println("Enter the IP MediaFormat");
													  String format = bufferRead.readLine();
													  DigitalSurveillance ds = new DigitalSurveillance(format, Double.parseDouble(res), conn, Double.parseDouble(mp), Double.parseDouble(price), desc, Double.parseDouble(weight), Integer.parseInt(quantity));
													  admin.addProduct(ds);
													  break;
												  default:
													  System.out.println("Invalid Camera Type");
											  }
									  }
									  break;
								case "2":
									  System.out.println("Add the description of the product to be deleted");
									  desc = bufferRead.readLine();
									  Admin.deleteProduct(desc);
									  break;
								case "3":
									  System.out.println("Enter the desription of the product to be updated");
									  desc = bufferRead.readLine();
									  System.out.println("Enter the field to be updated");
									  String field = bufferRead.readLine();
									  CartProduct cp = Admin.getProductFromDesc(desc);	
									  Class c = cp.getClass();
									  Method[] allMethods = c.getDeclaredMethods();	
									  for (Method m : allMethods) {
										  String mname = m.getName();
										  if (mname.contains(field)) {
											  m.invoke(new CartProduct(), field);	
											  break;
										  }
									  }
									  break;
								case "4":
									  System.out.println("Enter the Username to be modified");
									  desc = bufferRead.readLine();
									  System.out.println("Enter the field to be updated");
									  field = bufferRead.readLine();
									  allMethods = us.getClass().getDeclaredMethods();	
									  for (Method m : allMethods) {
										  String mname = m.getName();
										  if (mname.contains(field)) {
											  m.invoke(field);	
											  break;
										  }
									  } 
									  break;
								default:
									  System.out.println("Invalid Value");
									  break;

							}
					}
				case "2":
					System.out.println("Press 1 to Register a New User");
					System.out.println("Press 2 to login as User");
					role = bufferRead.readLine();
					System.out.println("Enter Username:");	
					user = bufferRead.readLine();
					System.out.println("Enter Password:");	
					pass = bufferRead.readLine();
					switch(role) {
						case "1":
							System.out.println("Enter Email");	
							String email = bufferRead.readLine();
							System.out.println("Enter State");	
							String state = bufferRead.readLine();
							System.out.println("Enter City");	
							String city = bufferRead.readLine();
							System.out.println("Enter Contact Number");	
							String number = bufferRead.readLine();
							Customer customer = new Customer(user, pass, email, state, city, number);
							customer.register(customer);
							System.out.println("Customer has been registered successfully");
						case "2":
							customer = User.login(user, pass);
							if (customer == null) {
								System.out.println("Invalid Password, Please try again");
							}
							System.out.println("Login Successful");
							System.out.println("Please select an operation to be performed");
							System.out.println("Enter 1 for Viewing all Products");
							System.out.println("Enter 2 for Adding a Product in the Cart");
							System.out.println("Enter 3 for Deleting a Product from the Cart");
							System.out.println("Enter 4 for Displaying the Cart");
							System.out.println("Enter 5 for Checkout");
							String option = bufferRead.readLine();
							switch(option) {
								case "1": 
									Admin.displayAllProducts();
									break;
								case "2": System.out.println("Press 1 for Entering Accessories");
									  System.out.println("Press 2 for Entering Security Camera");
									  System.out.println("Press 3 for Entering DVR");
									  String cameraType = bufferRead.readLine();
									  System.out.println("Enter the Description");
									  String desc = bufferRead.readLine();
									  System.out.println("Enter the Price");
									  String price = bufferRead.readLine();
									  System.out.println("Enter the Weight");
									  String weight = bufferRead.readLine();
									  System.out.println("Enter the Quantity");
									  String quantity = bufferRead.readLine();
									  System.out.println("Enter the Type");
									  switch(cameraType) {
										  case "1": 
											  String type = bufferRead.readLine();
											  Accessories acc = new Accessories(type, Double.parseDouble(price), desc, Double.parseDouble(weight), Integer.parseInt(quantity));
											  customer.addProduct(acc);
											  System.out.println("Added product successfully");
											  break;
										  case "2": 
											  System.out.println("Press 1 for Analog Security Camera");
											  System.out.println("Press 2 for IP Surveillance Camera");
											  System.out.println("Press 3 for Digital Surveillance Camera");
											  System.out.println("Added product successfully");
											  String securityCameraType = bufferRead.readLine();

											  System.out.println("Enter the Resolution");
											  String res = bufferRead.readLine();
											  System.out.println("Enter the Connectivity");
											  String conn = bufferRead.readLine();
											  System.out.println("Enter the Mega Pixels");
											  String mp = bufferRead.readLine();

											  switch(securityCameraType) {
												  case "1":
													  System.out.println("Enter the Signal Strength");
													  String strength = bufferRead.readLine();
													  AnalogSecurity as = new AnalogSecurity(Double.parseDouble(strength), Double.parseDouble(res), conn, Double.parseDouble(mp), Double.parseDouble(price), desc, Double.parseDouble(weight), Integer.parseInt(quantity));
													  customer.addProduct(as);
													  break;
												  case "2":
													  System.out.println("Enter the IP Address");
													  String addr = bufferRead.readLine();
													  IPSurveillance is = new IPSurveillance(addr, Double.parseDouble(res), conn, Double.parseDouble(mp), Double.parseDouble(price), desc, Double.parseDouble(weight), Integer.parseInt(quantity));
													  customer.addProduct(is);
													  break;
												  case "3":
													  System.out.println("Enter the IP MediaFormat");
													  String format = bufferRead.readLine();
													  DigitalSurveillance ds = new DigitalSurveillance(format, Double.parseDouble(res), conn, Double.parseDouble(mp), Double.parseDouble(price), desc, Double.parseDouble(weight), Integer.parseInt(quantity));
													  customer.addProduct(ds);
													  break;
												  default:
													  System.out.println("Invalid Camera Type");
											  }
									  }
									  break;
								case "3":
									  System.out.println("Add the description of the product to be deleted");
									  desc = bufferRead.readLine();
									  Admin.deleteProduct(desc);
									  break;
								case "4":
									  customer.displayCart();
								case "5":
									  customer.checkout();

							}
						default:
							System.out.println("Invalid Option");
					}
					break;
				default: 
					System.out.println("Invalid Option");
			}
		}*/
	}
}
