This package has following classes:

User.java -> Class to Save User Data, extended by Admin and Customer.
Admin.java -> Class to handle data and operations for Admin.
Customer.java -> Class to handle data and operations for Customer.

Cart.java -> Class to handle operations to be done on a cart.

CartProduct.java -> Class to handle indivsual products in the cart, extended by SecurityCamera, Dvr, Accessories

SecurityCamera.java -> Class to handle operations for security camera, extended by AnalogSecurity, DigitalSurveillance and IPSurveillance.
AnalogSecurity.java -> Class to handle operations and data related to Analog Security Cameras.
DigitalSurveillance.java -> Class to handle operations and data related to DigitalSurveillance Cameras.
IPSurveillance.java -> Class to handle operations and data related to IPSurveillance Cameras.

Dvr.java -> Class to handle Dvr data, extended by HybridDvr, AnalogDvr and DigitalDvr.
AnalogDvr.java -> Class to handle data related to Analog Dvr.
DigitalDvr.java -> Class to handle data related to Digital Dvr's.
HybridDvr.java -> Class to handle data related to Hybrid Dvr.

Accessories.java -> Class to handle data and operations for Accessories

InsufficientQuantityException.java -> Class to handle scenarios where quantity of products isnt enough.
InvalidPriceException.java -> Class to handle exceptions on price of products eg. price cannot be less than zero.
InvalidQuantityException.java -> Class to handle exceptions on quantity of products.
InvalidWeightException.java -> Class to handle exceptions on weight of products.

SecurityCameraDemo.java -> Test Program to see the Demo.

Steps to Compile:
----------------

javac *.java 

Run:
---

To see the demo, run:

java SecurityCameraDemo

Generate Javadoc:
-----------------

javadoc -d . *.java
# E-Security-Camera-Store-
# E-Security-Camera-Store-
