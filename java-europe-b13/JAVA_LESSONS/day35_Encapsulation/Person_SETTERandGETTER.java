package day35_Encapsulation;

public class Person_SETTERandGETTER {

	private String name;
	
	private int age;//only visible to current class.
	                //used private access specifier to cut the access from another classes
	                
	
	//setters
	public void setAge(int age) {
		if(age<0 && age>=110) {
			
			System.out.println("Not valid age");
		}
		
	   		
		this.age=age;
	}
	
	//getters
	public int getAge() {
		
		return age;
	}
	
	
	private char gender;


	
	
	
	
	//right click->source->generate getters and setters.
	//it will automatically creates the fields that you want as below...
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
}
