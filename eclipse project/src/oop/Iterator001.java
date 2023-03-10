package oop;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.ArrayList;
public class Iterator001 {
	public static void main(String[] args) {
		ArrayList<Object>al=new ArrayList<Object>();
		al.add("JUNUN");
		al.add(26);
		al.add(7f);
		al.add(1111111111);
		al.add("");
		Iterator i=al.iterator();
while(i.hasNext()) 
{
	System.out.println(i.next());
}
     ListIterator i=al.listIterator();
     while(i.hasprevious)
     {
    	 System.out.println(i.previuos);
     }
	}

}
