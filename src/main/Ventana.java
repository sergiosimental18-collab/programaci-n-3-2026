package main;


import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Ventana extends JFrame {
	
	public Ventana() {
		
		setSize(100, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(50,500);
		
		setResizable(false);
		
		setTitle("Mi aplicacion");
		
		setLocationRelativeTo(null);
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		Image myIcon = tk.getImage(getClass().getResource("/img/WhatsApp.png"));
		setIconImage(myIcon);
		
		Panel panelito = new Panel();
		add(panelito);
		
		
		setVisible(true);
		
		
		 
	}
	

}

/*
package main;

import javax.swing.JFrame;

public class Ventana extends JFrame{
	
	public Ventana() {
		setSize(500,500); //Establece el tamaño
		//Termina la ejecución del programa al cerrar la ventana.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Establece el lugar donde aparecerá la ventana
		setLocation(100,100); 
		//Establece la ubicación y el tamaño de la ventana 
		//setBounds(100,100,500,500);
		//Establece si la ventana puede redimensionarse
		setResizable(false);
		//Cambia el título de la ventana
		setTitle("Mi Aplicación");
		//Coloca la ventana al centro de la pantalla
		setLocationRelativeTo(null);
		
		setVisible(true); //Establece visibilidad
	}
	
}
*/
