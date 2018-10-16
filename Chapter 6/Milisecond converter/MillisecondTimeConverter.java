/*
Kacie Rae
10-11-18
Exercise 6.25 Converting milliseconds to regular time with days. 
*/

import java.util.Scanner;

class MillisecondTimeConverter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a time in milliseconds: ");
		long totalMillis = input.nextLong();
		
		System.out.print("the converted time from miliseconds is " + convertMillis(totalMillis));
	}
	
	public static String convertMillis(long millis) {
		long totalSeconds = millis / 1000;
		int seconds = (int)(totalSeconds % 60);
		long totalMinutes = totalSeconds / 60;
		int minutes = (int)(totalMinutes % 60);
		long totalHours = totalMinutes / 60;
		int hours = (int)(totalHours % 24);
		long days = totalHours / 24;

		
		return days + ":" + hours + ":" + minutes + ":" + seconds; 
		//added days for fun but all course code is here.   
		
	}
}