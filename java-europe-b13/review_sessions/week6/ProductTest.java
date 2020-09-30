package week6;

public class ProductTest {

	public static void main(String[] args) {


		Product p1 = new Product();
	
		p1.title="Spoon";
		p1.price=10.42;
		p1.rating=5;
		p1.seller="Amazon";		
		
		p1.display();

		System.out.println();
		
	
		
		Product p2 = new Product();
		p2.title="Fork";
		p2.price=7.6;
		p2.rating=4;
		p2.seller="Ebay";	
		
		p2.display();
		
		
	}

}
