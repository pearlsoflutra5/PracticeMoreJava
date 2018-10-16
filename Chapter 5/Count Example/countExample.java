import java.util.Scanner;

public class countExample {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String line = input.next();
		
		int vowels = 0, consonants = 0;

		line = line.toUpperCase();
		
		for(int i = 0; i < line.length(); ++i) {
			char ch = line.charAt(i);
			if(ch == 'A') {
				vowels++;
			}
			if(ch == 'E'){
				vowels++;
				}
			if(ch == 'I'){
				vowels++;
			}
			if(ch == 'O'){
				vowels++;
			}
			if(ch == 'U'){
				vowels++;
			}
			
			else if((ch >= 'A' && ch <= 'Z' )) {
				consonants++;
			}
			
		}

		System.out.println("Vowels: " + vowels);
		System.out.println("Consonants: " + consonants);
	}
}