package oop;
import java.util.Scanner;
public class Singledigit
{
	public static void main(String[] args)
	{
Scanner db =new Scanner(System.in);
System.out.println("enter the int value");
int n = db.nextInt();
if(n <10 && n> 10) 
{
	System.out.println(n + ":is a single digit number");
}
else
{
	System.out.println(n + ":is not a single digit number");
}
	}

}
