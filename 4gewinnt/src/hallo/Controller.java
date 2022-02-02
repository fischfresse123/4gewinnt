package hallo;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;



public class Controller implements ActionListener {
	JButton Start = new JButton("Start Game");
	JButton regeln = new JButton("Regeln");
	JButton exit = new JButton("Exit Game");
	JFrame w = new JFrame();
	Controller() {
		w.setIconImage(Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("viergewinnticon.png")));
		w.setTitle("VIER GEWINNT");
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		w.setSize(800, 600);
		w.setLocationRelativeTo(null);
		w.setResizable(false);

		JPanel menu = new JPanel();
		w.add(menu);

		
		Start.setBackground(Color.BLUE);
		Start.setForeground(Color.WHITE);
		Start.setFocusPainted(false);
		Start.setFont(new Font("Tahoma", Font.BOLD, 12));
		Start.addActionListener(this);
		
		regeln.setBackground(Color.BLUE);
		regeln.setForeground(Color.WHITE);
		regeln.setFocusPainted(false);
		regeln.setFont(new Font("Tahoma", Font.BOLD, 12));
		regeln.addActionListener(this);
		
		exit.setBackground(Color.BLUE);
		exit.setForeground(Color.WHITE);
		exit.setFocusPainted(false);
		exit.setFont(new Font("Tahoma", Font.BOLD, 12));
		exit.addActionListener(this);

		menu.add(Start);
		menu.add(regeln);
		menu.add(exit);

		w.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == Start) {
			w.dispose();
			Spielfeld spielfeld = new Spielfeld();
		} else if (e.getSource() == regeln) {
			JOptionPane.showMessageDialog(null,
					"Jeder Spieler besitzt 21 gleichfarbige Spielsteine. Wenn ein Spieler einen Spielstein in eine Spalte fallen lässt, \n besetzt dieser den untersten freien Platz der Spalte. \n Gewinner ist der Spieler, der es als erster schafft, vier oder mehr seiner \n Spielsteine waagerecht, senkrecht oder diagonal in eine Linie zu bringen. Das Spiel endet unentschieden, \n wenn das Spielbrett komplett gefüllt ist, ohne dass ein Spieler eine Viererlinie gebildet hat.",
					"Regeln", JOptionPane.INFORMATION_MESSAGE);
			System.out.println("Hallo");
		} else if (e.getSource() == exit) {
			System.exit(0);

		}
	}
}
