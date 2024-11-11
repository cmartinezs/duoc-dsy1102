package cl.duoc.cmartinez.ea3.practica;

public class Controller {
    private final Login login;

    public Controller(Login login) {
        this.login = login;
    }

    public void init() {
        login.setVisible(true);
    }
}
