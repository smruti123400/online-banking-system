package oop;

public class Samsung extends Gdget009 {
	String screen ;
	Samsung(String brand,int price,String colour,String screen)
	{
	this.brand= brand;
	this.price=price;
	this.colour =colour;
	this.screen=screen;
	}
	void DetailsSamsung()
	{
		System.out.println(brand);
		System.out.println(price);
		System.out.println(colour);
	System.out.println(screen);
	

	}

}
