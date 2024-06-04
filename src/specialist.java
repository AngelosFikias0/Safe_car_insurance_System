//This is a class used in the class diagramm and is not to be
//used for this scenario
public class specialist extends user_of_system {
    private String name;

    public specialist(String aCode, int aPassword, String aName) {
        super(aCode, aPassword);
        this.name = aName;
    }

    public String getName() {
        return name;
    }

    public void setName(String aName) {
        this.name = aName;
    }
}
