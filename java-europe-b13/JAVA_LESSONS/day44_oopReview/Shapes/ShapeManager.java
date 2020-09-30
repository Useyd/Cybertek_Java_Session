package day44_oopReview.Shapes;

import java.util.List;

public class ShapeManager {
	
	public static Shape buildShape(String type) {
		
		Shape shape = null;
		
		switch(type.toLowerCase()) {
		
		case "shape":
			  shape = new Shape();
		      break;
		
		case "diamond":
		      shape = new Diamond();	
	          break;
		
		case "square":
		      shape = new Square();
		      break;
		
		
		}
		
		return shape;
	}
	
	public static void drawSquare(Square squareObject) {
		
		//draw method from square class
		squareObject.draw();
		
	}
	
    public static void drawShape(Shape shape) {
		
		//draw method from shape class
		shape.draw();
		
	}
    
    public static void drawShape(List<Shape> shapeList) {
		
		//run each draw methods
		for(Shape each: shapeList) {
			
			each.draw();
		}
		
		
	}
	
	
	
}
