package oop;

public class CarGunu extends VehicleSonu
{
	String model;
	CarGunu(String brand,String colour,double price,String model)
	{
		super(brand,colour,price);
		this.model=model;
	}
	CarGunu(String brand,String model,double price)
	{
		this (brand,null,price,model);
	}
	CarGunu(double price)
	{
		this (null,null,price);
	}
	void showCarGunu() {
}
}




