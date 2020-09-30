package day37_Inheritance_P1;

public class Student extends Person { //INHERITENCE HERE WITH child EXTENDS parent

	int studentid;
	String termClass;
	
	public void code(String lang) {
		
		System.out.println(name + " is coding " + lang);
	}
}
