package cl.duoc.cmartinez.model;

/**
 *
 * @author Cetecom
 */
public class UserModel {
    private final String username;
    private final String password;

    public UserModel(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
