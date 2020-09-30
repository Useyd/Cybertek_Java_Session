package day20_StringManipulation_P2;

public class String_EquaLIgnoreCase {

	public static void main(String[] args) {


		String s1 = "Working Hard!";
		String s2 = new String("wOrkinG hard!"); 
		
		System.out.println(s1.equalsIgnoreCase(s2));// it's ignoring the cases if they are capital or not.
		                                            // It just looking for the parameters if they are same even if the cases are capital or not.             
		
		
		
	}

}
