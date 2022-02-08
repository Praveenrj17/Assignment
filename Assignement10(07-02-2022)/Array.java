package location;

import java.util.ArrayList;

public class Array {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Red");
		list.add("Yellow");
		list.add("Blue");
		System.out.println("The content is:" +list);
		String[] myArray = new String[list.size()];
		list.toArray(myArray);
		for(int i=0;i < myArray.length;i++)
		{
			System.out.println("Element is"+i+"::"+myArray[i]);
		}
		
		
		
		
		
		
		

	}

}
