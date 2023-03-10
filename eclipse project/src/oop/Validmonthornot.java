package oop;
import java.util.Scanner;
public class Validmonthornot 
{
	public static void main(String[] args) 
	{
	Scanner ob = new Scanner(System.in);
	System.out.println("enter the month number");
	int n = ob.nextInt();
	if (n>0 && n<13)
	{
System.out.println("month is valid");
	}
	else
	{
		System.out.println("month is invalid");
	}
}
}