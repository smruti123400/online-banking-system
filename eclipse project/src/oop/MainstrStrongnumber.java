package oop;
import java.util.Scanner;
public class MainstrStrongnumber {
	static int getfact(int x)
	{
	int fact=1;
	while(x>1){
	fact =fact*x;
	x--;
	}
	return fact;
	}
static boolean isstrong(int n) 
{
	int sum =0;
	int num =n;
	do {
		int d= n%10;
		sum=sum +getfact(d);
		n=n/10;
	}
	while (n!=0);
	return num==sum;
	
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the int value");
         int n =sc.nextInt();
         boolean rs=isstrong(n);
         if (rs==true)
         {
        	 System.out.println("number is strong number");
         }
         else
         {
        	 System.out.println("number is not a strong number");
         }
	}

}
