package day16_ClassObjects;

public class Dog {

	
	//Class is a blueprint(taslak) and has common properties and methods
	
	
	String breed;
	int age;
	String color;
	String name;
	
	public void getInfo() {
		System.out.println("Breed: " + breed + "\n" + "Name: " + name + "\n" + "Age: " + age +"\n" + "Colour: " + color);
	}
	
	public void barking () {
		System.out.println(name +" is barking");
				
	}

	public void hungry () {
		System.out.println(name + " is hungry");
	}

	public void sleeping() {
		System.out.println(name + " is sleeping");
	}
	
	





}
