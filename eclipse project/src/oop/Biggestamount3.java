package oop;
import java.util.Scanner;
public class Biggestamount3
{
	public static void main(String[] args) 
	{
		Scanner vhgg =new Scanner(System.in);
		System.out.println("enter the 3 int digit");
		int l = vhgg.nextInt();
		int k = vhgg.nextInt();
		int c = vhgg.nextInt();
		int high = l;
		if(k > high) 
		{
		high = k;
	}
        if(c > high)
        {
        	high = c;
        }
        System.out.println("biggest is :"+high);
	}
}
