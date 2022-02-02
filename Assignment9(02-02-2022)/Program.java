import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList();
		list.add("P");
		list.add("R");
		list.add("A");
		list.add("V");
		list.add("E");
		list.add("E");
		list.add("N");
		String s = list.get(4);
		System.out.println(list);		
		System.out.println(s);
	}

}
