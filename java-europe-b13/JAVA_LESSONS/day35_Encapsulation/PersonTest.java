package day35_Encapsulation;

public class PersonTest {

	public static void main(String[] args) {
		
		Person_SETTERandGETTER p = new Person_SETTERandGETTER();
		
		p.setAge(20);//calling setter method with a value -> 20 
				
		System.out.println(p.getAge());//getting the value as output with getter method

	
	
		//ENCAPSULATION
		//1.Cut the access with private access specifier
		//2.Create setter method to initialize the value 
		//3.create getter method to retrieve it
	
	
	
	}

}
