package project;

import java.util.Iterator;
import java.util.LinkedList;

public class Reverse {
public static void main(String[] args) 
{
	LinkedList<String> linkedList = new LinkedList<>();
	linkedList.add("Bye");
	linkedList.add("Hi");
	Iterator<String> iterator = linkedList.descendingIterator();
	while(iterator.hasNext())
	{
		System.out.println(iterator.next());
	

	}

}
}
