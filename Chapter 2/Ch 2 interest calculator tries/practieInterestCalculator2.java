import java.util.Scanner;

class practiceInterestCalulator2  {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("How much would you like to put into your savings? ");
	double monthlyDeposit = input.nextDouble();
	double currentValue= monthlyDeposit;
	final double monthlyTotal = currentValue + monthlyDeposit;
	final double interest = (1 + .00417);
	
	//System.out.println("after the first month, the value is " + currentValue);
	currentValue = monthlyTotal * interest;
	//System.out.println("after the second month, the value is " + currentValue);
	currentValue = monthlyTotal * interest;
	//System.out.println("after the 3rd month, the value is " + currentValue);
	currentValue = monthlyTotal * interest;
	//System.out.println("after the 4th month, the value is " + currentValue);
	currentValue = monthlyTotal * interest;
	//System.out.println("after the fifth month, the value is " + currentValue);
	currentValue = monthlyTotal * interest;
	//System.out.println("after the sixth month, the value is " + currentValue);
	currentValue = monthlyTotal * interest;
	System.out.println("after the sixth month, the value is " + currentValue); 
	
	
	}
}