package week2;

public class Tasks {

	public static void main(String[] args) {

		int pies = 10, people = 4;
		double piesPerson;
		
		piesPerson = pies/people; // int:int => 10:4 = 2 (outcome should be 2.5 in the real life.
		                          // because of he int type it only takes 2 side. not the decimal side)
		                          //widening in here. explicit casting  
		System.out.println(piesPerson); // piesPerson is in double type. Son outcome will be 2.0. 
		
		piesPerson= pies/(double)people; // int:double=double => 10/4.0
		System.out.println(piesPerson);
		
		piesPerson = (double)(pies/people); //(double)(int/int) => (double) 2
        System.out.println(piesPerson);
        
        piesPerson = (double)pies/people;//double/int=double => 10.0/4 => 2.5
        System.out.println(piesPerson);
		
        double result = (1/2)*2; //(int/int)*int =>int*int =>
        //(1/2)*2 -> 1 divided 2 is 0.5 so it is a double. but because of the numbers in int form comp takes only the 0 side.
        //0*2 -> 0  
        
        System.out.println(result);
	
	
	
	
	}

}
