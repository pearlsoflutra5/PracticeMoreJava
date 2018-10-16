import java.util.Scanner;

class practiceInterestCalulator {
	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);

			System.out.println("How much would you like to put into your savings? ");
			double monthlyDeposit = input.nextDouble();
			double currentValue = monthlyDeposit;
			double monthlyTotal = currentValue + monthlyDeposit;
	
			final double interest = (1 + .00417);
			
			currentValue = monthlyTotal * interest;
			currentValue = monthlyTotal * interest;
			currentValue = monthlyTotal * interest;
			currentValue = monthlyTotal * interest;
			currentValue = monthlyTotal * interest;
			currentValue = monthlyTotal * interest;
			currentValue = monthlyTotal * interest;
			currentValue = monthlyTotal * interest;
			System.out.println("after the sixth month, the value is " + currentValue);
					
			
		
	}
}