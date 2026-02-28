package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class LoginView extends JPanel {

    public LoginView() {
        setBackground(new Color(245, 245, 245));
        setLayout(new BorderLayout());
        inicializarComponentes();
        bordePanel();
    }

    public void inicializarComponentes() {
        JPanel panelCentro = new JPanel(new BorderLayout());
        panelCentro.setBackground(new Color(245, 245, 245));

        JPanel panelCampos = new JPanel();
        panelCampos.setLayout(new BoxLayout(panelCampos, BoxLayout.Y_AXIS));
        panelCampos.setBackground(new Color(245, 245, 245));
        panelCampos.add(Box.createVerticalStrut(100));
        panelCampos.add(ingresarCorreo());
        panelCampos.add(Box.createVerticalStrut(10));
        panelCampos.add(ingresarContrasena());

        panelCentro.add(panelCampos, BorderLayout.CENTER);
        add(panelCentro, BorderLayout.CENTER);
        add(boton(), BorderLayout.SOUTH);
    }

    public JPanel boton() {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(new Color(245, 245, 245));

        JPanel panelBoton = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panelBoton.setBackground(new Color(245, 245, 245));
        JButton boton = new JButton("INGRESAR");
        boton.setPreferredSize(new Dimension(125, 45));
        panelBoton.add(boton);
        panel.setBorder(BorderFactory.createEmptyBorder(0, 0, 30, 0));
        panel.add(panelBoton, BorderLayout.CENTER);

        return panel;
    }

    public JPanel ingresarCorreo() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBackground(new Color(245, 245, 245));

        JLabel txtNombre = new JLabel("Correo electronico");
        txtNombre.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        txtNombre.setForeground(Color.BLACK);
        txtNombre.setAlignmentX(CENTER_ALIGNMENT);
        panel.add(txtNombre);
        panel.add(Box.createVerticalStrut(5));

        JTextField textField = new JTextField();
        textField.setFont(new Font("Arial", Font.PLAIN, 16));
        textField.setMaximumSize(new Dimension(280, 35));
        textField.setAlignmentX(CENTER_ALIGNMENT);
        panel.add(textField);

        JLabel textoError = new JLabel("Se requiere un correo");
        textoError.setFont(new Font("Arial", Font.PLAIN + Font.ITALIC, 12));
        textoError.setForeground(Color.RED);
        textoError.setAlignmentX(CENTER_ALIGNMENT);
        panel.add(textoError);

        return panel;
    }

    public JPanel ingresarContrasena() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBackground(new Color(245, 245, 245));

        JLabel txtcontrasena = new JLabel("Contraseña");
        txtcontrasena.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        txtcontrasena.setForeground(Color.BLACK);
        panel.add(Box.createVerticalStrut(10));
        txtcontrasena.setAlignmentX(CENTER_ALIGNMENT);
        panel.add(txtcontrasena);
        panel.add(Box.createVerticalStrut(10));

        JPasswordField contrasena = new JPasswordField();
        contrasena.setFont(new Font("Arial", Font.PLAIN, 16));
        contrasena.setMaximumSize(new Dimension(280, 35));
        contrasena.setAlignmentX(CENTER_ALIGNMENT);
        panel.add(contrasena);

        JLabel textoErrorContrasena = new JLabel("Se require una contraseña");
        textoErrorContrasena.setFont(new Font("Arial", Font.PLAIN + Font.ITALIC, 12));
        textoErrorContrasena.setForeground(Color.RED);
        textoErrorContrasena.setAlignmentX(CENTER_ALIGNMENT);
        panel.add(textoErrorContrasena);

        return panel;
    }

    public void bordePanel() {
        Border emptyBorder = BorderFactory.createEmptyBorder(10, 10, 10, 10);
        Border panelTitledBorder = BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(Color.BLACK, 2),
                "Bienvenid@s!", TitledBorder.CENTER, TitledBorder.TOP,
                new Font("Arial", Font.BOLD, 14), Color.BLACK);
        this.setBorder(BorderFactory.createCompoundBorder(emptyBorder, panelTitledBorder));
    }
}