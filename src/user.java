//This is a class used in the class diagramm and is not to be
//used for this scenario
public class user {
    private String code;
    private int password;

    public user(String code, int password) {
        this.code = code;
        this.password = password;
    }

    public void setCredentials(String code, int password) {
        this.code = code;
        this.password = password;
    }

    public String getCode() {
        return code;
    }

    public int getPassword() {
        return password;
    }
}
