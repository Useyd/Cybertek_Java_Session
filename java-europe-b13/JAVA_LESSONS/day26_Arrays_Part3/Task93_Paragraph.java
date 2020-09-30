package day26_Arrays_Part3;

public class Task93_Paragraph {

	public static void main(String[] args) {

/*		“As he crossed toward the pharmacy at the corner he involuntarily turned his head because of a
		burst of light that had ricocheted from his temple, and saw, with that quick smile with which we
		greet a rainbow or a rose, a blindingly white parallelogram of sky being unloaded from the van—a
		dresser with mirrors across which, as across a cinema screen, passed a flawlessly clear reflection of
		boughs sliding and swaying not arboreally, but with a human vacillation, produced by the nature of
		those who were carrying this sky, these boughs, this gliding façade.”
*/
		
		String paragraph = "As he crossed toward the pharmacy at the corner he involuntarily turned his head because of burst of light that had ricocheted from his temple, and saw, with that quick smile with which greet a rainbow or a rose, a blindingly white parallelogram of sky being unloaded from the van a dresser with mirrors across which, as across a cinema screen, passed a flawlessly clear reflection of boughs sliding and swaying not arboreally, but with a human vacillation, produced by the nature of those who were carrying this sky, these boughs, this gliding façade.";
		
		//first we create a new array from the paragraph
		String[] newArray = paragraph.split(" ");
		
		//then we can reach the numbers of the words
		System.out.println(newArray.length);
		
		//if we want to print each of them
		for(String elements: newArray) {
			
			System.out.println(elements);
			
		}
		
		
		
		
		
	}

}
