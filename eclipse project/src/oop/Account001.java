package oop;

public class Account001 {
long accno;
private int pin;
String acholder;
private double balance;
Account001(long accno,int pin,String acholder,double balance)
{
	this.accno=accno;
	this.pin=pin;
	this.acholder=acholder;
	this.balance=balance;
}
public int getPin()
{
	return pin;
}
public void setPin(int pin,int newpin)
{
	if(this.pin==pin) {
		this.pin=newpin;
	}
	else {
		System.out.println("invalid pin");
	}
}
public double getbalance()
{
	return balance;
}
public void setbalance(double amount)
{
	balance =balance+amount ;
			System.out.println("ammount credit to your account");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
