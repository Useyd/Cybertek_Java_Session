package day43_Polymorphism;

public class ShapesArray {

	public static void main(String[] args) {
		
		Shape[] shapes = new Shape[3];

		shapes[0] = new Square();
		
		shapes[1] = new Triangle();
		
		shapes[2] = new Circle();
		
		for(Shape sh: shapes) {
			
			//Full path of the class name
			System.out.println(sh.getClass().getName());
			
			//Just the class name
			System.out.println(sh.getClass().getSimpleName());
			
			sh.draw();	
			
			System.out.println();
		}
		
	}

}
