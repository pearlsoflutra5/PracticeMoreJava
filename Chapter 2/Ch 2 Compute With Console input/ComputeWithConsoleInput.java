// import and Scanner are required to get input from keyboard.

import java.util.Scanner;

class ComputeWithConsoleInput {
	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);

	System.out.println("Enter a number for the radius");
	double radius = input.nextDouble();
	
	double area = radius * radius * 3.14159;;
	
	
	System.out.println("The area for the circle of radius " + radius + " is " + area);	 
			
	}
}