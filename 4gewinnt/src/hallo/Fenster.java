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
		JButton regeln = new JButton("Regeln");
		JButton exit = new JButton("Exit Game");
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
