package oop;
import java.util.Scanner;
class Shoes
{
	static String brand;
	int price;
	String type;

Shoes(String brand,int price,String type)
{
this.brand =brand;
this.price =price;
this.type = type;
}
Shoes(int price,String type)
{
this.price =price;
this.type =type;
}
void details()
{
	System.out.println("shoes brand is :" +brand);
	System.out.println("shoes price is :" +price);
	System.out.println("shoes type is :" +type);
}
public static void main(String[] args) {
	Scanner ob = new Scanner(System.in);
	System.out.println("shoes brand is");
	String name = ob.next();
	System.out.println("shoes price is ");
	int price =ob.nextInt();
	System.out.println("shoes type is");
	String type =ob.next();
	Shoes q = new Shoes(brand,price,type);
	q.details();
	
	System.out.println("2nd shoes brand is");
	name=ob.next();
	System.out.println("2nd shoes price is ");
	price =ob.nextInt();
	System.out.println("2nd shoes type is");
	type =ob.next();
	
	Shoes b = new Shoes(price,type);
	b.details();
	System.out.println("shoes brand is");
	q.details();
	System.out.println("2nd shoes brand is");
	System.out.println("____________");
	b.details();
	
	}

}
