package day20_StringManipulation_P2;

import java.util.Scanner;

public class Task82_LOGIn {

	public static void main(String[] args) {
		
/* 
 
 Login Functionally Logic
 
 UserName, Password
 
 -> Program will ask to enter username and password
 
 -> If both username and password are blank
    "UserName and Password Fields cannot be empty"
 
 -> If username is blank and password isn't blank 
    "UserName cannot be empty"
 
 -> If username isn't blank but password is   
    "Password cannot be empty"
 
 -> If the username or password is not valid
    "UserName or password is not valid. Please verify"
 
 -> If the username and password are both valid
    "User Logged in successfully"
  
 */ 		

		Login();
		
		
		
	}
    
	public static void Login() {
		Scanner input  = new Scanner(System.in);
		
		System.out.print("Please enter your username: ");
	    String username = input.nextLine();		
		
	    String userName = "Useyd"; 
	    
		System.out.print("Please enter your password: ");
		String password = input.nextLine();
	   
		String passWord = "1234";
		
	    if(password.equals("") && username.equals(""))
	    System.out.println("UserName and Password Fields cannot be empty");
	    
	    else if(username.equals("") && !password.equals(""))
	    System.out.println("UserName cannot be empty");	
	    
	    else if(password.equals("") && !username.equals(""))
	    System.out.println("Password cannot be empty");
	    
	    else if((username.equals(userName)==false) || (password.equals(passWord)==false))
	    System.out.println("UserName or password is not valid. Please verify");	
	    
	    else if((username.equals(userName)==true) && (password.equals(passWord)==true))
		System.out.println("User Logged in successfully");	
	
	    //we can put ! before method if we want to declare if it's not equal.
	    //EX: !username.equals(userName)
	
	}
	
	
	
	
}
