package day39_INHERITANCE_REVIEW;

public class Car extends Vehicle{
	
	private int wheels;
	private int doors;
	private int gears;
	private boolean isManual;
	private int currentGear;
	
	public Car(String name, int size, int wheels, int doors, int gears, boolean isManual) {
		
		super(name,size);
		this.wheels = wheels;
		this.doors = doors;
		this.gears = gears;
		this.isManual = isManual;
		this.currentGear = 1;
	}
	
	public void changeGear(int currentGear) {
		
		this.currentGear=currentGear;
		
	}
	
	public void changeVelocity(int speed, int direction) {
		
		System.out.println("Car.changeVelocity(): Velocity " + speed + " direction " + direction);
		move(speed, direction);
	}
	
	@Override
	void move(int velocity, int direction) {
		
		//increase the velocity by 10
		setCurrentVelocity(velocity+10);
		setCurrentDirection(direction);
		System.out.println("Vehicle.move(): Moving at " + getCurrentVelocity() + " in direction " + getCurrentDirection());
		
	}



//	public Car() {
//		
//		super();//super keyword takes us to constructor in parent class
//		        //if it has no parameters then it will find the non-parameter constructor 
//	}

}
