package day20_StringManipulation_P2;

public class String_IndexOf2 {

	public static void main(String[] args) {

        //index of with two values 
		
		String list = "html-selenium-angular-jenkins-grid";
		
		int firstdash = list.indexOf("-");
		System.out.println(firstdash);
		
		int seconddash = list.indexOf("-", 5);
		
		//indexOf(str, fromIndex);
		//in this indexOf method compiler first goes to index 5
		//then it looks for dash after index number 5
		
		System.out.println(seconddash);
		
		int thirddash = list.indexOf("-", seconddash+1);
	    
		System.out.println(thirddash);
	
		//list.lastIndexOf(str); gives last index of the string
		int lastdash = list.lastIndexOf("-");
	    
		System.out.println(lastdash);
	
		//list.lastIndexOf(str, int fromIndex);
		int thirddash2 = list.lastIndexOf("-", 28);
	    System.out.println(list.charAt(thirddash2));
	
	}

}
