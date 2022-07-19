package gui.com.create;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.*;

class Mago extends Panel{
	Mago(){
		setBackground(Color.GRAY);
	}
	public void paint(Graphics g) {
		g.setColor(new Color(0,255,0));
		
		g.setFont(new Font("Helvetica",Font.ITALIC,16));
		
		g.drawString("Hello GUI World!", 30, 100); 
		g.setColor(new Color(1.0f,0,0)); //red 
		g.fillRect(30, 100, 150, 10);
         
	}
}

public class SampleFrame {

	public static void main(String[] args) {
				Frame f=new Frame("Testing");
				Mago s=new Mago();
				f.add(s);
				f.setSize(600,300);
				f.setVisible(true);
				
	}

}
