package cl.duoc.cmartinez;

import cl.duoc.cmartinez.controller.MainController;
import cl.duoc.cmartinez.model.BookStoreDB;
import cl.duoc.cmartinez.view.LoginView;

/**
 *
 * @author cmartinezs
 */
public class LibraryApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Creando controller");
        MainController ctrl = new MainController(new LoginView(), new BookStoreDB());
        System.out.println("Mostrando login");
        ctrl.showLogin();
    }
    
}
