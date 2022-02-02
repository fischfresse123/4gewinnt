package hallo;

import java.awt.*;
import javax.swing.*;

public class Fenster extends JFrame {
	public Fenster() {
		setTitle("VIER GEWINNT");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 400);

		JPanel menu = new JPanel();
		add(menu);

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
	}

}
