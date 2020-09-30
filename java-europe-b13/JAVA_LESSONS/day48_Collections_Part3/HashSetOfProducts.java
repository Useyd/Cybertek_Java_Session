package day48_Collections_Part3;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import day46_Collections_Part1.Product;

public class HashSetOfProducts {
	
	public static void main(String[] args) {
		
		//Set<Product> productSet = new HashSet<>();
		Set<Product> productSet = new TreeSet<>();
		
		productSet.add(new Product("book", 25.99));
		productSet.add(new Product("book", 19.99));
		productSet.add(new Product("book", 7.99));
		
		System.out.println(productSet.toString());
		
		//print each product price by using for each loop
		
	    for(Product p : productSet) {
 		         
	    	System.out.println(p.getPrice());
 	    }
		
		//print each product by using forEach method
	    productSet.forEach(p -> System.out.println(p.getPrice()));
	    
		
		
	}

}
