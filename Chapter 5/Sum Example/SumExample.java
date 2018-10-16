import java.util.Scanner;

public class SumExample {
public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner read = new Scanner(System.in);

	//System.out.print("How many times you would like to try: ");
	int len = read.nextInt();

	for(int w = 0; w < len; w++)
	{
		System.out.print("Number: " );
		int input = read.nextInt();

		int remains = 1;
		int sum = remains;

		/* All I know we only need to check half of the given number as 
		   I learned ages ago. I mean (input / 2) :D */

		for(int i = 2; i <= input / 2; i++)
		{
			if(input % i == 0) sum += i;
		}

		System.out.print(" Result: " + sum);
	}

}
}