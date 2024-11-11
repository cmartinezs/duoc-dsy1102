/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cl.duoc.cmartinez.ea3.actividad1;

/**
 *
 * @author Cetecom
 */
public class Gui {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println("Antes Login");
        Login l = new Login();
        l.setVisible(true);
        l.waitForSuccess(new MainFrame());
        /*System.out.println("Despues Login");
        System.out.println("Antes MainFrame");
        new MainFrame().setVisible(true);
        System.out.println("Despues MainFrame");*/
    }
    
}
