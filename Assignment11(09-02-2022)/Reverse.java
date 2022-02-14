import java.util.ArrayList;
import java.util.Collections;

public class Reverse {

	public static void main(String[] args) {
      ArrayList<Integer> b = new ArrayList();
      b.add(10);
      b.add(60);
      b.add(70);
      b.add(40);
      b.add(100);
      Collections.sort(b,Collections.reverseOrder());
      System.out.println("The list after reversing :" +b);
	}

}
