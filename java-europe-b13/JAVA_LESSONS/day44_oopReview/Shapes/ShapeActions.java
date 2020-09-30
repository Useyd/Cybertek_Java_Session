package day44_oopReview.Shapes;

import static day44_oopReview.Shapes.ShapeManager.*;//Importing the shape manager class

import java.util.ArrayList;
import java.util.List;

public class ShapeActions {

	public static void main(String[] args) {
		
		//run the draw square
		drawSquare((Square) buildShape("square"));
		
		//run the draw shape
		drawShape(buildShape("shape"));
		
		List<Shape> myList = new ArrayList<>();
		myList.add(new Shape());
		myList.add(new Square());
		myList.add(new Shape());
		myList.add(new Square());
		myList.add(new Diamond());
		
		drawShape(myList);
	}
}
