//method that returns a value
import java.util.Scanner;

class TestReturnGradeMethod {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your grade: "); 
		double grade = input.nextDouble();
		System.out.print("Your grade is " + getGrade(grade));
	}
	
	public static char getGrade(double score){
		if (score >= 90.0){
			return 'A';
		}
		else if (score >= 80.0){
			return 'B';
		}
		else if (score >= 70.0){
			return 'C';
		}
		else if (score >= 60.0){
			return 'D';
		}
		else {
			return 'F';
		}
	}
	
}