package day19_StringManipulation_P1;

public class String_Contains {

	public static void main(String[] args) {

      String email = "test@gmail.com"; 
	
      System.out.println(email.contains("@"));
	
      String list = "potatoes, tomatoes, eggs, milk, bread, cereal, meat, apples";
      
      if(list.contains("apples"))//if true do if statement...
    	  System.out.println("Apples are in your list");
      else//if false do else statement
    	  System.out.println("Apples are not in yout list!");

      boolean hasEggs = list.contains("eggs");
	  System.out.println("Contains eggs: " + hasEggs);
	  
	  boolean cucumber = list.contains("cucumber");
	  System.out.println("Contains cucumber: " + cucumber);
	  System.out.println();
	
	  System.out.println("WHICH EMAIL ACCOUNT?"); 
	  email = "name@yahoo.com";
	  
	  if(email.contains("@yahoo"))
	  System.out.println("yahoo account");
	  else if(email.contains("@gmail"))
	  System.out.println("Gmail account");
	  else if(email.contains("@hotmail"))
	  System.out.println("Hotmail Acoount");
	  System.out.println();
	  
	  String etsyTitle = "Car | Etsy";
	  if(etsyTitle.contains("|"))
	  System.out.println("Pipe is there as expected");	  
	  else
	  System.out.println("Pipe is not existing!");
	  System.out.println();
	
	  //in Automation we'll use contains() like that a lot
	  String searchItem = "computer";
	  String title = "Amazon.com: computer";
	  if(title.contains(searchItem))
	  System.out.println("pass");
	
	}

}
