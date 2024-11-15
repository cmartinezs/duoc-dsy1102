package cl.duoc.cmartinez.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cetecom
 */
public class BookStoreDB {
    
    private final List<LoginModel> users = new ArrayList<>();
    
    public BookStoreDB() {
        users.add(new LoginModel("user1", "12341234"));
        users.add(new LoginModel("user2", "12345"));
        users.add(new LoginModel("user3", "98765"));
        users.add(new LoginModel("user4", "000000"));
    }

    public LoginModel findUserByUsername(String username) {
        for(LoginModel model: users) {
            if(model.getUsername().equals(username)){
                return model;
            }
        }
        return null;
    }
   
}
