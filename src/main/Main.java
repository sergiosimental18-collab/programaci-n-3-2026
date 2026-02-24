
package main;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		JFrame ventanita = new JFrame();
		ventanita.setVisible(true);
		ventanita.setSize(500,500);
		ventanita.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventanita.setLocationRelativeTo(null);
		ventanita.setTitle("Mi aplicacion");
		
		JPanel panelito = new JPanel();
		panelito.setBackground(Color.gray);
		ventanita.add(panelito);
				
		
	}

}
