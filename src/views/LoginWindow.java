package views;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class LoginWindow extends JFrame {

    public LoginWindow() {
        setSize(600, 480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(true);
        setTitle("SneakerShop");

        Toolkit tk = Toolkit.getDefaultToolkit();
        Image myIcon = tk.getImage("src/image/logoventana.png");
        setIconImage(myIcon);

        LoginView panelLogin = new LoginView();
        add(panelLogin);

        setVisible(true);
    }
}