package oop;
import java.util.Scanner;
public class Daysinmonthp 
{
	public static void main(String[] args) 
	{
Scanner sc = new Scanner(System.in);
System.out.println("enter the days");
int n =sc.nextInt();
if(n==1 || n==3 || n==5|| n==7 || n==8 || n== 10 || n==12) 
{
	System.out.println("31 days");
}
else if(n ==4 || n==6|| n==9 ||n==11)
{
	System.out.println("30days");
}
else if(n==2)
{
	System.out.println("28 || 29 days");
}
else 
{
	System.out.println("invalid");
}
	}

}
