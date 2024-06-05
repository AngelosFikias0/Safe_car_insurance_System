import java.util.ArrayList;

public class CustomerList {
    // ArrayList to store the list of customers
    private ArrayList<Customer> customerList;

    // Constructor to initialize the list
    public CustomerList() {
        customerList = new ArrayList<>();
    }

    // Method to check if a customer with the same identity card number already exists in the list
    private boolean customerExists(Customer customer) {
        // Check if any customer in the list has the same identity card number as the given customer
        for (Customer existingCustomer : customerList) {
            if (existingCustomer.getArithmosTaftotitas().equals(customer.getArithmosTaftotitas())) {
                return true; // Customer with same identity card number found
            }
        }
        return false; // No customer with same identity card number found
    }

    // Method to add a customer to the list
    public void add(Customer customer) {
        // Check if the customer already exists in the list
        if (!customerExists(customer)) {
            customerList.add(customer);
        } else {
            // Print a message indicating that the customer already exists in the list
            System.out.println("\nCustomer already exists in the list:");
            // Print the customer's data
            customer.printData();
        }
    }

    // Method to get all customers
    public ArrayList<Customer> getCustomers() {
        return customerList;
    }

    // Method to remove a customer from the list
    public boolean removeCustomer(Customer customer) {
        return customerList.remove(customer);
    }

    // Method to print data of all customers in the list
    public void printData() {
        System.out.println("Customers: ");
        for (Customer customer : customerList) {
            customer.printData();
        }
    }
}
