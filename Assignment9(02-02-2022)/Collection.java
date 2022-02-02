import java.util.ArrayList;
import java.util.Iterator;

public class Collection {

	public static void main(String[] args) 
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		Iterator<String> itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next());
		}
	}

}
