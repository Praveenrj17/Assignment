package java_area_perimeter;

public class Reverse {

	public static void main(String[] args) {
		String s1="java program";
		int size=s1.length();
		System.out.println("Reverse string:" +s1 +"" +"is");
		for(int i=0;i<=size;i++)
		{
			System.out.println(s1.charAt(s1.length()-i-1));
		}
		

	}

}
