package day26_Arrays_Part3;

public class Task94_CreatePassword {

	public static void main(String[] args) {
/*		
		String info1 = "This info is used for creation password : xxxCD132Gxxx . Please do not share with anyone";
		String info2 = "This info is used for creation password : xxx00ABC!xxx . Please do not share with anyone";
		
		Create a password based on given info.
		
		Output: CD132G00ABC!
*/
		
				
		String info1 = "This info is used for creation password : xxxCD132Gxxx . Please do not share with anyone";
		String info2 = "This info is used for creation password : xxx00ABC!xxx . Please do not share with anyone";
		
		String[] inFo1Array = info1.split(" ");
		String[] inFo2Array = info2.split(" ");
		
		String pw1 = inFo1Array[8];
		String pw2 = inFo2Array[8];	 	
		

		System.out.println(pw1.replace("x", "") + pw2.replace("x", ""));
		
		
	}

}
