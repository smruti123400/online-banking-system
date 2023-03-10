package oop;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListex 
{
	public static void main(String[] args) 
	{
		ArrayList<Object> ob =new ArrayList<Object>();
		ob.add(10);
		ob.add("JUNUN");
		ob.add(17);
		ob.add(true);
		ob.add(111111d);
		ob.add('Q');
		ob.add("ACHARYA");
		Iterator i=ob.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
