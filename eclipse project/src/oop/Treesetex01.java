package oop;
import java .util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Iterator;
public class Treesetex01 {
	public static void main(String[] args) {
		TreeSet<Object>t=new TreeSet<Object>();
	t.add(123);
	t.add(200);
	t.add(100);
	t.add(99);
	t.add(999);
	System.out.println("printing using iterator");
	Iterator<Object>i=t.iterator();
	while(i.hasNext()) 
	{
		System.out.println(i.next());
	}
	System.out.println("printing decission order" +t.descendingSet());
TreeSet<String>t2=new TreeSet<String>();
t2.add("btm");
t2.add("qspider");
t2.add("qspider");
t2.add("java");
t2.add("jspider");
System.out.println("printing using loop");
for(String s:t2) {
	System.out.println(s);
}
	}

}
