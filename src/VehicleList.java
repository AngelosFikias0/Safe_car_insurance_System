import java.util.ArrayList;

public class VehicleList {
    private ArrayList<Vehicle> vehicleList;

    // Constructor to initialize the list
    public VehicleList() {
        vehicleList = new ArrayList<>();
    }
    
 // Method to check if a vehicle with the same vehicle plate already exists in the list
    private boolean vehicleExists(Vehicle vehicle) {
        // Check if any vehicle in the list has the same vehicle plate as the given vehicle
        for (Vehicle existingVehicle : vehicleList) {
            if (existingVehicle.getPinakida().equals(vehicle.getPinakida())) {
                return true; // Vehicle with same vehicle plate found
            }
        }
        return false;}// No vehicle with same vehicle plate found

    // Method to add a vehicle to the list
    public void add(Vehicle vehicle) {
        // Check if the vehicle already exists in the list
        if (!vehicleExists(vehicle)) {
            vehicleList.add(vehicle);
        } else {
        	System.out.println("\nVehicle already exists in the list:");
            vehicle.printData(); // Print the vehicle's data
        }
    }

    // Method to remove a vehicle from the list
    public boolean remove(Vehicle vehicle) {
        return vehicleList.remove(vehicle);
    }

    // Method to get all vehicles
    public ArrayList<Vehicle> getVehicles() {
        return vehicleList;
    }
    
    public void printData() {
    	System.out.println("\nVehicles: ");
        for(Vehicle vehicle:vehicleList) {
        	vehicle.printData();
        }
        System.out.println();    
    }
}
