package project.calc;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class OsnF extends JFrame {
	public OsnF(){
		setTitle("Добро пожаловать!  Выберите пользователя: ");
		
		setSize(600,400);           

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
		setLocationRelativeTo(null);                      
		setLayout(new BorderLayout());
		
		setVisible(true);

	}
}