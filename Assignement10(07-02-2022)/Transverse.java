package example;

import java.util.HashSet;
import java.util.Iterator;

public class Transverse {

	public static void main(String[] args) {
		HashSet<String> has = new HashSet<>();
		has.add("One");
		has.add("Two");
		Iterator<String> i =  has.iterator(); 
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
		

	}

}
