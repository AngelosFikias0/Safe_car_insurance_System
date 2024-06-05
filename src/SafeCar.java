import java.util.*;

//Main class
public class SafeCar {
    public static void main(String[] args) {
    	//lists
    	CustomerList customerlist = new CustomerList();
    	VehicleList vehiclelist = new VehicleList();
    	List<InsurancePolicy> insPlist=new ArrayList<InsurancePolicy>();
    	List<InsuranceContract> insClist=new ArrayList<InsuranceContract>();
    	
    	//Variables and scanner
        int choice;
        Scanner scanner = new Scanner(System.in);

        //Menu choice
        System.out.println("Please press: 1 To start the main process or 2 to exit");
        choice = scanner.nextInt();
        scanner.close();

        switch(choice) {
            case 1: 
            	// The data input is set for the scenario
                // Create customers
                Customer customer1 = new Customer("Maria", "Papadopoulou", "2310264368", "maria.papadopoulou@gmail.com", "AO79432");
                customerlist.add(customer1);
                Customer customer2 = new Customer("Evanthia", "Papagianni", "2310245368", "evanthia.papagianni@gmail.com", "AO77813");
                customerlist.add(customer2);
                Customer customer3 = new Customer("Vasilis", "Karagiannis", "2310245668", "ioannis.karagiannis@gmail.com", "AO45698");
                customerlist.add(customer3);
                //Test scenario for adding the same customer twice:
                System.out.println("\nTest for inputing the same customer twice:");
                Customer customer4 = new Customer("Vasilis", "Karagiannis", "2310245668", "ioannis.karagiannis@gmail.com", "AO45698");
                customerlist.add(customer4);
                
                //print success
                System.out.println("New customers have been created");
                
                // Create vehicles
                Vehicle vehicle1 = new Vehicle("Mercedes", "GLC", "2020", "XKP8923", "7C3FR76A515072256");
                vehiclelist.add(vehicle1);
                Vehicle vehicle2 = new Vehicle("Subaru", "Forester", "2018", "NII4269", "7C3FR76A555071465");
                vehiclelist.add(vehicle2);
                Vehicle vehicle3 = new Vehicle("Ford", "Ranger", "2022", "KOH4681", "7C3FR76A55504645");
                vehiclelist.add(vehicle3);
                //Test scenario for adding the same customer twice:
                System.out.println("\nTest for inputing the same vehicle twice:");
                Vehicle vehicle4 = new Vehicle("Ford", "Ranger", "2022", "KOH4681", "7C3FR76A55504645");
                vehiclelist.add(vehicle4);
                
                //print success
                System.out.println("New vehicles have been created");
                
                // Create insurance policies
                InsurancePolicy insurancePolicy1 = new InsurancePolicy("MI93", "Mixed Insurance", "6");
                insPlist.add(insurancePolicy1);
                InsurancePolicy insurancePolicy2 = new InsurancePolicy("B56", "Basic Insurance", "6");
                insPlist.add(insurancePolicy2);
                InsurancePolicy insurancePolicy3 = new InsurancePolicy("O58", "With Roadside Assistance", "6");
                insPlist.add(insurancePolicy3);
                //print success
                System.out.println("New insurance policies have been created");
                
                // Create insurance contracts
                InsuranceContract insuranceContract1 = new InsuranceContract(customer1, vehicle1, insurancePolicy2, 60.0);
                insClist.add(insuranceContract1);
                InsuranceContract insuranceContract2 = new InsuranceContract(customer2, vehicle2, insurancePolicy1, 120.0);
                insClist.add(insuranceContract2);
                InsuranceContract insuranceContract3 = new InsuranceContract(customer2, vehicle3, insurancePolicy3, 80.0);
                insClist.add(insuranceContract3);
                //print success
                System.out.println("New insurance contracts have been created\n");
                
                /*
                // Alternative: Input Data from User
                // Input Customers
                char continueInput = 'Y';
                while (continueInput == 'Y' || continueInput == 'y') {
                    System.out.println("Enter details for a new Customer:");
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Last Name: ");
                    String lastName = scanner.nextLine();
                    System.out.print("Phone: ");
                    String phone = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Arithmos Taftotitas: ");
                    String arithmosTaftotitas = scanner.nextLine();
                    Customer customer = new Customer(name, lastName, phone, email, arithmosTaftotitas);
                    customerlist.add(customer);
                    
                    System.out.print("Do you want to add another customer? (Y/N): ");
                    continueInput = scanner.nextLine().charAt(0);
                }
                System.out.println("Customers have been created.");

                // Input Vehicles
                continueInput = 'Y';
                while (continueInput == 'Y' || continueInput == 'y') {
                    System.out.println("Enter details for a new Vehicle:");
                    System.out.print("Marka: ");
                    String marka = scanner.nextLine();
                    System.out.print("Modelo: ");
                    String modelo = scanner.nextLine();
                    System.out.print("Year: ");
                    String year = scanner.nextLine();
                    System.out.print("Pinakida: ");
                    String pinakida = scanner.nextLine();
                    System.out.print("Arithmos Plaisio: ");
                    String arithmosPlaisio = scanner.nextLine();
                    Vehicle vehicle = new Vehicle(marka, modelo, year, pinakida, arithmosPlaisio);
                    vehiclelist.add(vehicle);

                    System.out.print("Do you want to add another vehicle? (Y/N): ");
                    continueInput = scanner.nextLine().charAt(0);
                }
                System.out.println("Vehicles have been created.");

                // Input Insurance Policies
                continueInput = 'Y';
                while (continueInput == 'Y' || continueInput == 'y') {
                    System.out.println("Enter details for a new Insurance Policy:");
                    System.out.print("Kodikos Paketou: ");
                    String kodikosPaketou = scanner.nextLine();
                    System.out.print("Perigrafi: ");
                    String perigrafi = scanner.nextLine();
                    System.out.print("Diarkeia: ");
                    String diarkeia = scanner.nextLine();
                    InsurancePolicy insurancePolicy = new InsurancePolicy(kodikosPaketou, perigrafi, diarkeia);
                    insPlist.add(insurancePolicy);

                    System.out.print("Do you want to add another insurance policy? (Y/N): ");
                    continueInput = scanner.nextLine().charAt(0);
                }
                System.out.println("Insurance policies have been created.");

                // Input Insurance Contracts
                continueInput = 'Y';
                while (continueInput == 'Y' || continueInput == 'y') {
                    System.out.println("Enter details for a new Insurance Contract:");
                    System.out.print("Customer Index (0-" + (customerlist.size() - 1) + "): ");
                    int customerIndex = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    System.out.print("Vehicle Index (0-" + (vehiclelist.size() - 1) + "): ");
                    int vehicleIndex = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    System.out.print("Insurance Policy Index (0-" + (insPlist.size() - 1) + "): ");
                    int insurancePolicyIndex = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    System.out.print("Cost: ");
                    double cost = scanner.nextDouble();
                    scanner.nextLine(); // consume newline
                    InsuranceContract insuranceContract = new InsuranceContract(customerlist.get(customerIndex), vehiclelist.get(vehicleIndex), insPlist.get(insurancePolicyIndex), cost);
                    insClist.add(insuranceContract);

                    System.out.print("Do you want to add another insurance contract? (Y/N): ");
                    continueInput = scanner.nextLine().charAt(0);
                }
                System.out.println("Insurance contracts have been created.\n");
                */
                
                //Add insurance to the customer it matches
                customer1.addInsuranceContract(insuranceContract1);
                customer2.addInsuranceContract(insuranceContract2);
                customer2.addInsuranceContract(insuranceContract3);
                
                // Print customer details
                customerlist.printData();
                
                // Print vehicle details
                vehiclelist.printData();
                
                // Print Insurance policy details
                System.out.println("Insurance policies: ");
                for(InsurancePolicy inspolicy:insPlist) {
                	inspolicy.printData();
                }
                System.out.println();
                
                // Print insurance contract details
                System.out.println("Insurance Contracts:");
                for(InsuranceContract inscontract:insClist) {
                	inscontract.printData();
                }
                System.out.println();
                break;

            case 2:
            	//User chooses to exit the program
                System.out.println("Exiting the system...");
                break;

            default:
            	//Wrong input
                System.out.println("Invalid choice. Exiting...");
                break;
        }
    }
}
