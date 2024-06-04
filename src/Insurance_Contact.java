class InsuranceContract {
	//Variables
    private Customer customer;
    private Vehicle vehicle;
    private InsurancePolicy insurancePolicy;
    private double cost;

    //Constructor
    public InsuranceContract(Customer customer, Vehicle vehicle, InsurancePolicy insurancePolicy, double cost) {
        this.customer = customer;
        this.vehicle = vehicle;
        this.insurancePolicy = insurancePolicy;
        this.cost = cost;
    }
    
    //Getters
    public Customer getCustomer() {
        return customer;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public InsurancePolicy getInsurancePolicy() {
        return insurancePolicy;
    }

    public double getCost() {
        return cost;
    }

    //Print data
    //using Customer,Vehicle and insurancePolicy objects
    public void printData() {
        System.out.println("Customer: " + customer.getName() + " " + customer.getLastName() +
                           ", Vehicle plate: " + vehicle.getPinakida() +
                           ", description: " + insurancePolicy.getPerigrafi() +
                           ", cost: " + cost);
    }
}
