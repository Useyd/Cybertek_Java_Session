package day35_Encapsulation;

public class Carpet_Test {

	public static void main(String[] args) {
		
		Floor f = new Floor(10, 20);//creating an object for reach the Floor class (f)
		Carpet c = new Carpet(5.2);//creating an object for reach the Carpet class (c)
		
		                           
		Calculator cal = new Calculator(f,c);//Then for reaching the Calculator class we are creating another object called cal
		                                     //We wrote f and c as parameters of the Calculator constructor.
		
		System.out.println(cal.getTotalCost());//Then we call the total cost method with cal object.
		
	}

}
