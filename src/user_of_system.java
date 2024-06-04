//This is a class used in the class diagramm and is not to be
//used for this scenario
public class user_of_system {
    private String code;
    private int password;

    public user_of_system(String code, int password) {
        this.code = code;
        this.password = password;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
}
