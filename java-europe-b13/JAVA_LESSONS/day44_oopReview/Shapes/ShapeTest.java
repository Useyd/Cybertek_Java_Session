package day44_oopReview.Shapes;

public class ShapeTest {

	public static void main(String[] args) {
		// Create 3 shapes using polymorphism
		
		Shape diamond = new Diamond();
		
		System.out.println(diamond.getType());
		diamond.draw();
		
		Shape square = new Square();
		
		System.out.println(square.getType());
		square.draw();
		
		Object shapeObject = new Shape();
		
		((Shape) shapeObject).getType();
		
		
		((Square) square).squareMethod(); //DOWN CASTING for reach the squareMethod method... 
		

	}

}
