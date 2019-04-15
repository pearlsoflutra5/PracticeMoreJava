import java.util.Scanner;

class Ch12Extras {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 2 integers: ");
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		
		try{
			System.out.println(n1 / n2);
		}
		catch (ArithmeticException ex){
			System.out.println("Cannot divide by zero. ");
		}
		
		System.out.println("See I didn't crash when the user divided by zero. ");
	}
}