package hallo;
/*
import java.awt.*;
import javax.swing.*;

public class Fenster extends JFrame {
	
	JFrame w;
	
	public Fenster() {
		w = new JFrame();
		w.setIconImage(Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("viergewinnticon.png")));
		w.setTitle("VIER GEWINNT");
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		w.setSize(800, 600);
		w.setLocationRelativeTo(null);
		w.setResizable(false);
		
		JPanel menu = new JPanel();
		w.add(menu);

		JButton start = new JButton("Start Game");
		start.setBackground(Color.BLUE);
		start.setForeground(Color.WHITE);
		start.setFocusPainted(false);
		start.setFont(new Font("Tahoma", Font.BOLD, 12));
		JButton regeln = new JButton("Regeln");
		regeln.setBackground(Color.BLUE);
		regeln.setForeground(Color.WHITE);
		regeln.setFocusPainted(false);
		regeln.setFont(new Font("Tahoma", Font.BOLD, 12));
		JButton exit = new JButton("Exit Game");
		exit.setBackground(Color.BLUE);
		exit.setForeground(Color.WHITE);
		exit.setFocusPainted(false);
		exit.setFont(new Font("Tahoma", Font.BOLD, 12));
		JLabel label = new JLabel();
			
		label.setText("---");

		menu.add(start);
		menu.add(regeln);
		menu.add(exit);

		Controller c = new Controller();
		start.addActionListener(c);
		regeln.addActionListener(c);
		exit.addActionListener(c);		
		
		Spielfeld spielfeld = new Spielfeld();
		getContentPane().add(spielfeld, BorderLayout.CENTER);
		
		
		w.setVisible(true);
	}

}
*/