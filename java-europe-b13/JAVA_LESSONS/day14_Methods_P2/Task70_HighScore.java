package day14_Methods_P2;

public class Task70_HighScore {

	public static void main(String[] args) {

/* 
 
Create a method called displayHighScorePosition. It should have a players name as a
parameter, and a 2nd parameter as a position in the high score table. You should
display the players name along with a message like “managed to get into position”
and the position they got and a further message “on the high score table”

Create a 2nd method called calculateHighScorePosition. It should be sent one
argument only., the player score.
It should return an int.

The return data should be :

1 – if the score is >=1000
2 – if the core is >=500 and <1000
3- if the score is >=100 and <500
4- in all other cases

Call both methods and display the results of the following:
a score of 1500, 900, 400 and 50 */
		int x = calculateHighScorePosition(1000);
		
		System.out.println(displayHighScorePosition("Useyd", x));
		System.out.println();   
		
		    x = calculateHighScorePosition(1500);
		System.out.println(displayHighScorePosition("Saban", x));
		   
		    x = calculateHighScorePosition(900);
		System.out.println(displayHighScorePosition("Ramazan", x));		
		 
		    x = calculateHighScorePosition(400);
		System.out.println(displayHighScorePosition("Sukru", x));
		    
		    x = calculateHighScorePosition(50);
		System.out.println(displayHighScorePosition("Zulkuf", x));
		
	}public static String displayHighScorePosition(String name, int i) {
		
		return name + " managed to get into position " + i + " on the high score table";

		
	
	
	}public static int calculateHighScorePosition(int score) {
  
		int i;
		     if(score>=1000) { 
			 i=1;     return i;}
			 
		     if(score>=500 && score<1000) {
			 i=2;     return i;}
			 
		     if(score>=100 && score<500) {
			 i=3;	  return i;} 
		     
		  			 
			        
		     return 4;
		
	    
	}

	

}
