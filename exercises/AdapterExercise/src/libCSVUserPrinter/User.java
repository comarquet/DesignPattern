package libCSVUserPrinter;

public class User {
    /**
     * Full name of the user (first name and last name)
     */
    String name;

    String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
