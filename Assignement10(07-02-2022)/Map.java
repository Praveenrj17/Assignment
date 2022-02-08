package example3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Map {

	public static void main(String[] args) {
		HashMap<Integer,String> m = new HashMap<Integer,String>();
		m.put(3,"Hai");
		m.put(4,"Hello");
		m.put(5, "World");
		Set<Entry<Integer,String>> set = m.entrySet();
		Iterator<Entry<Integer,String>> i = set.iterator();
		while(i.hasNext())
		{
			Entry<Integer, String> e = i.next();
			System.out.println(e.getKey()+ "." +e.getValue());
			
		}
		
	}

}
