package oop;
import java.util.*;
public class Hashsetex01 
{
	public static void main(String[] args) 
	{
	HashSet<String>h= new HashSet<String>();
	h.add("sql");
	h.add("java");
	h.add("manual");
	h.add("sql");
	h.add("javascript");
	h.add("web");
	h.add("web");
	
	
for(String str:h) {
	System.out.println(str);
	}

}
}