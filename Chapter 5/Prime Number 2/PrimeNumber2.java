import java.util.Scanner;

class PrimeNumber2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter how many primes you want to find: ");
		int rerun =  input.nextInt();
		int count = 0;
		
		// how many times do you want to find prime numbers
		while ( count < rerun ){
		
			System.out.print("Enter a number to see if it is prime: ");
		
			int number = input.nextInt();
		  
				boolean isPrime = true;
			
				// run for primes
				for (int divisor = 2; divisor <= number / 2; divisor++) { 
					if (number % divisor == 0) { 	
						isPrime = false;  
						break;  
					}
				} 
		
			// if prime then..
			if (isPrime) {
			System.out.println(number + " is prime");
			}
			else {
			System.out.println(number + " is not prime");	
			}
			
			count++;

		}
		
	}
}