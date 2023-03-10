package oop;

public class Constructoroverloading 
{
	String name;
	int id;
	int age;
	long phno;
	Constructoroverloading (String name,int id,long phno)
	{
		this.name=name;
		this.id=id;
		this.phno=phno;
	}
	Constructoroverloading (int age,String name,long phno)
	{
		this.name=name;
		this.age=age;
		this.phno=phno;
	}
	Constructoroverloading (String name,long phno)
	{
		this.name=name;
		this.phno=phno;
	}
	void details()
	{
		System.out.println("student name is:" +name);
		System.out.println("student id is:" +id);
		System.out.println("student age is:" +age);
		System.out.println("student contact no is:" +phno);
	}
	public static void main(String[] args) {
Constructoroverloading a =new Constructoroverloading ("nita",22,987654321);
Constructoroverloading b =new Constructoroverloading ("sita",2588,1234567890);
Constructoroverloading c =new Constructoroverloading ("arjun",8907654321l);
Constructoroverloading d =new Constructoroverloading ("soni",2644,3214567890l);
a.details();
b.details();
	}

}
