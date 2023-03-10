package oop;
import java.util.Scanner;
public class Mainhappy {
	static int happy(int n) 
	{
		while(n>9);
		int sum=0;
		do {
			int d=n%10;
			sum=sum+d*d;
			n=n/10;
		}
			while(n!=0);
			n=sum;
			return n;
		}

	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("enter the int value");
	int n =sc.nextInt();
	int hp=happy(n);
	System.out.println("happy number is :"+hp);

	}

}
