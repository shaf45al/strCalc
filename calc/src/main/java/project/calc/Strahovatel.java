package project.calc;

import java.awt.GridLayout;

import javax.swing.JFrame;

public class Strahovatel extends JFrame{

	public Strahovatel(){
		
		setTitle("Страхователь");
		
		setSize(500,400);           

		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);   //указывает что будет при нажатии крестика
		setLocationRelativeTo(null);                      //разместить по середине экрана форму 
		setLayout(new GridLayout());
		
		setVisible(true);                                 //отобразить форму
	}		
}
