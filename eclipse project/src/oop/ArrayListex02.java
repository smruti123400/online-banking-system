package oop;
import java.util.ArrayList;
public class ArrayListex02 {
	public static void main(String[] args) {
		ArrayList<Object>ob=new ArrayList<Object>();
		ob.add(100);
		ob.add("paradeep");
		ob.add('a');
		ob.add(10000000d);
		ob.add(true);
		ob.add(111.999f);
		ob.add("ACHARYA");
		ArrayList<Object>ob1=new ArrayList<Object>();
ob1.addAll(ob);
for(Object i:ob)
{
System.out.println(i);
	}

}
}
