package oop;
import java.util.Scanner;
public class Dynamicex {
	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		
				System.out.println("enter name");
		String name = ob.next();
		
		System.out.println("enter place");
		String place = ob.next();
		
		System.out.println("enter age");
		int age = ob.nextInt();
		
		System.out.println("enter salary");
		double salary = ob.nextDouble();
		 
		System.out.println("enter a single character");
		char c = ob.next().charAt(0);
		
		System.out.println("enter percentage");
		float p =ob.nextFloat();
		
		System.out.println("reading completed");
		System.out.println("printing the values");
		System.out.println(name+" "+place+" "+age+" "+salary+" "+c+" "+p);
		
		
		

	}

}
