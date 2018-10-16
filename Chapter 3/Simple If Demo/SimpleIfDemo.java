import java.util.Scanner;

public class SimpleIfDemo {
	public static void main(String[] args) {
		
		double pay = 8.90;
		double score = 96;
		if (score > 90) {
			pay = pay * 1.03;
		}
		System.out.println(pay);
	}
}


/*
int y = 9;
int x = 0;
if (y > 0) {
	x = 1;
} 
*/  


/*
Scanner input = new Scanner(System.in);
System.out.println("Enter an integer: ");
int number = input.nextInt();
// if remainder is equal to 0 then print out HiFive.
if (number % 5 == 0)
	System.out.println("HiFive");
if (number % 2 == 0)
	System.out.println("HiEven");
*/