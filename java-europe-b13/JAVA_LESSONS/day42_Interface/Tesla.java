package day42_Interface;

public class Tesla extends ElectricCar {

	
	
	
	
	public Tesla(String model, double price, String color) {
		super(model, price, color);
		// TODO Auto-generated constructor stub
	}

	
	
	@Override
	void start() {
		System.out.println("Tesla is starting");
		System.out.println("Change to drive mode");
		
	}

	@Override
	void charge() {
		System.out.println("Tesla is charging - Plugin to electric outlet");
		
		
	}

	@Override
	void drive() {
		System.out.println("Change is driving");
		
	}

}
