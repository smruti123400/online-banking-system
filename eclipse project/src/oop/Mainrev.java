package oop;
import java.util.Scanner;
public class Mainrev {
static int reverse(int n) 
{
	int rev=0;
	do 
	{
		int d=n%10;
		rev=rev*10+d;
		n=n/10;	
	}
	while (n!=0);
	return rev;
}
	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("enter the int value");
	int n =sc.nextInt();
	int rv=reverse(n);
	System.out.println("reverse of "+n+ "is" +rv);

	}
	

}
