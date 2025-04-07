
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
        List<automotive> inventory = new ArrayList<>();
        automotive automobile = new automotive("Chevrolet", "Malibu", "grey", "black", "Hayward", 2018, 25000, 8947564);

        System.out.println("Vehicle Information:");
        String[] infoArray = automotive.listVehicleInformation(inventory);
        for (String info : infoArray) {
            System.out.println(info);
        }

        System.out.println("\nRemoving vehicle...");
        System.out.println(automotive.removeVehicle(inventory, 0));

        System.out.println("\nAdding new vehicle...");
           String message = automotive.addVehicle(inventory, automobile);
    System.out.println(message);

    System.out.println("\nVehicle Information:");
    infoArray = automotive.listVehicleInformation(inventory);
    for (String info : infoArray) {
        System.out.println(info);
    }

    System.out.println("\nUpdating vehicle...");
    message = automotive.updateVehicle(inventory, 0, "Chevrolet", "Camaro", "red", "black", "Modesto", 2022, 30000, 8394059);
    System.out.println(message);

    System.out.println("\nVehicle Information:");
    infoArray = automotive.listVehicleInformation(inventory);
    for (String info : infoArray) {
        System.out.println(info);
    }

    System.out.println("\nDo you want to print the vehicle information to a file? (Y/N)");
    Scanner scanner = new Scanner(System.in);
    String response = scanner.nextLine();
    scanner.close();
    if (response.equalsIgnoreCase("Y")) {
        printInventoryToFile(inventory);
    } else {
        System.out.println("Vehicle information will not be printed to a file.");
    }
   
}

public static void printInventoryToFile(List<automotive> inventory) {
    try {
        File file = new File("/Users/cvtavo/Documents/untitled folder/Untitled.txt");
        FileWriter writer = new FileWriter(file);
        String[] infoArray = automotive.listVehicleInformation(inventory);
        for (String info : infoArray) {
            writer.write(info + "\n");
        }
        writer.close();
        System.out.println("Vehicle information printed to file.");
    } catch (IOException e) {
        System.out.println("Error: Unable to print vehicle information to file.");
    }
}

}
