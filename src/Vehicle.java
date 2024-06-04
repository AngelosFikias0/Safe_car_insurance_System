class Vehicle {
	//Variables
    private String marka;
    private String modelo;
    private String year;
    private String pinakida;
    private String arithmos_Plaisiou;

    //Constructor
    public Vehicle(String marka, String modelo, String year, String pinakida, String arithmos_Plaisiou) {
        this.marka = marka;
        this.modelo = modelo;
        this.year = year;
        this.pinakida = pinakida;
        this.arithmos_Plaisiou = arithmos_Plaisiou;
    }
    
    //Getters:
    public String getMarka() {
        return marka;
    }

    public String getModelo() {
        return modelo;
    }

    public String getYear() {
        return year;
    }

    public String getPinakida() {
        return pinakida;
    }

    public String getArithmos_Plaisiou() {
        return arithmos_Plaisiou;
    }
    
    //Print data
    public void printData() {
    	System.out.println("Brand: "+marka+", model: "+modelo+", year: "+year+
    			", vehicle plate: "+pinakida+""
    			+ ", vehicle identification number:"+arithmos_Plaisiou);
    }
    
}
