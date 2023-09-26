package phaseEnd;

import java.util.Scanner;
public class taxCalculation {
    public static void main(String[] args) {
    	while(true) {
    	System.out.println("+------------------------------------+");
    	System.out.println("|   WELCOME TO TAX CALCULATION APP   |");
    	System.out.println("+------------------------------------+");
    	Scanner scanner = new Scanner(System.in);
    	String username;
    	String password;
    	String id = "admin";
    	String pass = "admin123";
        System.out.print("Username: ");
        username = scanner.nextLine();
        System.out.print("Password: ");
        password = scanner.nextLine();
        if (username.equals(id) && password.equals(pass)) {
            System.out.println("Login successful.");
            break;
        }
        else {
            System.out.println("Invalid credentials. Please try again.\n");
        }
    	}
    	Scanner scanner = new Scanner(System.in);
        PropertyOperations propertyOperations = new PropertyOperations();
        VehicleOperations vehicleOperations = new VehicleOperations();
        Property property = null; 
        Vehicle vehicle = null;
        while (true) {
            System.out.println("1. Property Tax");
            System.out.println("2. Vehicle Tax");
            System.out.println("3. Total");
            System.out.println("4. Exit");
            System.out.print("Select an Option : ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                	int id;
                    double baseValueOfLand;
                    char isInCity;
                    int ageOfProp;
                    double builtupArea;
                 while(true) {
                 	System.out.println("1. Add property details:");
                	System.out.println("2. Calculate property tax:");
                	System.out.println("3. Display all properties:");
                	System.out.println("4. Back to main menu");

                    int subChoice1 = scanner.nextInt();
                    scanner.nextLine(); 
                    
                    switch(subChoice1) {
                    case 1: 
	                    System.out.print("Enter ID for Land: ");
	                    id = scanner.nextInt();
	                    scanner.nextLine(); 
	                    
	                    System.out.print("Enter Base Value of Land: ");
	                    baseValueOfLand = scanner.nextDouble();
	                    scanner.nextLine(); 
	
	                    System.out.print("Is the Property in the City? (Y/N): ");
	                    isInCity = scanner.nextLine().charAt(0);
	
	                    System.out.print("Enter Age of Construction: ");
	                    ageOfProp = scanner.nextInt();
	                    scanner.nextLine(); 
	                    
	                    System.out.print("Enter Built-up Area of the land: "); 
	                    builtupArea = scanner.nextDouble();
	                    scanner.nextLine();
	                    
	                    property = new Property(id, baseValueOfLand, isInCity, ageOfProp, builtupArea);
	                    propertyOperations.addPropertyDetails(property);
	                    continue;
                    case 2:
                        double propertyTax = propertyOperations.calculatePropertyTax(property);
                       property.setPropertyTax(propertyTax);
                        System.out.println("Property Tax Calculated: " + propertyTax + "/-");
                        continue;
                    case 3:
                    	propertyOperations.viewPropertyDetails();
                    	continue;
                    case 4:
                    	break;
                    }
                  break;
            }
                break;
			case 2:
                    int regNumber;
                    String brand;
                    double cost;
                    int velocity;
                    int capacity;
                    int vehicleType;
                    while(true) {
                     	System.out.println("1. Add vehicle details:");
                    	System.out.println("2. Calculate vehicle tax:");
                    	System.out.println("3. Display all vehicles:");
                    	System.out.println("4. Back to main menu");

                    int subChoice2= scanner.nextInt();
                    scanner.nextLine();
                    
                    switch(subChoice2) {
                    case 1:
	                    System.out.print("Enter Registration Number: ");
	                    regNumber = scanner.nextInt();
	                    scanner.nextLine(); 
	
	                    System.out.print("Enter Vehicle Brand: ");
	                    brand = scanner.nextLine();
	
	                    System.out.print("Enter Maximum Velocity (kmph): ");
	                    velocity = scanner.nextInt();
	                    scanner.nextLine(); 
	
	                    System.out.print("Enter Capacity (Number of Seats): ");
	                    capacity = scanner.nextInt();
	                    scanner.nextLine(); 
	
	                    System.out.println("Select Vehicle Type:");
	                    System.out.println("1. Petrol-driven");
	                    System.out.println("2. Diesel-driven");
	                    System.out.println("3. CNG/LPG-driven");
	                    System.out.print("Enter Vehicle Type (1/2/3): ");
	                    vehicleType = scanner.nextInt();
	                    scanner.nextLine(); 
	
	                    System.out.print("Enter Cost of Vehicle: ");
	                    cost = scanner.nextDouble();
	                    scanner.nextLine(); 
	                    vehicle = new Vehicle(regNumber, brand, cost, velocity, capacity, vehicleType);
	                    vehicleOperations.addVehicleDetails(vehicle);
	                    continue;
                    case 2:
	                    double vehicleTax = vehicleOperations.calculateVehicleTax(vehicle);
	                    vehicle.setVehicleTax(vehicleTax);
	                    System.out.println("Vehicle Tax Calculated: " + vehicleTax + "/-");;
	                    continue;
                    case 3:
                    	vehicleOperations.viewVehicleDetails();
                    	continue;
                    case 4:
                    	break;
            }
                    break;
                    }
                    break;
                case 3:
                                double totalPropertyTax = calculateTotalTax(propertyOperations);
                                double totalVehicleTax = calculateTotalTax(vehicleOperations);
                                double totalTaxPayable = totalPropertyTax + totalVehicleTax;
                                System.out.println("Property Total Tax : " + totalPropertyTax + "/-");
                                System.out.println("Vehicle Total Tax  : " + totalVehicleTax + "/-");
                                System.out.println("Total              : " + totalTaxPayable + "/-");
                    break;

                case 4:
                	System.out.println("THANKS VISIT AGAIN");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid option, please choose again.");
            }
        }
    }
    private static double calculateTotalTax(PropertyOperations propertyOperations) {
        double totalPropertyTax = 0;
        for (Property property : propertyOperations.getProperties()) {
            totalPropertyTax += property.getPropertyTax();
        }
        return totalPropertyTax;
    }

    private static double calculateTotalTax(VehicleOperations vehicleOperations) {
        double totalVehicleTax = 0;
        for (Vehicle vehicle : vehicleOperations.vehicles) {
            totalVehicleTax += vehicle.getVehicleTax();
        }
        return totalVehicleTax;
    }

}
