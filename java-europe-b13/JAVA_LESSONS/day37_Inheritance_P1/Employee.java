package day37_Inheritance_P1;

public class Employee extends Person {

	String jobTitle;


	public void work() {
		
		System.out.println(name + " is working as " + jobTitle);
	}
	
	//WE GET WITH SHORT WAY INCLUDING INHERITE ONES
	@Override
	public String toString() {
		return "Employee [jobTitle=" + jobTitle + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
}
