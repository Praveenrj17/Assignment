package java_area_perimeter;
class Program
{
	public void display()
	{
		System.out.println("Java Programming Language");
	}
}
class Language extends Program
{
	public void display()
	{
		System.out.println("Common English Language");
	}
}

public class Overriding {

	public static void main(String[] args) {
	 Language j1 = new Language();
	 j1.display();
	 Program l1 = new Program();
	 l1.display();

	}

}
