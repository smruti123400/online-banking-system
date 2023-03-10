package oop;
import java.util.Scanner;
public class passorfail 
{
	public static void main(String[] args) 
	{
Scanner ob =new Scanner(System.in);
System.out.println("enter four int value");
int math =  ob.nextInt();
int phy  =  ob.nextInt();
int chem =  ob.nextInt();
int bio  =  ob.nextInt();
if(math>35 && phy >35 && chem>35 && bio > 35) 
{
	System.out.println("pass");
}
else
{
	System.out.println("fail");
}
	}

}
