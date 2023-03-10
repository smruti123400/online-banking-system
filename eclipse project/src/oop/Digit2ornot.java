package oop;
import java.util.Scanner;
public class Digit2ornot
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner (System.in);
		System.out.println("enter digit");
		int n = sc.nextInt();
		if (n > 9 && n <= 99 || n<=-9 && n >=-99) 
		{
		System.out.println(n +" :is a double digit");	
		}
		else
		{
			System.out.println(n + " :is not a double digit");
		}
	}

}
