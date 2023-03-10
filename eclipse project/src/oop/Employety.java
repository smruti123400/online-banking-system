package oop;
import java.util.Scanner;
public class Employety 
{
String name;
double salary;
int id;
String dept;
Employety(String name,double salary,int id,String dept)
{
this.name= name;
this.salary= salary;
this.id=id;
this.dept=dept;
}
Employety(int id,String name,String dept)
{
this.name= name;
this.id=id;
this.dept=dept;
}
void edetails()
{
	System.out.println("enter name is : " +name);
	System.out.println("enter id is : "+id);
	System.out.println("enter salary is : "+salary);
	System.out.println("enter dept is :"+dept);
}
public static void main(String[] args) {
	Scanner ob = new Scanner(System.in);
		System.out.println("enter name is");
		String name=ob.next();
		System.out.println("enter id is");
		int id=ob.nextInt();
		System.out.println("enter salary is");
		double salary =ob.nextDouble();
		System.out.println("enter dept is");
		String dept=ob.next();
		Employety e =new Employety(name,salary,id,dept);
		e.edetails();
		
		System.out.println("enter  2nd name is");
         name=ob.next();
		System.out.println("enter 2nd id is");
		salary =ob.nextDouble();
		System.out.println("enter 2nd dept is");
		dept=ob.next();
		Employety d =new Employety(id,name,dept);
		d.edetails();
		System.out.println("first emp details");
		e.edetails();
		System.out.println("first emp details");
		System.out.println("______________");
		d.edetails();
		
		

	}

}
