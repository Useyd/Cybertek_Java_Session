package day42_Interface;

public class Ford extends ElectricCar {

	private int year;

	public Ford(String model, double price, String color, int year) {
		super(model, price, color);
		this.year = year;
	}

	public int getYear() {
		return year;
	}
	
	
	@Override
	void start() {
		System.out.println("Ford - Push button to start...");
		
	}

	@Override
	void charge() {
		System.out.println("Ford - Plugin to electric outlet...");
		
	}

	@Override
	void drive() {
		System.out.println("Ford - Is driving...");
		
	}

	
	
	
}
