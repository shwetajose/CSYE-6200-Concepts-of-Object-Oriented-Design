package edu.neu.csye6200.assignment1;

public class Cart {

	public final static int MAJOR_VERSION = 1;
	public final static int MINOR_VERSION = 0;
	public final static String VERSION = Integer.valueOf(MAJOR_VERSION).toString()
			+ "."
			+ Integer.valueOf(MINOR_VERSION).toString();
	//The data members help do the calculation of what I am shopping and keep track of my change
	
	private double myCash;
	private double myTotal;
	private double myChange;
	
	/**
	 * Object initialization block
	 * Executed with each constructor
	 * 
	 * If there's nothing in the default constructor (public Cart()) then the object initialization block will be used  
	 */
	
	{
	
		this.myCash = 20;
		this.myTotal = 0;
		this.myChange = 0;
	}
	
	
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Cart(double myCash, double myTotal, double myChange) {
		super();
		this.myCash = myCash;
		this.myTotal = myTotal;
		this.myChange = myChange;
	}


	public double getMyCash() {
		return myCash;
	}


	public void setMyCash(double myCash) {
		this.myCash = myCash;
	}


	public double getMyTotal() {
		return myTotal;
	}


	public void setMyTotal(double myTotal) {
		this.myTotal = myTotal;
	}


	public double getMyChange() {
		return myChange;
	}


	public void setMyChange(double myChange) {
		this.myChange = myChange;
	}


    //If you don't implement your own toString, you get the one inherited from Object class 
	@Override
	public String toString() {
		/**
		 * using StringBuilder instead of the regular toString expression
		 */
		
		StringBuilder sb = new StringBuilder("Cart");
		
		sb.append(" [version ").append(VERSION).append("]: ");
		sb.append("\n\tCash").append(this.myCash);
		sb.append("\n\tTotal").append(this.myTotal);
		sb.append("\n\tChange").append(this.myChange);
		
		return sb.toString();
		//return "Cart [myCash=" + myCash + ", myTotal=" + myTotal + ", myChange=" + myChange + "]";
	}
	
	
	/**
	 * calculate silly checkout:
	 */
	public void sillyCheckout(double cash, double price, double total, double change) {
		
		total += price;
		change = cash - total;
		
	}
	
	
	/**
	 * calculate smart checkout:
	 */
	public double checkout(Cart myCart, Item myItem) {
		
		myCart.myTotal += myItem.getPrice();
		myCart.myChange = myCart.myCash - myTotal;
		
		return myCart.getMyChange();
	}
	
	
	public static void demo() {
		
		System.out.println("\n\t" + Cart.class.getName() + "demo....");
		
		/**
		 * instantiate (create) Cart object using default constructor 
		 */
		
		Item bread = new Item(1, 1.49, "Wheat Bread", 1); // Created an item object for shopping
		Item rice = new Item(1, 5.99, "Basmati", 1);
		Item milk = new Item(1, 2.99, "Almond Milk", 1);
		
		/*
		 * Show all items to be purchased
		 */
		
		System.out.println("\n Itemized receipt");
		System.out.println("\n\t Item name: " + bread.getName() + "\t Item cost: " + bread.getQuantity() * bread.getPrice());
		System.out.println("\n\t Item name: " + rice.getName() + "\t Item cost: " + rice.getQuantity() * rice.getPrice());
		System.out.println("\n\t Item name: " + milk.getName() + "\t Item cost: " + milk.getQuantity() * milk.getPrice());
		
		Cart myShoppingCart = new Cart();
		
		double cash = 20;
		double total = 0;
		double change = 0;
		
		/**
		 * Cart call silly for each item
		 */
		
		myShoppingCart.sillyCheckout(cash, bread.getPrice(), total, change);
		myShoppingCart.sillyCheckout(cash, rice.getPrice(), total, change);
		myShoppingCart.sillyCheckout(cash, milk.getPrice(), total, change);
		
		myShoppingCart.myChange = myShoppingCart.checkout(myShoppingCart,  bread);
		myShoppingCart.myChange = myShoppingCart.checkout(myShoppingCart,  rice);
		myShoppingCart.myChange = myShoppingCart.checkout(myShoppingCart,  milk);
		
		/*
		 * Show totals
		 */
		System.out.println("\n Silly checkout TOTAL and CHANGE:");
		System.out.println("\n\tTOTAL" + total);
		System.out.println("\n\tCHANGE" + change);
		
		
		System.out.println("\n Smart checkout TOTAL and CHANGE:");
		System.out.println("\n\tTOTAL:" + myShoppingCart.myTotal);
		System.out.println("\n\tCHANGE:" + myShoppingCart.myChange);
		
		
		//System.out.println(myShoppingCart); //Whenever you print an object, you call toString implicitly
		//System.out.println(myShoppingCart.toString());  // Calling toString explicitly
		
		System.out.println("\n\t" + Cart.class.getName() + "demo....done!!");
		
		
	}
	
	
}
