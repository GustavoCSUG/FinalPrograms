import java.util.Scanner;
public class Counter {
	 public static void main(String[] args) {
	       Scanner input = new Scanner(System.in);
	       double total = 0, max = Double.MIN_VALUE, min = Double.MAX_VALUE, value;
	       int counter = 0;

	       while (counter < 5) {
	           System.out.println("Enter a number:");
	           value = input.nextDouble();
	           total += value;
	           if (value > max) max = value;
	           if (value < min) min = value;
	           counter++;
	           
	       }
	      
	       input.close();
	      
	       double average = total / 5;
	       double interest = total * 0.2;

	        System.out.println("Total: " + total);
	        System.out.println("Average: " + average);
	        System.out.println("Maximum: " + max);
	        System.out.println("Minimum: " + min);
	        System.out.println("Interest on total at 20%: " + interest);
	 }
}


