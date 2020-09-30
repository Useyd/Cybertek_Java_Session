package Day22_StringManipulation_Lab;

public class String_StartsEndsWith {

	public static void main(String[] args) {
		
		String word1 = "eclipse";
		
		//startWith
		System.out.println(word1.startsWith("e"));
        System.out.println(word1.startsWith("ec"));
		System.out.println(word1.startsWith("ex"));
		System.out.println();
		
		//endsWith
		System.out.println(word1.endsWith("e"));
	    System.out.println(word1.endsWith("ipse"));
	    System.out.println(word1.endsWith("xe"));
	    System.out.println();
	
	    //Mr. => married man
	    //Mrs. => married woman
	    //Ms. => Some woman
	    //Dr. => Doctor man or woman
	    //No title => Unknown status
	    
	    String type = "Mr. Kazim Karabatak";
	    
	    boolean i = type.startsWith("Mr.");
	    boolean j = type.startsWith("Mrs.");
	    boolean k = type.startsWith("Ms.");
	    boolean l = type.startsWith("Dr.");
	
	    if(i==true)  
	    System.out.println("He is a married man");
        
	    else if(j==true)
 	    System.out.println("She is a married woman");
	    
	    else if(k==true)
	    System.out.println("Some woman");	
	    
	    else if(l==true)
	    System.out.println("This person is a doctor");
	    
	    else
	    System.out.println("Unknown Status");	
	
	} 
	
	
	

}
