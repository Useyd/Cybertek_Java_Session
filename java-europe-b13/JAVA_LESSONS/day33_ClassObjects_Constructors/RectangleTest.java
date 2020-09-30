package day33_ClassObjects_Constructors;

public class RectangleTest {

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle();// we saw the new keyword so it means that we are calling a constructor
		                               // JVM will check for Rectangle with no parameters.
		                               // if we didn't create one, then it will create one by itself.
		                               // if we already created one custom constructor then it will search for the Rectangle() only and won't create a default 
		                               // and if there aren't any Rectangle(), then it will complain... With red lines.... 
		
		r1.length = 5.2;
		r1.width = 4.8;
		
		
		Rectangle r2 = new Rectangle();
		r2.length = 3.5;
		r2.width = 2.7;
		
		
		System.out.println(r1.length);
		System.out.println(r2.width);
		
	}
	
}
