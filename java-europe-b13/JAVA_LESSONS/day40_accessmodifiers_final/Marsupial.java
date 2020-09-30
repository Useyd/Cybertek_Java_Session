package day40_accessmodifiers_final;

public class Marsupial {

	public static boolean isBiped() { //this method will be hide the child ones same method
		                              //so output will be false in KangarooTest class at getMarsupialDescription();
		
		return false;
	}
	
	public void getMarsupialDescription() {
		
		System.out.println("Marsupial walks on the two legs: " + isBiped());
	}
	
}
