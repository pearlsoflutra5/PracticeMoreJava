
import java.util.Scanner;

public class palindrome2 {
	public static void main(String[] args) {

		System.out.println("Please enter an integer. ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		boolean Final = isPalindrome(number);
		System.out.println(Final);
	}

	/*public static int reverse(int number) { // missing return?
		int y;
		int n;
		for (n = 0; n <= number; n++) { // parameters
			y = number % 10; // remainder
			number = number / 10; // gets rid of last digit
			n = n * 10 + y; // sets reverse values

			return n; // returns reversed number
		}
	}*/
	
	public static int reverse(int number) {  
		int result = 0;
		int remainder;
		while (number > 0){
			remainder = number % 10;
			number = number / 10;
			result = result * 10 + remainder;
		}

		return result;
	}

	public static boolean isPalindrome(int number) {
		int n = reverse(number); // call reverse method
		boolean result; // declare result
		if (n == number) {
			result = true;
			System.out.println("The number " + number + " is a " + "Palindrome" + ".");
		} 
		else {
			result = false;
			System.out.println("The number " + number + " is a Palindrome" + ".");
		}
		return result; // not initialized?
	}
}
