package gui_with_swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class Calc extends JFrame implements ActionListener{
	
	JTextField tf1, tf2, tf3;
	JLabel l1, l2, l3;
	JButton btn1, btn2, btn3, btn4;
	
	Calc(){
		l1 = new JLabel("First Value");
		l2 = new JLabel("Second Value");
		l3 = new JLabel("Result");
		
		tf1 = new JTextField(10);
		tf2 = new JTextField(10);
		tf3 = new JTextField(10);
		
		btn1 = new JButton("Add");
		btn2 = new JButton("Subtract");
		btn3 = new JButton("Multiply");
		btn4 = new JButton("Divide");
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		
		setLayout(new FlowLayout(FlowLayout.LEFT, 150, 10));
		add(l1);
		add(tf1);
		add(l2);
		add(tf2);
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(l3);
		add(tf3);
		
		setSize(400, 350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		try {
			int x = Integer.parseInt(tf1.getText());
			int y = Integer.parseInt(tf2.getText());
			int z = 0;
			
			String command = e.getActionCommand();
			
			switch(command) {
			case "Add" :
				z = x + y;
				break;
				
			case "Subtract":
				z = x - y;
				break;
				
			case "Multiply":
				z = x * y;
				break;
				
			case "Divide":
				if(y!=0) {
					z = x / y;
				} else {
					tf3.setText("Cannot Divide By Zero");
					return;
				}
				break;
			}
			
			tf3.setText(String.valueOf(z));
		} catch (NumberFormatException ex) {
			tf3.setText("Invalid Input");
		}
		
		
	}
}


public class Calculator {
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Calc();
	}

}
