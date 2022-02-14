import java.util.Scanner;

public class Cases {
	
           public static void main(String[] args) {
            
        	   char ch;
        		Scanner s = new Scanner(System.in);
        	    System.out.print("Enter the character :");
        	    ch=s.next().charAt(0);
            if(ch>='A' && ch<='Z')
            {
            	System.out.print(ch +"     " + "It is an uppercase letter");
            }
            else if(ch>='a'&&ch<='z')
            {
            	System.out.print(ch +"  "+  "It is an lowercase letter");
            }
            else
            {
              System.out.println( ch+"    " + "It is a digit");  	
           }         	
}
}