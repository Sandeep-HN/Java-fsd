package phaseEnd;

import java.util.ArrayList;

class VehicleOperations {
    ArrayList<Vehicle> vehicles = new ArrayList<>();

    public void addVehicleDetails(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void viewVehicleDetails() {
        if (vehicles.isEmpty()) {
            System.out.println("No Data Present at This Moment");
        } else {   
        	System.out.println("=================================================================================================================");
        	System.out.println("Reg Number\tBrand\t\tCost\t\t\tVelocity\tSeatCapacity\t\tTax");
        	System.out.println("=================================================================================================================");
            for (Vehicle vehicle : vehicles) {
                double vehicleTax = calculateVehicleTax(vehicle);
                vehicle.setVehicleTax(vehicleTax);
                System.out.println(vehicle.regNumber + "\t\t" + vehicle.brand + "\t\t" + vehicle.cost + "\t\t" + vehicle.velocity + "\t\t" + vehicle.capacity + "\t\t\t" + vehicleTax + "/-");
            	System.out.println("=============================================================================================================");
            }
        }
    }

    public double calculateVehicleTax(Vehicle vehicle) {
        double cost = vehicle.cost;
        int velocity = vehicle.velocity;
        int capacity = vehicle.capacity;
        int vehicleType = vehicle.vehicleType;

        double tax;
        switch (vehicleType) {
            case 1:
                tax = velocity + capacity + (0.10 * cost);
                break;
            case 2:
                tax = velocity + capacity + (0.11 * cost);
                break;
            case 3:
                tax = velocity + capacity + (0.12 * cost);
                break;
            default:
                throw new IllegalArgumentException("Invalid input for vehicle type. Use 1, 2, or 3.");
        }

        return tax;
    }
}
