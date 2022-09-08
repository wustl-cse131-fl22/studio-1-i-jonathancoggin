package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("What year would you like to check");
		int year = input.nextInt();
		
		boolean divisibleByFour = year % 4 == 0;
		boolean divisibleByHundred = year % 100 == 0;
		boolean divisibleby4Hundred = year % 400 == 0;
		
		boolean leapYear = divisibleByFour && (divisibleByHundred && divisibleby4Hundred);
		
		System.out.println("Is the year " + year + " a leap year: " + leapYear);
		
		

	}

}
