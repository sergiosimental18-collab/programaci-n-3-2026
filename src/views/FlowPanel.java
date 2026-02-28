package views;

import javax.swing.JButton;
import javax.swing.JPanel;

public class FlowPanel extends JPanel {

    public FlowPanel(int cantidad) {
        JButton[] buttons = new JButton[cantidad];
        for (int i = 0; i < cantidad; i++) {
            buttons[i] = new JButton(String.valueOf(i));
            add(buttons[i]);
        }
    }
}