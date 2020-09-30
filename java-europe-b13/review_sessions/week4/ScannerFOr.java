package week4;

import java.util.Scanner;

public class ScannerFOr {

	public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
System.out.println("Please declare a range:");
System.out.print("Starting number: ");
int starting = scanner.nextInt();

System.out.print("Ending Number: "); 
int ending= scanner.nextInt();

System.out.print("Your number should divisible with: ");
int division = scanner.nextInt();

System.out.print("You want to see odd or even numbers? (Enter 0 for odd, 1 for even): ");
int number = scanner.nextInt();

int sum=0;


   for (int i=starting; i<ending; i++) {
	   
	   if(i%division==0 && number==0 && i%2!=0) {
		   
		   System.out.println(i);
		   sum=sum+i;
		   
	   }else if (i%division==0 && number==1 && i%2==0) {
		   System.out.println(i);
	   sum=sum+i;
	   }
	   
       }

       System.out.println("Sum is = " +sum);

	}

}
