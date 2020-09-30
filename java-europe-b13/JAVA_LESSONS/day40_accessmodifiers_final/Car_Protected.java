package day40_accessmodifiers_final;

public class Car_Protected {

	String model;
	public int year;
	private int door;
	protected double engine;
	
	
	@Override //Shortcut -> Source, toString
	public String toString() {
		return "Car [model=" + model + ", year=" + year + ", door=" + door + ", engine=" + engine + "]";
	}
	
	
	
}
