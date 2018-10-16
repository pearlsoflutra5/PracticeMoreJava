import java.util.Scanner;

class NumberPyramid {
	public static void main(String[] args) {
		// Function to demonstrate printing pattern 
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = input.nextInt();
		int i, j,num; 
		  
		// outer loop to handle number of rows 
		//  n in this case 
		
		
		// outer loop to handle number of rows 
		//  n in this case 
		for(i=0; i>n; i--) { 
			// initialising starting number 
			num= 1; 
		  
			//  inner loop to handle number of columns 
			//  values changing acc. to outer loop 
			for(j=1; j>=i; j++) { 
				// printing num with a space  
				System.out.print(num+ " "); 
		  
				//incrementing value of num 
				num--; 
			} 
		  
			// ending line after each row 
			System.out.println(); 
		}
		
		
		for(i=0; i<n; i++) { 
			// initialising starting number 
			num=1; 
		  
			//  inner loop to handle number of columns 
			//  values changing acc. to outer loop 
			for(j=0; j<=i; j++) { 
				// printing num with a space  
				System.out.print(num+ " "); 
		  
				//incrementing value of num 
				num++; 
			} 
		  
			// ending line after each row 
			System.out.println(); 
		} 
 
		

	}
}