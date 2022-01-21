package java_area_perimeter;

public class Triangle_Area_Perimeter {
	int x,y,z;
	public int Area_Triangle() {
		int x = (y*z)/2;
		return x;
	}
	public int Perimeter_Triangle() 
	{
			
		int p = (x+y+z);
			
			return p;
			}			
		
	

	public static void main(String[] args) {
		Triangle_Area_Perimeter t = new Triangle_Area_Perimeter(); 
		t .x = 3;
		t .y = 4;
		t .z = 5;
		System.out.println(t.Area_Triangle());
		System.out.println(t.Perimeter_Triangle());

		// TODO Auto-generated method stub

	}



	private static void Triangle_Area_Perimeter() {
		// TODO Auto-generated method stub
		
	}

}
