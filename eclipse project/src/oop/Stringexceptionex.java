package oop;
public class Stringexceptionex {
	public static void main(String[] args) {
		String s1="java";
		char c ='a';
		try 
		{
		 c=s1.charAt(4);
		 System.out.println("alex");
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		finally
		{
		System.out.println(s1.toUpperCase());
		System.out.println(s1.concat("language"));
		}
	}
}
