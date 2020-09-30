package day4_arithmetic_operators;

public class arithmetic_operators_exampls {
public static void main(String[] args) {
	
	//Create a variable linesOfCode and assign 50 and print "Lines of code 50"
	//Delete 2 lines
	//Decrease the value of linesOfCode by 2 and print "Lines of Code 48"
 
    int linesOfCode = 50;
    
    System.out.println("Lines of Code "+ linesOfCode);
    
    linesOfCode = linesOfCode -2;
    
    System.out.println("Lines of Code " + linesOfCode);
    
    //Multiplication *
    
    System.out.println(22*2);
    
    int classes = 5;
    System.out.println(linesOfCode * classes);
    
    int totalLinesOfCode=linesOfCode*classes;
    System.out.println("Total Lines of Codes = " + totalLinesOfCode);
    
    // Division /
    
    System.out.println(10/2);
    //System.out.println(11/0); throw error while running the code 0 cannot be divided any other
    System.out.println(0/44);


    // Remainder %
    System.out.println(45%7);
    
    

}
}
