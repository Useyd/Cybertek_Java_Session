package week7;

public class String_CharAt {

	public static void main(String[] args) {
		
		String company = "Cybertek";
		System.out.println(company.charAt(0));

		char a = company.charAt(2);// this method holds the value we should print it with sout.
		System.out.println(a);
	
		System.out.println(company.charAt(company.length()-1));
	
		//print each character
		
		for(int i = 0; i<company.length();i++) {
			
			System.out.print(company.charAt(i)+" ");
			
		}
		
		
		
	}

}
