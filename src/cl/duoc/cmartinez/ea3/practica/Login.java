package cl.duoc.cmartinez.ea3.practica;

import javax.swing.*;

public class Login extends JFrame{
    private JPanel contentPane;
    private JTextField txtUsername;
    private JPasswordField txtPassword;

    public Login() {
        setContentPane(contentPane);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(false);
    }

}
