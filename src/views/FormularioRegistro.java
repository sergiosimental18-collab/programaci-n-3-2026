package views;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class FormularioRegistro extends JPanel {

    public FormularioRegistro() {
        setLayout(new BorderLayout());
        inicializarComponentes();
    }

    public void inicializarComponentes() {

        JLabel tituloRegistro = new JLabel("Datos Usuarios");
        tituloRegistro.setFont(new Font("Arial", Font.PLAIN, 20));
        tituloRegistro.setHorizontalAlignment(SwingConstants.CENTER);
        add(tituloRegistro, BorderLayout.NORTH);

        JPanel panelComponentes = new JPanel();
        panelComponentes.setLayout(new BoxLayout(panelComponentes, BoxLayout.Y_AXIS));
        panelComponentes.setBorder(BorderFactory.createEmptyBorder(25, 15, 15, 15));

        for (int i = 0; i < 20; i++) {
            JLabel textoCampo = new JLabel("Campo " + i);
            panelComponentes.add(textoCampo);

            JTextField texto = new JTextField(20);
            panelComponentes.add(texto);
        }

        JScrollPane scroll = new JScrollPane(panelComponentes);
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        add(scroll, BorderLayout.CENTER);
    }
}