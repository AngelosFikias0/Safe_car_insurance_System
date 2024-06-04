//This is a class used in the class diagramm and is not to be
//used for this scenario
import java.util.ArrayList;

public class user_list {
    private ArrayList<user> users;

    public user_list() {
        this.users = new ArrayList<>();
    }

    public void check() {
    }

    public ArrayList<user> getUsers() {
        return users;
    }

    public void addUser(user user) {
        users.add(user);
    }

    public void removeUser(user user) {
        users.remove(user);
    }
}
