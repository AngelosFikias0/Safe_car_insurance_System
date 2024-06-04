import java.util.*;

class Customer {
	//Variables & list for insurance contract
    private String name;
    private String lastName;
    private String phone;
    private String email;
    private String arithmos_Taftotitas;
    private List<InsuranceContract> insuranceContracts;
    
    //Constructor
    public Customer(String name, String lastName, String phone, String email, String arithmos_Taftotitas) {
        this.name = name;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.arithmos_Taftotitas = arithmos_Taftotitas;
        this.insuranceContracts = new ArrayList<>();
    }
    
    //Getters
    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getArithmosTaftotitas() {
        return arithmos_Taftotitas;
    }
    
    //Used for insurance contract list
    public void addInsuranceContract(InsuranceContract contract) {
        insuranceContracts.add(contract);
    }
    
    //Print data
    public void printData() {
    	System.out.println("Name:"+name+", last name:"+lastName+", phone:"
    +phone+", email:"+email+", identity card number:"+arithmos_Taftotitas);
    }
    
    //Print insurance info for each customer
    public void printInsuranceDetails() {
        System.out.println("Customer: " + name + " " + lastName);
        double totalCost = 0;
        //Uses the insurance contract of the user to find the vehicle that matches
        //and to find description and total cost
        for (InsuranceContract contract : insuranceContracts) {
            System.out.println("Vehicle Plate: " + contract.getVehicle().getPinakida() +
                               ", Insurance Description: " + contract.getInsurancePolicy().getPerigrafi() +
                               ", Cost: " + contract.getCost());
            totalCost += contract.getCost();
        }
        System.out.println("Total Insurance Cost: " + totalCost);
    }
    
}
