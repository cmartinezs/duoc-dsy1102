package cl.duoc.cmartinez.ea3.practica;

public class Main {
    public static void main(String[] args) {
        Login login = new Login();
        Controller controller = new Controller(login);
        controller.init();
    }
}
