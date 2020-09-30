package day15_Methods_P3;

public class Task71_FeetInchToCm {

	public static void main(String[] args) {

/*		#Create a method called calcFeetAndInchesToCentimeters . It needs to have two parameters.
		Feet is the first parameter, inches is the second parameter.
		
		#You should validate that the first parameter feet is >=0, and second parameter inches is
		>=0 and <=12. Return -1 from the method if either of the above is not true.
		
		#If the parameters are valid, then calculate how many centimeters comprise the feet and
		inches passed to this method and return that value.
		
		#Create a second method of the same name but with only one parameter inches is the
		parameter and validate it >=0, return -1 if it is not true. But if it is valid, then calculate how
		many feet are in the inches.
		
	    #Call the other overloaded method passing the correct feet and inches calculated so that it
		can calculate correctly.
		
		#Hints : Use double for your number data types
		1 inch = 2.54cm and 1 ft =12 inches */
		
		//String x = calcFeetAndInchesToCentimeters(6,0);
		//System.out.println(x);
		//System.out.println();
		
		String y = calcFeetAndInchesToCentimeters(100);
	    System.out.println(y);
	    System.out.println();
	    
	    String z = calcFeetAndInchesToCentimeters(156);
	    System.out.println(z);
	
	}public static String calcFeetAndInchesToCentimeters(double feet, double inches) {
		double feettoinches, inchestocm;
		if(feet>=0 && inches>=0 && inches<=12) {
		feettoinches= feet*12;  
		inchestocm=feettoinches*2.54;
		//1 inch = 2.54cm and 1 ft =12 inches
		
		return feet +" feet, "+ inches+ " inches = " + inchestocm + " centimeters";
		
		}
		
	    return "-1";
	    
		
	}public static String calcFeetAndInchesToCentimeters(double inches) {
		double inchestofeet, remaininginches;
		if(inches>=0) {
		
		inchestofeet=(int)inches/12; //-> casting, otherwise output will be ugly..	
		remaininginches= inches%12;//with casting we are loosing some data. But in this calculation that data will be seen as inches. So we rescued it :)
		System.out.println(calcFeetAndInchesToCentimeters(inchestofeet,remaininginches));//calling the first method here...
		
		return inches + " inches = " + inchestofeet + " feet " + remaininginches +  " inches";	
		}
		
		return "-1";
		
	}
	
	
	
	
	
	
}
