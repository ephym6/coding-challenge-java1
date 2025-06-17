public class Admin extends Account {
    // A private string specified only with the Admin
    public String AuthPassword;

    public Admin(int id, String name, String password) { // Constructor
        this.id = id;
        this.name = name;
        this.AuthPassword = password;
    }
}