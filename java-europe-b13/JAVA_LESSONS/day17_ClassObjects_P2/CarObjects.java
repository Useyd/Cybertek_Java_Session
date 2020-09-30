package day17_ClassObjects_P2;

public class CarObjects {

	public static void main(String[] args) {

        BMW b1 = new BMW();
        BMW b2 = new BMW();
        
        System.out.println(b1.make);
 		System.out.println(b2.make);
	
 		b1.make = "BMW2019";// we can change the maker's name like this... It will be changed from BMW to BMW2019...
 		System.out.println(b1.make);
	
		System.out.println(b2.make);
	    System.out.println();
	    
		b1.model ="m3";//compiler goes to class, finds the m3 model in switch case, then takes the price in it...
	    b1.showPrice();
		System.out.println();
		
	    b2.model ="x5";//we don't have x5.. so it will go to class and finds default in switch case then print: x5 is not available, Price: 0.0.
	    b2.showPrice();
	
	
	    
	
	
	
	
	
	
	
	}

}
