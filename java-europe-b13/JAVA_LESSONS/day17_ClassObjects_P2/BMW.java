package day17_ClassObjects_P2;

public class BMW {

	String make = "BMW"; // all car models made by BMW...
	String model;
	double price;
	
	public void showPrice() {
		switch(model) {
		case "330i":
			price=40250;
			break;
		case "740i":
			price=85000;
			break;
		case "m3":
			price=100000;
			break;
		default:
			System.out.println(model + " is not available");
		    price=0.0;
			
			
		}
		System.out.println("Price: " + price);
	}
	
	
}
