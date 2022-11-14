import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.*;


public class LoginPage implements ActionListener {

	JFrame frame = new JFrame();
	JButton lbutton = new JButton("Login");
	JButton rbutton = new JButton("Reset");
	JTextField userIdField = new JTextField();
	JPasswordField userPassfield =new JPasswordField();
	JLabel label = new JLabel();
	JLabel IdLabel = new JLabel("UsserID");
	JLabel PassLabel = new JLabel("Password");
	JLabel messageLabel = new JLabel();
	ImageIcon icon4 = new ImageIcon("bgb.png");
	
	
	HashMap<String,String> logininfo = new HashMap<String,String>();

	LoginPage(HashMap<String,String> logininfoOriginal){
		
		logininfo = logininfoOriginal;
		
		label.setBounds(0,0,500,500);
		label.setIcon(icon4);
		
		
		IdLabel.setBounds(50, 100, 75, 25);
		PassLabel.setBounds(50, 150, 75, 25);
		messageLabel.setBounds(125, 250, 250, 35);
		messageLabel.setFont(new Font(null, Font.ITALIC,25));
		
		userIdField.setBounds(125,100,200,25);
		userPassfield.setBounds(125, 150, 200, 25);
		
		lbutton.setBounds(125,  200, 100, 25);
		lbutton.addActionListener(this);
		lbutton.setFocusable(false);
		
		
		rbutton.setBounds(225,  200, 100, 25);
		rbutton.addActionListener(this);
		rbutton.setFocusable(false);
		
		frame.add(label);
		
		label.add(lbutton);
		label.add(rbutton);
		label.add(userIdField);
		label.add(userPassfield);
		label.add(messageLabel);
		label.add(PassLabel);
		label.add(IdLabel);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}

	
	public void actionPerformed(ActionEvent e) {
	
		if(e.getSource()==rbutton) {
			userIdField.setText("");
			userPassfield.setText("");
		}
		
		if(e.getSource()==lbutton) {
			
			String userId = userIdField.getText();
			String password = String.valueOf(userPassfield.getPassword());
		
		if(logininfo.containsKey(userId)) {
			if(logininfo.get(userId).equals(password)) {
				messageLabel.setForeground(Color.green);
				messageLabel.setText("Login Successfully");
				frame.dispose();
				ImagePage welcome = new ImagePage();
			}
			else {
				messageLabel.setForeground(Color.red);
				messageLabel.setText("Wrong Password");
				
			}
		}
		else {
			messageLabel.setForeground(Color.red);
			messageLabel.setText("Username Not found!");
		}
		
		}
	}
}
		
	

