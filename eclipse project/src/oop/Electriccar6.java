package oop;

public class Electriccar6 extends Car0 {
double chargecapacity;
Electriccar6(String brand,String colour,int price,String model,double chargecapacity)
{
super(brand,colour,price,model);
this.chargecapacity=chargecapacity;
	}
void showElectriccar6() {
	System.out.println("vehicle brand is: "+brand);
	System.out.println("vehicle colour is :"+colour);
	System.out.println("vehicle price is :"+price);
	System.out.println("vehicle model is: "+model);
	System.out.println("vehicle chargecapacity:" +chargecapacity);
}
}