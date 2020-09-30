package day44_oopReview.Shapes;

public class Shape {

	public String type;
	
	public Shape() {
		
		type="shape";
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void draw() {
		
		System.out.println("Drawing a shape");
	}
	
}
