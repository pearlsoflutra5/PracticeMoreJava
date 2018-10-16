import java.util.Scanner;

public class RealNumberTriangle {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	final int MIN = 1;
	System.out.print("Enter Number of rows between 1 and 15: ");
	final int MAX = input.nextInt();

	
		for(int j = MIN; j <= MAX; j++) {
			for(int i = MIN, k = MAX; i <= MIN + 2*(MAX-MIN); i++) {
				if(k <= j) {
					System.out.print("" + k + " ");
				} else {
					System.out.print("  ");
				}
				if(i < MAX) {
					k--;
				} else {
					k++;
				}
			}
			System.out.println("");
		}
	}
}