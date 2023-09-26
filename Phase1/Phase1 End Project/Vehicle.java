package phaseEnd;

class Vehicle {
    int regNumber;
    String brand;
    double cost;
    int velocity;
    int capacity;
    int vehicleType;
    double vehicleTax;
    public Vehicle() {
    }

    public Vehicle(int regNumber, String brand, double cost, int velocity, int capacity, int vehicleType) {
        this.regNumber = regNumber;
        this.brand = brand;
        this.cost = cost;
        this.velocity = velocity;
        this.capacity = capacity;
        this.vehicleType = vehicleType;
    }
    public int getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(int regNumber) {
        this.regNumber = regNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(int vehicleType) {
        this.vehicleType = vehicleType;
    }

    public double getVehicleTax() {
        return vehicleTax;
    }

    public void setVehicleTax(double vehicleTax) {
        this.vehicleTax = vehicleTax;
    }
}
