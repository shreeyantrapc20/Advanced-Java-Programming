package swing;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SwingDemo extends JFrame {
		JLabel  l;
		JTextField t;
		public SwingDemo() {
			setSize(600,400);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("Name");
			setLayout(null);
			l = new JLabel("Enter Name");
			t = new JTextField(15);
			l.setBounds(150,100,100,30);
			add(l);
			t.setBounds(225,100,100,30);
			add(t);
			setVisible(true);
		}
		
	public static void main(String[] args) {
		new SwingDemo();
		
}
}
