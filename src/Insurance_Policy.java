class InsurancePolicy {
	//Variables
    private String kodikos_paketou;
    private String perigrafi;
    private String diarkeia;

    //Constructor
    public InsurancePolicy(String kodikos_paketou, String perigrafi, String diarkeia) {
        this.kodikos_paketou = kodikos_paketou;
        this.perigrafi = perigrafi;
        this.diarkeia = diarkeia;
    }
    
    //Getters
    public String getKodikosPaketou() {
        return kodikos_paketou;
    }

    public String getPerigrafi() {
        return perigrafi;
    }

    public String getDiarkeia() {
        return diarkeia;
    }
    
    //Print data
    public void printData() {
    	System.out.println("Policy code: "+kodikos_paketou+", description: "
    +perigrafi+", duration: "+diarkeia);
    }
    
}