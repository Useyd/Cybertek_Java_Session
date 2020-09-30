package day15_Methods_P3;

public class Task70_HighScore {

	public static void main(String[] args) {

		calculateHighScorePosition(1500); 
		
		
		displayHighScorePosition("Mike",calculateHighScorePosition(1500));
		displayHighScorePosition("Tom",calculateHighScorePosition(900));
		displayHighScorePosition("Daisy",calculateHighScorePosition(400));
		displayHighScorePosition("Jason",calculateHighScorePosition(50));
	}

	
	public static void displayHighScorePosition(String playerName, int highScorePosition) {
		
		System.out.println(playerName + " managed to get into position " + highScorePosition + " on the high score table");
		
	}
	
	
	public static int calculateHighScorePosition(int playerScore) {
		
	
		if(playerScore>=1000) {
			
			return 1;
		}else if(playerScore>=500 && playerScore<1000) {
			
			return 2;
			
		}else if(playerScore>=100 && playerScore<500) {
			
			return 3;
		}else {
			
			return 4;
		}
	}
	





}
