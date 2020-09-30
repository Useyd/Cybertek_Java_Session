package day33_ClassObjects_Constructors;

public class CarTest {

	public static void main(String[] args) {
	
		Car c1 = new Car(); // new is calling the constructor... Constructor is Car() here..
		                    // it goes to Car class and finds the constructor - non parameter one: Car()...
		
       
		Car c2 = new Car("AMG", "Mercedes", 2000, 48000, "Red");
		                  
		                   // new is calling the constructor. Also it creates a new object. 
		                   // JVM goes to Car class and finds the constructor that includes the same parameters
		
		Car c3 = new Car("Corolla", "Toyota", 2015, 32000, "Yellow");
		
		Car c4 = new Car("Altima", "Nissan", 2014, 41000, "Black"); // we are dealing to initializing variables with one line only.
		                                                                                      
	}

}
