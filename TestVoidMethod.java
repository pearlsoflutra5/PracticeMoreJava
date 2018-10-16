//method that does not return a value, therefore call is a string.

import java.util.Scanner;
class TestVoidMethod {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your grade: ");
		double grade = input.nextDouble();
		System.out.print("Your grade: ");
		printGrade(grade);
	}
	public static void printGrade(double score) {
		if (score >= 90.0){
			System.out.println("A");
		}
		else if (score >= 80.0){
			System.out.println("B");
		}
		else if (score >= 70.0){
			System.out.println("C");
		}
		else if (score >= 60.0){
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
	}
	
}