import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Pratyay {
	
 JFrame frame = new JFrame();
 JLabel label= new JLabel();
 JLabel label1= new JLabel();
 JLabel label2= new JLabel();
 JLabel label3= new JLabel();
ImageIcon icon4 = new ImageIcon("bgbg.png");
 
 Pratyay(){
	    frame = new JFrame();
	    frame.setBackground(Color.black);
		frame.setTitle("BioPage");
		frame.setLayout(null);
		frame.setSize(500,500);
		
		 // read in image
		label.setBounds(0,0,500,500);
		label.setIcon(icon4); // put image on label
		
		label1 = new JLabel("Hello i am Pratyay");
		label1.setBounds(150, 10, 200, 20);
		label1.setBackground(Color.orange);
		
		label2 = new JLabel("I am B.tech student");
		label2.setBounds(150, 40, 200, 20);
		label2.setBackground(Color.pink);
		
		label3 = new JLabel("My regd. no. is 20010403");
		label3.setBounds(150, 70, 200, 20);
		label3.setBackground(Color.yellow);
		
		label1.setOpaque(true);
		label2.setOpaque(true);
		label3.setOpaque(true);
		label.setOpaque(true);
		
		frame.add(label);
		label.add(label1);
		label.add(label2);
		label.add(label3);
//		frame.add(label1);
//		frame.add(label3);
//		
//		frame.add(label2);
		
		
		
		frame.setVisible(true);
 }
 
}
