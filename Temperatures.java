
import java.util.Scanner;
public class Temperatures {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array for month 
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        // Array for month temperatures
        double[] temperatures = new double[12];

        // Input temperatures for each month
        for (int i = 0; i < 12; i++) {
            System.out.print("Average temperature for " + months[i] + ": ");
            temperatures[i] = scanner.nextDouble();
        }

        // Prompt the user for the month to be viewed
        System.out.print("Type month name or type 'year' for temperature information: ");
        String selectedMonth = scanner.next();

        if (selectedMonth.equalsIgnoreCase("year")) {
            displayYearlyAverage(months, temperatures);
        } else {
            displayMonthlyAverage(selectedMonth, months, temperatures);
        }
    }

    // Method to display information for a specific month
    private static void displayMonthlyAverage(String selectedMonth, String[] months, double[] temperatures) {
        int monthIndex = -1;
        for (int i = 0; i < 12; i++) {
            if (months[i].equalsIgnoreCase(selectedMonth)) {
                monthIndex = i;
                break;
            }
        }

        if (monthIndex != -1) {
            double averageMonth = temperatures[monthIndex];
            System.out.println("Month: " + months[monthIndex]);
            System.out.println("Average Temperature: " + averageMonth);
        } else {
            System.out.println("Invalid Entry");
        }
    }

    // Method to display yearly information
    private static void displayYearlyAverage(String[] months, double[] temperatures) {
        double yearlyAverage = 0;
        double highestMonthlyAverage = temperatures[0];
        double lowestMonthlyAverage = temperatures[0];

        for (int i = 0; i < 12; i++) {
            yearlyAverage += temperatures[i];

            if (temperatures[i] > highestMonthlyAverage) {
                highestMonthlyAverage = temperatures[i];
            }

            if (temperatures[i] < lowestMonthlyAverage) {
                lowestMonthlyAverage = temperatures[i];
            }

            System.out.println("Month: " + months[i] + ", Temperature: " + temperatures[i]);
        }

        
        System.out.println("Highest Monthly Average: " + highestMonthlyAverage);
        System.out.println("Lowest Monthly Average: " + lowestMonthlyAverage);
        
        yearlyAverage /= 12;

        System.out.println("Yearly Average: " + yearlyAverage);

    }
}


