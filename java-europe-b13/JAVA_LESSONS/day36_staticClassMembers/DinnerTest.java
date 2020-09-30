package day36_staticClassMembers;

public class DinnerTest {

	public static void main(String[] args) {
		
		Dinner mom = new Dinner();
		Dinner kid = new Dinner();
		Dinner dad = new Dinner();
		
		System.out.println("Total Slices: " + Dinner.pizzaSlice);
		
		dad.takeASlice();//dad takes a slice
		kid.takeASlice();//kid takes a slice
		mom.takeASlice();//mom takes a slice
		
		//so 3 slices gone, and 5 left.
		System.out.println("Total Slices: " + Dinner.pizzaSlice);
		
		
		kid.takeASlice(3);//kid takes 3 more slices
		dad.takeASlice(2);//dad takes 2 more slices
		
		//mom.takeASlice();  -> no slices left for mom. so it will give -1 as output.
		
		System.out.println("Total Slices: " + Dinner.pizzaSlice);
		
	}

}
