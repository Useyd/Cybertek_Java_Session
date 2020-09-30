package day36_staticClassMembers;

public class Dinner {

	static int pizzaSlice = 8;// since it's static all objects can access this variable same time.
	                          // so there is 3 person, and 8 slices of pizza
	
	public void takeASlice() {
		
		pizzaSlice--;
	}
	
	public void takeASlice(int count) {
		
		pizzaSlice-=count;
	}
}
