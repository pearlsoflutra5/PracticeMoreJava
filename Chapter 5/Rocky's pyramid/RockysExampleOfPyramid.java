import java.util.Scanner;

class RockysExampleOfPyramid {
	public static void main(String[] args) {
		//Declare variable
		Scanner input = new Scanner(System.in);
		// prompt the user
		System.out.print("Enter The number of lines: ");
		int numLines = input.nextInt();
		
		// Check user unput is bewteewn 1 and 15
		if (numLines < 1 || numLines > 15){
			System.out.println("Invalid Input: You must enter a number between 1 and 15. ");
		
		}
		else{
			// Controls rows af pyramid
			for (int row = 1; row <= numLines; row ++){
				// print leading spaces
				for(int space = 1; space <= numLines - row; space++){
					System.out.print ("   ");
				}
				
				//print the left side of the pyramid
				for (int left = row; left >0; left--){
					System. out. print ((left> 9) ? " " + left : "  " + left);
				}
				// print right side of pyramid
				for (int right = 2; right < row; right ++){
					System. out. print ((right> 9) ? " " + right : "  " + right);
				}
				System.out.println();
			} 
		}
	}
}