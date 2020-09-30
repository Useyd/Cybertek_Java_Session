package day30_WrapperClass;

public class Task98_StringtoNum_INSANE {

	public static void main(String[] args) {
		
		String str1 = "&^%^1&8O^^..ne. .52||{{T.*@,(wo#$ %^*f!@%^<<i86876ve&%^$ ^%$S$..,,!i!%*&#x&*@!$";// One Two five Six 
		System.out.println(decodeTheCode(str1));

		String str2 = "N000000i%$!,n9!!!!<e>>>>> 43.***T#$#%hr##<e><e>><{{ ###f##00o00###u%$#$##$#r"; //Nine Three four
	    System.out.println(decodeTheCode(str2));
		
	    //Change the implementation of decodeTheCode(String) method such that on executing class, following output is shown:
	    //1 2 5 6 (One Two five Six in the string)
	    //9 3 4   (Nine Three four in the string)
	    
	
	}

	public static String decodeTheCode(String str) {
		
		String dummy = "";
		for(int i=0; i<str.length(); i++) {
			
			if(Character.isLetter(str.charAt(i)) || str.charAt(i)== ' ') {
			dummy+=str.charAt(i);
			}
		}
		
		String[] array = dummy.split(" ");//it will split the output from spaces
		
		String dummy2 = "";
		for(String value: array) {
			
		dummy2+=getDigit(value)+" "; // creating a new method in here for grab the digit numbers
			
		}

		return dummy2;
	
	}

	public static String getDigit(String str) {
		
		switch(str.toUpperCase()) {//converting all strings to uppercase
		
		case "ZERO":
		return "0";
		
		case "ONE":
		return "1";
		
		case "TWO":
		return "2";
		
		case "THREE":
		return "3";
			
		case "FOUR":
		return "4";
			
		case "FIVE":
		return "5";
		
		case "SIX":
		return "6";
			
		case "SEVEN":
		return "7";
			
		case "EIGHT":
		return "8";
		
		case "NINE":
		return "9"; 	
		
		default:
		return "";	
		
		}
		
	}

}
