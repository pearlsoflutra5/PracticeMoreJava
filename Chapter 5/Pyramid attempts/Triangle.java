import java.util.Scanner;

class Triangle {
	public static void main(String[] args) {
			// number of spaces 
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter a number: ");
			int n = input.nextInt();
			int k = 2*n - 2; 
		   
			// outer loop to handle number of rows 
			//  n in this case 
			for (int i = 0; i <= n; i++) { 
		  
				// inner loop to handle number spaces 
				// values changing acc. to requirement 
				for (int j = 0; j < k; j++) { 
					// printing spaces 
					System.out.print(" "); 
				} 
		   
				// decrementing k after each loop 
				k = k - 1; 
		   
				//  inner loop to handle number of columns 
				//  values changing acc. to outer loop 
				for (int j=0; j<=i; j++ ) { 
					// printing stars 
					System.out.print(k + " "); 
				} 
		   
				// ending line after each row 
				System.out.println(); 
			} 
		 
	}
}