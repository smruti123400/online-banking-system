package oop;
import java.util.Scanner;
public class Leaf_yaer 
{
	public static void main(String[] args) 
	{
Scanner b= new Scanner(System.in);
System.out.println("enter the year");
int s=b.nextInt();
if (s%4==0 && s%100==0) 
{
	System.out.println(s + ": is a leaf year");
}
else 
{
System.out.println(s+ ":is not a leaf year");
}
	}

}
