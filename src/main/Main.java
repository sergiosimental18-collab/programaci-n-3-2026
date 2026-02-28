package main;

import javax.swing.SwingUtilities;
import views.LoginWindow;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new LoginWindow();
        });
    }
}




