package day23_RandomClass;

import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {
		
		Random rn = new Random();
		
		System.out.println(rn.nextInt());
        System.out.println(rn.nextDouble());
        System.out.println(rn.nextFloat());
        System.out.println(rn.nextBoolean());
	
        
        System.out.println(rn.nextInt(50));//it creates a boundry..
	                                       //0 to 49
	
	    System.out.println(rn.nextInt(10)+5);// it was 10. we add 5. I became 5 to 14
	                                         // first 0 to 9 added 5 both sides became 5 to 14
	
	
	
	
	
	
	
	
	
	
	
	}                             

}
