package views;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class MainView extends JFrame {
	
	JTextArea textArea = new JTextArea(5, 30);
	JScrollPane scrollPane = new JScrollPane(textArea);

}