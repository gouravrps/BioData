import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Konisha {

	JFrame frame = new JFrame();
	 
	 JLabel label= new JLabel();
	 JLabel label1= new JLabel();
	 JLabel label2= new JLabel();
	 JLabel label3= new JLabel();
	 ImageIcon icon4 = new ImageIcon("bgbg.png");
	 
	 Konisha(){
		    frame = new JFrame();
			frame.setTitle("BioPage");
			frame.setLayout(null);
			frame.setSize(500,500);
			
			label3.setBounds(0,0,500,500);
			label3.setIcon(icon4);
			
			label = new JLabel();
			label .setText("Hello I am Konisha");
			label.setBounds(150, 10, 200, 20);
			label.setBackground(Color.orange);
			frame.add(label);
			
			label2 = new JLabel("I am B.tech student");
			label2.setBounds(150, 40, 200, 20);
			label2.setBackground(Color.pink);
			
			label1 = new JLabel("My regd. no. is 20010334");
			label1.setBounds(150, 70, 200, 20);
			label1.setBackground(Color.yellow);
			
			
			label1.setOpaque(true);
			label2.setOpaque(true);
			label.setOpaque(true);
			label3.setOpaque(true);
			
			frame.add(label3);
			label3.add(label);
			label3.add(label2);
			label3.add(label1);
			
//			frame.add(label2);
//			frame.add(label1);
			
			frame.setVisible(true);
	 }
}
