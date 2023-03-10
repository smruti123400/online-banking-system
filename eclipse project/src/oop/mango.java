package oop;

public class mango extends fruit{
	String origin;

	public mango(String colour, float price,String origin) {
		super(colour, price);
		this.origin =origin;
	}
      void displaymango()
      {
System.out.println("origin is " +origin);
	}

}
