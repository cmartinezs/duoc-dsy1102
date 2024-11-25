package cl.duoc.cmartinez.model;

import java.util.Map;

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

    public UserModel(Map<String, Object> row) {
        if (!row.containsKey("username") || !row.containsKey("password")) {
            throw new IllegalArgumentException("Missing required fields: username and/or password");
        }
        this.username = (String) row.get("username");
        this.password = (String) row.get("password");
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
