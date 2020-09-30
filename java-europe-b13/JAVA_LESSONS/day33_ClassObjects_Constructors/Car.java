package day33_ClassObjects_Constructors;

public class Car { //class name is Car

	String model;
	String make;
	int year;
	double mile;
	String colour;
	
	public Car() { //Constructor. Has no return type... Same as class name...
		
		make = "BMW";
		model = "M3"; 
		year = 2019;
		mile = 23000;
		colour = "red";
		
	}

	
	// Right click -> Source -> Generate Constructor using Fields
	// it automatically creates the constructor below:
	
	public Car(String model, String make, int year, double mile, String colour) {
		super();
		this.model = model;
		this.make = make;
		this.year = year;
		this.mile = mile;
		this.colour = colour;
	}
	

	
	/*
	  public Car(String mo, String ma, int yr, double ml, String cl) {
	 
	
	    this.model = mo; //this refers to the current object. Even if we don't write it it's true. It is just specifies the object.
	    this.make = ma;
	    this.year = yr;
	    this.mile = ml;
	    this.colour = cl;
	
	}
*/


}
