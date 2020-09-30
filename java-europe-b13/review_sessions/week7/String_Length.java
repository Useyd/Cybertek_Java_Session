package week7;

public class String_Length {

	public static void main(String[] args) {
	
		String name = "Mike Smith";
		System.out.println(name.length());

		String name2 = new String("Mike Smith");
		int ln = name2.length();
		
		System.out.println(ln);
		
		String str = "";
	    System.out.println(str.length());
	
	    String password = "cybertek123";
	    
	    if(password.length()>=8) {
	    	
	    	System.out.println("Password length matches the requirements");
	    }else {
	    	
	    	System.out.println("Invalid Password");
	    }
	}

}
