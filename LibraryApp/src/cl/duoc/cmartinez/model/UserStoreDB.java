/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.cmartinez.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cmartinezs
 */
public class UserStoreDB {
    
    private final List<UserModel> users = new ArrayList<>();

    public UserStoreDB() {
        users.add(new UserModel("user1", "12341234"));
        users.add(new UserModel("user2", "12345"));
        users.add(new UserModel("user3", "98765"));
        users.add(new UserModel("user4", "000000"));
    }

    public UserModel findUserByUsername(String username) {
        for(UserModel model: users) {
            if(model.getUsername().equals(username)){
                return model;
            }
        }
        return null;
    }
}
