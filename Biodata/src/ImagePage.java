import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ImagePage implements ActionListener {
	
	JFrame frame = new JFrame();
	JLabel label = new JLabel();
	JLabel label1 = new JLabel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	ImageIcon icon = new ImageIcon("picG.png");
	ImageIcon icon2 = new ImageIcon("PicK.png");
	ImageIcon icon3 = new ImageIcon("PicP.png");
	ImageIcon icon4 = new ImageIcon("PicPr.png");
	ImageIcon icon5 = new ImageIcon("bgb.png");
	
	ImagePage(){
		frame = new JFrame();
		frame.setTitle("ImagePage");
		frame.setLayout(null);
		frame.setSize(500,500);
		
		label1.setBounds(0,0,500,500);
		label1.setIcon(icon5);
		
		
		button1 = new JButton("Gourav");
		button1.setBounds(20, 10, 200, 200);
		button1.setFocusable(false);
		button1.addActionListener(this);
		button1.setIcon(icon);
		button1.setText("Gourav");
		button1.setHorizontalTextPosition(JButton.CENTER);
		button1.setVerticalTextPosition(JButton.BOTTOM);
		button1.setFont(new Font("Comic Sans" , Font.BOLD , 15));
		
		
		button2 = new JButton("Konisha");
		button2.setBounds(230, 10, 200, 200);
		button2.setFocusable(false);
		button2.addActionListener(this);
		button2.setText("Konisha");
		button2.setHorizontalTextPosition(JButton.CENTER);
		button2.setVerticalTextPosition(JButton.BOTTOM);
		button2.setIcon(icon2);
		
		button3 = new JButton("Pratyay");
		button3.setBounds(20, 220, 200, 200);
		button3.setFocusable(false);
		button3.addActionListener(this);
		button3.setIcon(icon3);
		button3.setText("Pratyay");
		button3.setHorizontalTextPosition(JButton.CENTER);
		button3.setVerticalTextPosition(JButton.BOTTOM);
		button3.setFont(new Font("Comic Sans" , Font.BOLD , 15));
		
		button4 = new JButton("Priti");
		button4.setBounds(230, 220, 200, 200);
		button4.setFocusable(false);
		button4.addActionListener(this);
		button4.setIcon(icon4);
		button4.setText("Priti");
		button4.setHorizontalTextPosition(JButton.CENTER);
		button4.setVerticalTextPosition(JButton.BOTTOM);
		button4.setFont(new Font("Comic Sans" , Font.BOLD , 15));
		
		frame.add(label1);
		
		
		label1.add(label);
		label1.add(button1);
		label1.add(button2);
		label1.add(button3);
		label1.add(button4);
		frame.setVisible(true);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button1) {
			frame.dispose();
			BioPage bio = new BioPage();
		}
		if(e.getSource()==button2) {
			frame.dispose();
			Konisha kr = new Konisha();
		}
		if(e.getSource()==button3) {
			frame.dispose();
			Pratyay prt = new Pratyay();
		}
		if(e.getSource()==button4) {
			frame.dispose();
			Priti pr = new Priti();
		}
		
	}

}
