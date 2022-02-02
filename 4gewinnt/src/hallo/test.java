package hallo;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

			// Everything already has been explained on the Menu Method.

public class test implements ActionListener { // Action listener implemented for button usage
	
	JButton Exit = new JButton("Return"); // Return-Button created 
	ImageIcon image = new ImageIcon("C4.png"); // create Icon
	JFrame frame = new JFrame(); // create frame
	
	JLabel Background = new JLabel(); // create Background of frame 
	

	
	test(){
		
		Background.setBackground(new Color(65, 90, 105)); // Background-color chosen 
		Background.setOpaque(true);  // Background color visible
		Background.add(Exit);	// added Return Button
		
		// Start of adding Button
		Exit.setBounds(0,0, 70, 40);  
		Exit.setFocusable(false); 
		Exit.addActionListener(this);
		Exit.setBorder(BorderFactory.createLineBorder(Color.BLACK)); 
		Exit.setBackground(new Color(247, 102, 69)); 
		Exit.setForeground(Color.white); 
		Exit.setFont(new Font("SansSerif",Font.BOLD,20)); 
		// Ending of adding Button 
	    
	    // Start of frame configuration 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		frame.setTitle("Vier Gewinnt");
		frame.setResizable(false);
		frame.setVisible(true);
		frame.add(Background);
		frame.setIconImage(image.getImage());
		frame.setLocationRelativeTo(null);
		// End of frame configuration 
	}

	// Start of ActionListener/ActionPerformed Method 
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==Exit) { 
			frame.dispose(); 
			}
		
	}
	// End of ActionListener/ActionPerformed Method
}
