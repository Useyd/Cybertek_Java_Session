package day23_RandomClass;
import java.util.*;
public class Task84_CoinToses {

	public static void main(String[] args) {
		
		Random rn = new Random();
		for (int i = 0; i<10; i++) {
			
			if(rn.nextInt(2)==0) //tail = 0, heads=1
			System.out.println("tails");//so if 0 tails 
			else
		    System.out.println("heads");//if 1 heads
		
		}
		
		

	}

}
