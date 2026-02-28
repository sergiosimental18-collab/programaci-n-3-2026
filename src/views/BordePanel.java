package views;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class BordePanel {

    public static void aplicar(JPanel panel, String titulo) {
        Border emptyBorder = BorderFactory.createEmptyBorder(10, 10, 10, 10);
        Border titledBorder = BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(Color.BLACK, 2),
                titulo,
                TitledBorder.CENTER, TitledBorder.TOP,
                new Font("Arial", Font.BOLD, 14),
                Color.BLACK);
        panel.setBorder(BorderFactory.createCompoundBorder(emptyBorder, titledBorder));
    }
}