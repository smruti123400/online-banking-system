package oop;

public class DriverAccount001 {
	public static void main(String[] args) {
		Account001 ob = new Account001(1111111111l,1234,"sonu",90000d);
				ob.setbalance(10000d);
System.out.println(ob.getbalance());
ob.setPin(1234,8199);
System.out.println(ob.getPin());
	}
}
