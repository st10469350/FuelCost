package com.mycompany.fuelcostcalculator;
import java.util.Scanner;

public class FuelCostCalculator {
 
     // Method 1 - Calculate fuel needed based on distance and efficiency
    public static double calculateFuelNeeded(double distance, double efficiency) {
        // Formula: Fuel Needed = Distance ÷ Fuel Efficiency
        double fuelNeeded = distance / efficiency;
        return fuelNeeded;
    }
    
    // Method 2 - Calculate total cost based on fuel needed and fuel price
    public static double calculateTotalCost(double fuelNeeded, double fuelPrice) {
        // Formula: Total Cost = Fuel Needed × Fuel Price
        double totalCost = fuelNeeded * fuelPrice;
        return totalCost;
    }
    
    // Method 3 - Calculate everything at once with all three inputs
    public static double calculateTripCost(double distance, double efficiency, double fuelPrice) {
        // Step 1: Calculate fuel needed
        double fuelNeeded = distance / efficiency;
        
        // Step 2: Calculate total cost
        double totalCost = fuelNeeded * fuelPrice;
        
        // Step 3: Return the final cost
        return totalCost;
    }

    public static void main(String[] args) {
      
       Scanner scanner = new Scanner(System.in);
        
        // Display welcome message
        System.out.println("\n<<<<<<<<<<<<<<<<<<<<<< FUEL COST CALCULATOR >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n");
        System.out.println("Let's calculate how much you'll spend on fuel!\n");
        
        // Prompt user for trip distance
        System.out.print("Enter the total trip distance (in kilometers): ");
        double distance = scanner.nextDouble();
        
        // Prompt user for fuel efficiency
        System.out.print("Enter your car's fuel efficiency (km per liter): ");
        double efficiency = scanner.nextDouble();
        
        // Prompt user for fuel price
        System.out.print("Enter the fuel price per liter:R");
        double fuelPrice = scanner.nextDouble();
        
        
      
        // Print a separator line for better readability
        System.out.println("\n+++++++++++++++++ CALCULATION RESULTS +++++++++++++++++++++++++++++++++++++\n");
        
        // Method 1 approach: Calculate fuel needed first
        double fuelRequired = calculateFuelNeeded(distance, efficiency);
        System.out.println("Fuel needed for the trip: " + fuelRequired + " liters");
        
        // Method 2 approach: Calculate total cost using fuel needed
        double finalCost = calculateTotalCost(fuelRequired, fuelPrice);
        System.out.println("Total fuel cost: R" + finalCost);
        
        // Method 3 approach: Calculate everything at once
        double totalCostDirect = calculateTripCost(distance, efficiency, fuelPrice);
        System.out.println("\n(Verified using direct calculation: $" + totalCostDirect + ")");
        
        // Display summary
        System.out.println("\n ******************** TRIP SUMMARY *****************************\n");
        System.out.println("Distance: " + distance + " km");
        System.out.println("Fuel efficiency: " + efficiency + " km/liter");
        System.out.println("Fuel price: R" + fuelPrice + " per liter");
        System.out.println("Fuel needed: " + fuelRequired + " liters");
        System.out.println("TOTAL COST: R" + finalCost);
      
    }
}
