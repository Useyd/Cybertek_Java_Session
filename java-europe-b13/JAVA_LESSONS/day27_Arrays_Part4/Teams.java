package day27_Arrays_Part4;

import java.util.Arrays;

public class Teams {

	public static void main(String[] args) {
		//2 teams 4 players
		String [][] teams = new String [2][4];
		
		//first team first player
		teams[0][0] = "Mike";
		
		//first team second player
		teams[0][1] = "Tonny";
		
		//first team third player
		teams[0][2] = "Smith";
		
		//first team fourth player
		teams[0][3] = "Evan";

		
		
		//second team first player
		teams[1][0] = "David";
				
		//second team second player
		teams[1][1] = "Emmy";
				
		//second team third player
		teams[1][2] = "John";
				
		//second team fourth player
		teams[1][3] = "Ryan";
	
		
		
		
		
		//OTHER SYNTAX FOR 2D ARRAY WITHOUT NEW KEYWORD:
		String[][] teams1 = { {"Mike", "Tony", "Smith", "Evan"}, {"David","Emmy","John", "Ryan"} };
		//2 rows, and 4 columns for each rows
		System.out.println(Arrays.toString(teams1[0]));
	    System.out.println(Arrays.toString(teams1[1]));
		
	    System.out.println();
		System.out.println("First player of first team:");
	    System.out.println(teams[0][0]);
	    
	    System.out.println("Number of rows: " + "\n"+ teams.length);
	    System.out.println("# People in first team: "+ "\n" + teams[0].length);
	    System.out.println("# People in second team: "+ "\n" + teams[1].length);
	    
	    
	
	
	
	
	
	
	
	}

}
