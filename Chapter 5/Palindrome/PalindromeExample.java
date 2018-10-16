import java.util.Scanner;

class PalindromeExample{  
 public static void main(String args[]){  
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a integer: ");
	int n = input.nextInt(); //It is the number variable to be checked for palindrome 
	int r,sum = 0,temp;  
	
	temp = n;    
	while( n > 0) {    
	 	r = n % 10;  //getting remainder  
		sum = ( sum * 10 ) + r;    
		n = n / 10;    
	}    
	
	if(temp == sum)    
		System.out.println("palindrome ");    
	else    
		System.out.println("not palindrome");    
}  
}  