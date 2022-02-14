import java.util.Arrays;

public class Alphabets {

	public static void main(String[] args) {
		int n =5;
		String arr[] = {"Power","Stun","Thunder","AWM","Winner"};
         Arrays.sort(arr);
         System.out.println("The names in Alphabetic orders are:");
         for(int i=0;i<n;i++)
         {
        	 System.out.println(arr[i]);
         }
	}

	
}
