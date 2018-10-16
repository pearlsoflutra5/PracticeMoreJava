import java.util.Scanner;;
public class TestMax { 
	/** Main method */ 
	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in);
		System.out.print ("Enter 2 values and to find the max. ");
		int i = input.nextInt(); 
		int j = input.nextInt(); 
		int k = max(i, j); 
		System.out.println("The maximum of " + i +  " and " + j + " is " + k); 
	}  
	
	/** Return the max of two numbers */ 
	public static int max(int num1, int num2) { 
		int result; 

		if (num1 > num2) 
		result = num1; 
		else 
		result = num2; 

		return result; 
	} 
}

 