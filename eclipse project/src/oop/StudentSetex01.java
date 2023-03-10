package oop;
import java.util.HashSet;
import java.util.Iterator;
public class StudentSetex01 
{
	public static void main(String[] args) 
	{
		HashSet<Object>h=new HashSet<Object>();
		h.add(new Student(123,riya));
		h.add(new Student(124,kiya));
		h.add(new Student(125,siya));
		h.add(new Student(126,priya));
		System.out.println("printing"+h);
		Iterator<Object>l=h.iterator();
while(i.hasNext()) 
{
	Object o=i.next();
	if(o.equals("BTM"))
	{
		i.remove();
	}
	System.out.println("printing using loop");
	for(Object k:h) 
	{
	System.out.println(k);	
	}
}
		
}
	}


