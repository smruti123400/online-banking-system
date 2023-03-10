package oop;

public class Car0 extends Vehicle9213 {
	String model;
	Car0(String brand,String colour,int price,String model)
	{
super(brand,colour,price);
this.model=model;
	}
	void detailsCar0()
	{
		System.out.println("vehicle brand is: "+brand);
		System.out.println("vehicle colour is :"+colour);
		System.out.println("vehicle price is :"+price);
		System.out.println("vehicle model is: "+model);
	}
}
