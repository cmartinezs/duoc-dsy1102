package cl.duoc.cmartinez.controller;

import cl.duoc.cmartinez.model.BookStoreDB;
import cl.duoc.cmartinez.model.UserModel;
import cl.duoc.cmartinez.model.UserStoreDB;
import cl.duoc.cmartinez.view.LibraryView;
import cl.duoc.cmartinez.view.LoginView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Cetecom
 */
public class MainController {

    private final LoginView login;
    private final LibraryView library;
    private final UserStoreDB db;

    public MainController(LoginView login, LibraryView library, UserStoreDB db) {
        this.login = login;
        this.library = library;
        this.db = db;
        this.login.addActionListenerBtnLogin(new LoginButtonActionListener());
    }

    public void showLogin() {
        login.setVisible(true);
    }

    class LoginButtonActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            String username = login.getUsername();
            String pwd = login.getPassword();
            UserModel modelDb = db.findUserByUsername(username);

            if (modelDb == null || !modelDb.getPassword().equals(pwd)) {
                login.setTxtLblMsgError("Bad Credentials");
                return;
            }

            login.dispose();
            System.out.println("Login OK");
            library.setVisible(true);
        }

    }
}
