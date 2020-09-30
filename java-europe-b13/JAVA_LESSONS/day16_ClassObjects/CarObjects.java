package day16_ClassObjects;

public class CarObjects {

	public static void main(String[] args) {
//Syntax=> class+object = new+class+();
		    Car   car1  = new  Car();
		
	
	car1.printCarInfo();//it will write default values. Because we didn't assign any values to them yet. 
	System.out.println();
	
	car1.make="Ford";
	car1.model="Fiesta";
	car1.color="Grey";
	car1.currentSpeed=160;
	
	car1.printCarInfo();//we assigned the make,model,color,and speed now. It will write with using them.
	car1.showCurrentSpeed(100);//speed limit is 100. it's current speed is 160. so over the speed limit.
	car1.showCurrentSpeed(180);
	System.out.println();
	
	car1.drive();
	System.out.println("Before Acceleration: " + car1.currentSpeed);
	
	car1.accelerate(20);//it will increase current speed 20 mph
	System.out.println("After Acceleration:: " + car1.currentSpeed);
	
	
	}

}
