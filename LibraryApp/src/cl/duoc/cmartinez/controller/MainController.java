package cl.duoc.cmartinez.controller;

import cl.duoc.cmartinez.model.BookModel;
import cl.duoc.cmartinez.model.UserModel;
import cl.duoc.cmartinez.model.dao.BookDAO;
import cl.duoc.cmartinez.model.dao.UserDAO;
import cl.duoc.cmartinez.view.LibraryView;
import cl.duoc.cmartinez.view.LoginView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cetecom
 */
public class MainController {

    private final LoginView login;
    private final LibraryView library;
    private final UserDAO userDao;
    private final BookDAO bookDao;

    public MainController(LoginView login, LibraryView library, UserDAO userDao, BookDAO bookDao) {
        this.login = login;
        this.library = library;
        this.userDao = userDao;
        this.bookDao = bookDao;
        this.login.addActionListenerBtnLogin(new LoginButtonActionListener());
        this.library.addActionListenerMenuItemLibraryStock(new MenuItemLibraryStockActionListener());
        this.library.addActionListenerMenuItemLibraryAddBook(new MenuItemLibraryAddBookActionListener());
        this.library.addActionListenerAddBookPanelBtnCancel(new BtnCancelAddBookActionListener());
        this.library.addActionListenerAddBookPanelBtnSave(new BtnSaveAddBookActionListener());
        this.library.addActionListenerStockPanelBtnDelete(new BtnDeleteStockActionListener());
    }

    public void showLogin() {
        login.setVisible(true);
    }
    
    public void showLibrary(){
        library.setVisible(true);
    }

    class LoginButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent ae) {

            String username = login.getUsername();
            String pwd = login.getPassword();
            UserModel modelDb = userDao.findByUsername(username);

            if (modelDb == null || !modelDb.getPassword().equals(pwd)) {
                login.setTxtLblMsgError("Bad Credentials");
                return;
            }

            login.dispose();
            System.out.println("Login OK");
            library.setVisible(true);
        }
    }

    class MenuItemLibraryStockActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            library.cleanTableBook();
            try {
                List<BookModel> books = bookDao.findAll();
                for(BookModel model: books){
                    library.addRowToBookTable(
                            model.getIsbn(),
                            model.getAuthor(),
                            model.getTitle()
                    );
                }
            } catch (SQLException ex) {
                Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
            }
            library.setVisibleTableBook();
        }

    }

    class MenuItemLibraryAddBookActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            library.setVisibleFormAddBook();
        }

    }
    
    class BtnCancelAddBookActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            library.removeComponentsMainPanel();
        }
    }
    
    class BtnSaveAddBookActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            String author = library.getAuthor();
            String title = library.getBookTitle();
            String isbn = library.getISBN();
            //java.sql.Date publication = library.getPublication();
            double price = library.getPrice();
            boolean isAvailable = library.getAvailability();
            boolean ok = false;
            try {
                ok = bookDao.insert(author, title, isbn, price, isAvailable);
            } catch (SQLException ex) {
                Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            if (ok) {
                library.clickMenuItemStock();
            }
        }
    }
    
    class BtnDeleteStockActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            String isbn = library.getSelectedIsbnInBookTable();
            if(isbn.equals("")){
                return;
            }
            
            try {
                int rowCount = bookDao.delete(isbn);
                if (rowCount > 0) {
                    library.clickMenuItemStock();
                }
            } catch (SQLException ex) {
                Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
}
