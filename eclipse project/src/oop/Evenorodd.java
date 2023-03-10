package oop;
import java.util.Scanner;
public class Evenorodd 
{
	public static void main(String[] args) 
	{
Scanner sc = new Scanner(System.in);
System.out.println("enter the int value");
int n = sc.nextInt();
if(n%2==0) 
{
System.out.println(n+ "even number");
	}
else {
	System.out.println(n+ "odd number");
}
}
}