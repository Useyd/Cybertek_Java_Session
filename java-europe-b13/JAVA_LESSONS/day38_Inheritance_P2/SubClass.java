package day38_Inheritance_P2;

public class SubClass extends SuperClass {

	public SubClass() {
        super();//got to parent class
                //find the constructor which has no parameter
                //If there is no super() in here Java will automatically
                //call the superclass's default constructor or 
                //no argument constructor. Just before the code in the subclass's 
                //constructor executes.
		System.out.println("This is the SubClass constructor");
	}

}
