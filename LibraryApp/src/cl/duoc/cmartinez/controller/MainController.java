package cl.duoc.cmartinez.controller;

import cl.duoc.cmartinez.model.BookStoreDB;
import cl.duoc.cmartinez.model.LoginModel;
import cl.duoc.cmartinez.view.LoginView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Cetecom
 */
public class MainController {

    private final LoginView login;
    private final BookStoreDB db;

    public MainController(LoginView login, BookStoreDB db) {
        this.login = login;
        this.db = db;
        this.login.getBtnLogin().addActionListener(new LoginButtonActionListener());
    }

    public void showLogin() {
        login.setVisible(true);
    }

    class LoginButtonActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            String username = login.getTxtUsername().getText();
            String pwd = new String(login.getPwdField().getPassword());
            LoginModel model = new LoginModel(username, pwd);
            LoginModel modelDb = db.findUserByUsername(model.getUsername());

            if (modelDb == null) {
                login.getLblMsgError().setText("Bad Credentials");
                return;
            }

            if (!modelDb.getPassword().equals(model.getPassword())) {
                login.getLblMsgError().setText("Bad Credentials");
                return;
            }

            // codigo de login exitoso
            login.dispose();
            System.out.println("Login OK");
        }

    }
}
