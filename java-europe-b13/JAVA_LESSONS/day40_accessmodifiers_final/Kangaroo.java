package day40_accessmodifiers_final;

public class Kangaroo extends Marsupial{

	public static boolean isBiped() {
		
 		return true;
	}
	
	public void getKangarooDescription() {
		
		System.out.println("Kangaroo hops on two legs: " + isBiped());
		
	}
	
}
