package oop;
import java.util.Scanner;
public class Mainpalindrome {
static boolean palindrome(int su)
{
	int rev =0;
	int temp=su;
	do
	{
	int d=	su % 10 ;
	rev=rev*10+d;
	su=su/10;
	}
	while(su!=0);
	return rev==temp;
}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the int value");
int su =sc.nextInt();
    boolean pa=palindrome(su);
    if (pa==true) 
    {
    	System.out.println("palindrome number");
    }
    else 
    {
    	System.out.println("not a palindrome number");
    }
	}

}
