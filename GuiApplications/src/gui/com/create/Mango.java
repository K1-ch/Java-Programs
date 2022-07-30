package gui.com.create;
import java.awt.Color.*;
import java.awt.event.*;

import javax.swing.JFrame;

import java.awt.*;

class Fruit extends Frame implements ActionListener{
		TextField tf;
	Fruit(){
		
		tf=new TextField();
		tf.setBounds(200, 220, 320, 110);
		Button b=new Button("Click Me");
		b.setBounds(200,200,220,100);
	
      b.addActionListener(this);
	
	add(tf);
	add(b);
	setSize(300,300);
	setVisible(true);
	setLayout(null);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		tf.setText("Welcome Kiran ");
		
	}
	
}

public class Mango {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jframe = new JFrame();
		jframe.getContentPane().setBackground(Color.BLUE);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.pack();
		jframe.setVisible(true);
new Fruit();
	}

}
