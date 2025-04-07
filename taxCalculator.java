
package critical_thinking1;

import java.util.Scanner;

public class taxCalculator {
	public static void main(String[] args) {
		
		// start a new scanner object in order to take input from user.
		
		Scanner scanner = new Scanner(System.in);
		
		// prompt user for there weekly income using print method.
		
		System.out.print("Enter weekly income: $");
		
		// accept the user input into a variable called income.
		
		double income = scanner.nextDouble();
		
		// set variable called taxRate to zero
		
		double taxRate = 0;
		
		// implement an if-else block for an appropriate tax rate
		
		if (income < 500) {
			taxRate = 0.10;
		} else if (income < 1500) {
			taxRate = 0.15;
		} else if (income < 2500) {
			taxRate = 0.20;
		} else if (income >= 2500) {
			taxRate = 0.30;
		}
		
		// variable taxWitholding will take value of income * taxRate
		
		double taxWithholding = income * taxRate;
		
		// Print weekly income and income with tax withholding
		
		System.out.printf("weekly income: $%.2f%n", income);
		System.out.printf("Average weekly Tax withholding: $%.2f%n", taxWithholding);
		
		// Close scanner
		
		scanner.close();
	}
 
}
