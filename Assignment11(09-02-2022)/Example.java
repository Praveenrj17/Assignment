import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Example {

	public static void main(String[] args) {
        HashSet<String> obj = new HashSet<>();
        obj.add("Your");
        obj.add("Time");
        obj.add("Starts");
        obj.add("Again");
        System.out.println("The HashSet is: " +obj);
        Set<String> HashSetToTreeSet = new TreeSet<>(obj);
        HashSetToTreeSet.addAll(obj);
        System.out.println("The Treeset is :" +HashSetToTreeSet);
        
        
	}

}
