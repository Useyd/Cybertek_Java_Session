package Day22_StringManipulation_Lab;

public class String_IsEmpty {

	public static void main(String[] args) {
		
		String username = "";//blank (not space!)
		
		//if we put space in username it will return false.
		//but if we use isBlank method it'll return true.
		String password = "";//blank (not space!)
		
		if(username.isEmpty())
		System.out.println("Username can't be empty!");	
		else
		System.out.println("Username isn't empty...");	
	
	
		if(username.isEmpty() || password.isEmpty())
		System.out.println("Username or password can't be empty!");	
		else
		System.out.println("Username or password isn't empty...");	
	}

}
