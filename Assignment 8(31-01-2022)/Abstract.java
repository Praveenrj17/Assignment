package location;
abstract class Number
{
	abstract void brake();
}
class One extends Number
{
	public void brake()
	{
		System.out.println("First");
	}
}
class Two extends Number
{
	public void brake()
	{
		System.out.println("Third");
	}
}
class Three extends Number
{
	public void brake()
	{
		System.out.println("Second");
	}
}
public class Abstract {

	public static void main(String[] args) 
	{
         Three n1 = new Three();
         Two n2 = new Two();
         One n3 = new One();
         n3.brake();
         n2.brake();
         n1.brake();
         n3.brake();
         n2.brake();
         n2.brake();
       }

}
