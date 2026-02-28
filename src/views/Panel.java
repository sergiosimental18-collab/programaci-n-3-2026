package views;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Panel extends JPanel {

    public Panel() {
        setBackground(new Color(210, 16, 35));
        setLayout(null);

        JButton button = new JButton("My button");
        button.setBounds(10, 10, 200, 50);
        add(button);
    }
}


