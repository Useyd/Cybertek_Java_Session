package day16_ClassObjects;

public class CellPhone_ClassTask {      // ->  class

	String brand;                                // -> four properties
	double screenSize;
	String color;
	double price;
	
	public void getInfo() {
		System.out.println("Brand: " + brand + "\n" + "Screen Size: " + screenSize +" inches"+"\n" + "Colour: " + color + "\n" + "Price: " + "$"+ price);
	}
	
	public void call() {                        // - > three methods
		System.out.println(brand + " can make calls");
	}
	
	public void message() {
		System.out.println(brand + " can send sms message");
	}

	public void takeAphoto() {
		System.out.println(brand + " can take a photo");
	}

}
