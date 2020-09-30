package day16_ClassObjects;

public class DogObjects {

	public static void main(String[] args) {// we are gonna use the classes in this main method

		Dog dog1 = new Dog();// calling the Dog class with this syntax
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
		
      
//        Default values for Instance Variables/ Compiler automatically names theese ones.
//        
//        *String -> null
//		  *int -> 0
//		  *boolean -> false
//		  *char -> '\u0000'
	
	
//        We are calling the properties and methods from class with using dot(nokta).
//        when we write our object's name then put a dot, we can now
//        access whatever we want in that class. 
//        For example we wrote dog1 and put dot it became dog1. Now we can call breed, 
//        size,age or getInfo(); from that class.
       	
	
        System.out.println(dog1.age); //it will write default value of int. 0 	

        System.out.println(dog1.breed);//it will write default value of String. null
	
        System.out.println();
        
        //now we'll give properties some values.
	
        dog1.age=10;//we made dog 1's age 10
        System.out.println(dog1.age);
	
	
        dog2.age=5;//we made dog2's age 5 
        System.out.println(dog2.age);
	
        System.out.println();
	
        dog1.breed="Mastiff";
        dog1.name="Humpty";
        dog1.color="Brown";
        dog1.age=2;
        dog1.getInfo();
        dog1.barking();//we are calling the methods from Dog class for dog1.
        dog1.hungry();
        dog1.sleeping();
	    System.out.println();
	
        dog2.breed="Maltese";
        dog2.name="Jake";
        dog2.color="Black";
        dog2.age=10;
        dog2.getInfo();
        dog2.barking();//we are calling the methods from Dog class for dog2.
        dog2.hungry();
        dog2.sleeping();
        System.out.println();
        
        dog3.breed="Doberman";
        dog3.name="Daisy";
        dog3.color="White";
        dog3.age=4;
        dog3.getInfo();
        dog3.barking();//we are calling the methods from Dog class for dog3.
        dog3.hungry();
        dog3.sleeping();
	}

}
