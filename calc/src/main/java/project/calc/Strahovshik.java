package project.calc;

import java.awt.FlowLayout;

import javax.swing.JFrame;

public class Strahovshik extends JFrame {

	public Strahovshik(){
		setTitle("Страховщик");
		
		setSize(600,400);           

		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);   //указывает что будет при нажатии крестика
		setLocationRelativeTo(null);                      //разместить по середине экрана форму 
		setLayout(new FlowLayout());
		
		setVisible(true);  

	}
}
