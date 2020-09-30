package day13_MEthods_P1;

public class Task63_Temperature {

	public static void main(String[] args) {


		//1 Fahrenheit = -17.2222
	    //calculateCelcius(32) --> 0
		//calculateCelcius(50) --> 10
		
		calculateCelcius(55);
		
		
		
		
	}

	public static void calculateCelcius(double fahrenheit) {
		double celcius = (fahrenheit-32)*5/9; 
		System.out.println((int)fahrenheit + " Fahrenheit is " + (int)celcius +" celcius");
	}

	
	
	
	
	
	
	
	
	
	
}
